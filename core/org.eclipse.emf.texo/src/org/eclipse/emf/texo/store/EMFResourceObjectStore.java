package org.eclipse.emf.texo.store;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.texo.component.ComponentProvider;
import org.eclipse.emf.texo.converter.EMFModelConverter;
import org.eclipse.emf.texo.converter.ModelEMFConverter;

/**
 * An object store which loads the dataset from an EMF resource and persists/saves it in the same uris.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class EMFResourceObjectStore extends MemoryObjectStore {

  private Resource resource;
  private ResourceSet resourceSet;

  /**
   * Loads the underlying resource in memory
   */
  @Override
  public void begin() {
    resource = createResource();
    try {
      resource.load(getResourceLoadOptions());
      final List<EObject> eObjects = new ArrayList<EObject>();
      final Iterator<EObject> iterator = resource.getAllContents();
      while (iterator.hasNext()) {
        eObjects.add(iterator.next());
      }

      EMFModelConverter emfModelConverter = ComponentProvider.getInstance().newInstance(EMFModelConverter.class);
      final List<Object> content = emfModelConverter.convert(eObjects);
      // add the data
      addData(content);
    } catch (IOException e) {
      throw new IllegalStateException(e);
    }
  }

  protected Map<?, ?> getResourceLoadOptions() {
    return Collections.emptyMap();
  }

  protected Map<?, ?> getResourceSaveOptions() {
    return Collections.emptyMap();
  }

  protected Resource createResource() {
    resourceSet = new ResourceSetImpl();
    final org.eclipse.emf.common.util.URI emfURI = URI.createURI(getUri().toString());
    return resourceSet.getResource(emfURI, false);
  }

  /**
   * Method to indicate that a transaction can be committed by the underlying implementation.
   */
  @Override
  public void commit() {
    try {
      resource.getContents().clear();
      ModelEMFConverter modelEMFConverter = ComponentProvider.getInstance().newInstance(ModelEMFConverter.class);
      for (List<Object> objs : getData().values()) {
        resource.getContents().addAll(modelEMFConverter.convert(objs));
      }
      resource.save(getResourceSaveOptions());
    } catch (IOException e) {
      throw new IllegalStateException(e);
    }
  }

  /**
   * Method to indicate that a transaction can be rolled back by the underlying implementation.
   */
  @Override
  public void rollback() {
    resource.unload();
    resource = null;
  }

  /**
   * Method to indicate that the underlying implementation can be closed.
   */
  @Override
  public void close() {
    resource = null;
  }

}
