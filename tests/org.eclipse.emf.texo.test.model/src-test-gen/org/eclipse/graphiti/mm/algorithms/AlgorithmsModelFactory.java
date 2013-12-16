package org.eclipse.graphiti.mm.algorithms;

import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.AbstractModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.graphiti.mm.MmModelFactory;
import org.eclipse.graphiti.mm.algorithms.styles.Color;
import org.eclipse.graphiti.mm.algorithms.styles.Font;
import org.eclipse.graphiti.mm.algorithms.styles.LineStyle;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.algorithms.styles.Point;
import org.eclipse.graphiti.mm.algorithms.styles.RenderingStyle;
import org.eclipse.graphiti.mm.algorithms.styles.Style;
import org.eclipse.graphiti.mm.algorithms.styles.TextStyleRegion;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;

/**
 * The <b>{@link ModelFactory}</b> for the types of this model: algorithms. It contains code to create instances
 * {@link ModelObject} wrappers and instances for EClasses and convert objects back and forth from their String (XML)
 * representation. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class AlgorithmsModelFactory implements ModelFactory {

  /**
   * Creates an instance for an {@link EClass} <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param eClass
   *          creates a Object instance for this EClass
   * @return an object representing the eClass
   * @generated
   */
  public Object create(EClass eClass) {
    switch (eClass.getClassifierID()) {
    case AlgorithmsModelPackage.POLYLINE_CLASSIFIER_ID:
      return createPolyline();
    case AlgorithmsModelPackage.ELLIPSE_CLASSIFIER_ID:
      return createEllipse();
    case AlgorithmsModelPackage.TEXT_CLASSIFIER_ID:
      return createText();
    case AlgorithmsModelPackage.POLYGON_CLASSIFIER_ID:
      return createPolygon();
    case AlgorithmsModelPackage.RECTANGLE_CLASSIFIER_ID:
      return createRectangle();
    case AlgorithmsModelPackage.ROUNDEDRECTANGLE_CLASSIFIER_ID:
      return createRoundedRectangle();
    case AlgorithmsModelPackage.IMAGE_CLASSIFIER_ID:
      return createImage();
    case AlgorithmsModelPackage.PLATFORMGRAPHICSALGORITHM_CLASSIFIER_ID:
      return createPlatformGraphicsAlgorithm();
    case AlgorithmsModelPackage.MULTITEXT_CLASSIFIER_ID:
      return createMultiText();
    default:
      throw new IllegalArgumentException("The EClass '" + eClass.getName()
          + "' is not a valid EClass for this EPackage");
    }
  }

  /**
   * Wraps an object in a {@link ModelObject}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param eClass
   *          the EClass of the object
   * @param adaptee
   *          the object being wrapped/adapted
   * @return the wrapper {@link ModelObject}
   * @generated
   */
  @SuppressWarnings({ "unchecked", "rawtypes" })
  public ModelObject createModelObject(EClass eClass, Object adaptee) {
    ModelObject<Object> modelObject = null;
    switch (eClass.getClassifierID()) {
    case AlgorithmsModelPackage.GRAPHICSALGORITHM_CLASSIFIER_ID:
      modelObject = new GraphicsAlgorithmModelObject();
      break;
    case AlgorithmsModelPackage.POLYLINE_CLASSIFIER_ID:
      modelObject = new PolylineModelObject();
      break;
    case AlgorithmsModelPackage.ELLIPSE_CLASSIFIER_ID:
      modelObject = new EllipseModelObject();
      break;
    case AlgorithmsModelPackage.TEXT_CLASSIFIER_ID:
      modelObject = new TextModelObject();
      break;
    case AlgorithmsModelPackage.ABSTRACTTEXT_CLASSIFIER_ID:
      modelObject = new AbstractTextModelObject();
      break;
    case AlgorithmsModelPackage.POLYGON_CLASSIFIER_ID:
      modelObject = new PolygonModelObject();
      break;
    case AlgorithmsModelPackage.RECTANGLE_CLASSIFIER_ID:
      modelObject = new RectangleModelObject();
      break;
    case AlgorithmsModelPackage.ROUNDEDRECTANGLE_CLASSIFIER_ID:
      modelObject = new RoundedRectangleModelObject();
      break;
    case AlgorithmsModelPackage.IMAGE_CLASSIFIER_ID:
      modelObject = new ImageModelObject();
      break;
    case AlgorithmsModelPackage.PLATFORMGRAPHICSALGORITHM_CLASSIFIER_ID:
      modelObject = new PlatformGraphicsAlgorithmModelObject();
      break;
    case AlgorithmsModelPackage.MULTITEXT_CLASSIFIER_ID:
      modelObject = new MultiTextModelObject();
      break;
    default:
      throw new IllegalArgumentException("The EClass '" + eClass + "' is not defined in this EPackage");
    }
    modelObject.setTarget(adaptee);
    return modelObject;
  }

  /**
   * Creates a feature map entry instance for a certain EStructuralFeature.
   * 
   * @param eFeature
   *          the feature map feature
   * @return the pojo feature map entry
   * @generated
   */
  public Object createFeatureMapEntry(EStructuralFeature eFeature) {
    throw new IllegalArgumentException("The EStructuralFeature '" + eFeature
        + "' is not a valid feature map in this EPackage");
  }

  /**
   * Wraps a feature map entry pojo in a {@link AbstractModelFeatureMapEntry}. If the feature map entry is null then a
   * new one is created and <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param eFeature
   *          the feature map feature of the object
   * @param adaptee
   *          the pojo feature map entry being wrapped/adapted
   * @return the wrapper {@link ModelFeatureMapEntry}
   * @generated
   */
  public ModelFeatureMapEntry<?> createModelFeatureMapEntry(EStructuralFeature eFeature, Object adaptee) {
    throw new IllegalArgumentException("The EStructuralFeature '" + eFeature
        + "' is not a valid feature map in this EPackage");
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Polyline
   * @generated
   */
  public Polyline createPolyline() {
    return new Polyline();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Ellipse
   * @generated
   */
  public Ellipse createEllipse() {
    return new Ellipse();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Text
   * @generated
   */
  public Text createText() {
    return new Text();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Polygon
   * @generated
   */
  public Polygon createPolygon() {
    return new Polygon();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Rectangle
   * @generated
   */
  public Rectangle createRectangle() {
    return new Rectangle();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass RoundedRectangle
   * @generated
   */
  public RoundedRectangle createRoundedRectangle() {
    return new RoundedRectangle();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Image
   * @generated
   */
  public Image createImage() {
    return new Image();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass PlatformGraphicsAlgorithm
   * @generated
   */
  public PlatformGraphicsAlgorithm createPlatformGraphicsAlgorithm() {
    return new PlatformGraphicsAlgorithm();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass MultiText
   * @generated
   */
  public MultiText createMultiText() {
    return new MultiText();
  }

  /**
   * Converts an instance of an {@link EDataType} to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param eDataType
   *          the {@link EDataType} defining the type
   * @param value
   *          the object to convert, if the value is null then null is returned.
   * @generated
   */
  public Object createFromString(EDataType eDataType, String value) {
    switch (eDataType.getClassifierID()) {
    default:
      throw new IllegalArgumentException("The EDatatype '" + eDataType + "' is not defined in this EPackage");
    }
  }

  /**
   * Converts an instance of an {@link EDataType} to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param eDataType
   *          the {@link EDataType} defining the type
   * @param value
   *          the object to convert, if value == null then null is returned
   * @generated
   */
  public String convertToString(EDataType eDataType, Object value) {
    switch (eDataType.getClassifierID()) {
    default:
      throw new IllegalArgumentException("The EDatatype '" + eDataType + "' is not defined in this EPackage.");
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>GraphicsAlgorithm</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class GraphicsAlgorithmModelObject<E extends GraphicsAlgorithm> extends
      MmModelFactory.GraphicsAlgorithmContainerModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return AlgorithmsModelPackage.INSTANCE.getGraphicsAlgorithmEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return AlgorithmsModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_GRAPHICSALGORITHMCHILDREN_FEATURE_ID:
        return getTarget().getGraphicsAlgorithmChildren();
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_PARENTGRAPHICSALGORITHM_FEATURE_ID:
        return getTarget().getParentGraphicsAlgorithm();
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_PICTOGRAMELEMENT_FEATURE_ID:
        return getTarget().getPictogramElement();
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_WIDTH_FEATURE_ID:
        return getTarget().getWidth();
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_HEIGHT_FEATURE_ID:
        return getTarget().getHeight();
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_X_FEATURE_ID:
        return getTarget().getX();
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_Y_FEATURE_ID:
        return getTarget().getY();
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_STYLE_FEATURE_ID:
        return getTarget().getStyle();
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_BACKGROUND_FEATURE_ID:
        return getTarget().getBackground();
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_FOREGROUND_FEATURE_ID:
        return getTarget().getForeground();
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_LINEWIDTH_FEATURE_ID:
        return getTarget().getLineWidth();
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_LINESTYLE_FEATURE_ID:
        return getTarget().getLineStyle();
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_FILLED_FEATURE_ID:
        return getTarget().getFilled();
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_LINEVISIBLE_FEATURE_ID:
        return getTarget().getLineVisible();
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_RENDERINGSTYLE_FEATURE_ID:
        return getTarget().getRenderingStyle();
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_TRANSPARENCY_FEATURE_ID:
        return getTarget().getTransparency();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_GRAPHICSALGORITHMCHILDREN_FEATURE_ID:
        getTarget().setGraphicsAlgorithmChildren((List<GraphicsAlgorithm>) value);
        return;
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_PARENTGRAPHICSALGORITHM_FEATURE_ID:
        getTarget().setParentGraphicsAlgorithm((GraphicsAlgorithm) value);
        return;
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_PICTOGRAMELEMENT_FEATURE_ID:
        getTarget().setPictogramElement((PictogramElement) value);
        return;
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_WIDTH_FEATURE_ID:
        getTarget().setWidth((Integer) value);
        return;
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_HEIGHT_FEATURE_ID:
        getTarget().setHeight((Integer) value);
        return;
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_X_FEATURE_ID:
        getTarget().setX((Integer) value);
        return;
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_Y_FEATURE_ID:
        getTarget().setY((Integer) value);
        return;
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_STYLE_FEATURE_ID:
        getTarget().setStyle((Style) value);
        return;
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_BACKGROUND_FEATURE_ID:
        getTarget().setBackground((Color) value);
        return;
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_FOREGROUND_FEATURE_ID:
        getTarget().setForeground((Color) value);
        return;
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_LINEWIDTH_FEATURE_ID:
        getTarget().setLineWidth((Integer) value);
        return;
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_LINESTYLE_FEATURE_ID:
        getTarget().setLineStyle((LineStyle) value);
        return;
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_FILLED_FEATURE_ID:
        getTarget().setFilled((Boolean) value);
        return;
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_LINEVISIBLE_FEATURE_ID:
        getTarget().setLineVisible((Boolean) value);
        return;
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_RENDERINGSTYLE_FEATURE_ID:
        getTarget().setRenderingStyle((RenderingStyle) value);
        return;
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_TRANSPARENCY_FEATURE_ID:
        getTarget().setTransparency((Double) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case AlgorithmsModelPackage.GRAPHICSALGORITHM_GRAPHICSALGORITHMCHILDREN_FEATURE_ID:
        return getTarget().addToGraphicsAlgorithmChildren((GraphicsAlgorithm) value);

      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case AlgorithmsModelPackage.GRAPHICSALGORITHM_GRAPHICSALGORITHMCHILDREN_FEATURE_ID:
        return getTarget().removeFromGraphicsAlgorithmChildren((GraphicsAlgorithm) value);

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Polyline</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class PolylineModelObject<E extends Polyline> extends GraphicsAlgorithmModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return AlgorithmsModelPackage.INSTANCE.getPolylineEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return AlgorithmsModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case AlgorithmsModelPackage.POLYLINE_POINTS_FEATURE_ID:
        return getTarget().getPoints();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case AlgorithmsModelPackage.POLYLINE_POINTS_FEATURE_ID:
        getTarget().setPoints((List<Point>) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case AlgorithmsModelPackage.POLYLINE_POINTS_FEATURE_ID:
        return getTarget().addToPoints((Point) value);
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case AlgorithmsModelPackage.POLYLINE_POINTS_FEATURE_ID:
        return getTarget().removeFromPoints((Point) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Ellipse</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class EllipseModelObject<E extends Ellipse> extends GraphicsAlgorithmModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return AlgorithmsModelPackage.INSTANCE.getEllipseEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return AlgorithmsModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Text</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class TextModelObject<E extends Text> extends AbstractTextModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return AlgorithmsModelPackage.INSTANCE.getTextEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return AlgorithmsModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>AbstractText</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class AbstractTextModelObject<E extends AbstractText> extends GraphicsAlgorithmModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return AlgorithmsModelPackage.INSTANCE.getAbstractTextEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return AlgorithmsModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case AlgorithmsModelPackage.ABSTRACTTEXT_FONT_FEATURE_ID:
        return getTarget().getFont();
      case AlgorithmsModelPackage.ABSTRACTTEXT_HORIZONTALALIGNMENT_FEATURE_ID:
        return getTarget().getHorizontalAlignment();
      case AlgorithmsModelPackage.ABSTRACTTEXT_VERTICALALIGNMENT_FEATURE_ID:
        return getTarget().getVerticalAlignment();
      case AlgorithmsModelPackage.ABSTRACTTEXT_ANGLE_FEATURE_ID:
        return getTarget().getAngle();
      case AlgorithmsModelPackage.ABSTRACTTEXT_VALUE_FEATURE_ID:
        return getTarget().getValue();
      case AlgorithmsModelPackage.ABSTRACTTEXT_STYLEREGIONS_FEATURE_ID:
        return getTarget().getStyleRegions();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case AlgorithmsModelPackage.ABSTRACTTEXT_FONT_FEATURE_ID:
        getTarget().setFont((Font) value);
        return;
      case AlgorithmsModelPackage.ABSTRACTTEXT_HORIZONTALALIGNMENT_FEATURE_ID:
        getTarget().setHorizontalAlignment((Orientation) value);
        return;
      case AlgorithmsModelPackage.ABSTRACTTEXT_VERTICALALIGNMENT_FEATURE_ID:
        getTarget().setVerticalAlignment((Orientation) value);
        return;
      case AlgorithmsModelPackage.ABSTRACTTEXT_ANGLE_FEATURE_ID:
        getTarget().setAngle((Integer) value);
        return;
      case AlgorithmsModelPackage.ABSTRACTTEXT_VALUE_FEATURE_ID:
        getTarget().setValue((String) value);
        return;
      case AlgorithmsModelPackage.ABSTRACTTEXT_STYLEREGIONS_FEATURE_ID:
        getTarget().setStyleRegions((List<TextStyleRegion>) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case AlgorithmsModelPackage.ABSTRACTTEXT_STYLEREGIONS_FEATURE_ID:
        return getTarget().addToStyleRegions((TextStyleRegion) value);
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case AlgorithmsModelPackage.ABSTRACTTEXT_STYLEREGIONS_FEATURE_ID:
        return getTarget().removeFromStyleRegions((TextStyleRegion) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Polygon</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class PolygonModelObject<E extends Polygon> extends PolylineModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return AlgorithmsModelPackage.INSTANCE.getPolygonEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return AlgorithmsModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Rectangle</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class RectangleModelObject<E extends Rectangle> extends GraphicsAlgorithmModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return AlgorithmsModelPackage.INSTANCE.getRectangleEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return AlgorithmsModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>RoundedRectangle</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class RoundedRectangleModelObject<E extends RoundedRectangle> extends GraphicsAlgorithmModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return AlgorithmsModelPackage.INSTANCE.getRoundedRectangleEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return AlgorithmsModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case AlgorithmsModelPackage.ROUNDEDRECTANGLE_CORNERHEIGHT_FEATURE_ID:
        return getTarget().getCornerHeight();
      case AlgorithmsModelPackage.ROUNDEDRECTANGLE_CORNERWIDTH_FEATURE_ID:
        return getTarget().getCornerWidth();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case AlgorithmsModelPackage.ROUNDEDRECTANGLE_CORNERHEIGHT_FEATURE_ID:
        getTarget().setCornerHeight((Integer) value);
        return;
      case AlgorithmsModelPackage.ROUNDEDRECTANGLE_CORNERWIDTH_FEATURE_ID:
        getTarget().setCornerWidth((Integer) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Image</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ImageModelObject<E extends Image> extends GraphicsAlgorithmModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return AlgorithmsModelPackage.INSTANCE.getImageEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return AlgorithmsModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case AlgorithmsModelPackage.IMAGE_ID_FEATURE_ID:
        return getTarget().getId();
      case AlgorithmsModelPackage.IMAGE_STRETCHH_FEATURE_ID:
        return getTarget().getStretchH();
      case AlgorithmsModelPackage.IMAGE_STRETCHV_FEATURE_ID:
        return getTarget().getStretchV();
      case AlgorithmsModelPackage.IMAGE_PROPORTIONAL_FEATURE_ID:
        return getTarget().getProportional();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case AlgorithmsModelPackage.IMAGE_ID_FEATURE_ID:
        getTarget().setId((String) value);
        return;
      case AlgorithmsModelPackage.IMAGE_STRETCHH_FEATURE_ID:
        getTarget().setStretchH((Boolean) value);
        return;
      case AlgorithmsModelPackage.IMAGE_STRETCHV_FEATURE_ID:
        getTarget().setStretchV((Boolean) value);
        return;
      case AlgorithmsModelPackage.IMAGE_PROPORTIONAL_FEATURE_ID:
        getTarget().setProportional((Boolean) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>PlatformGraphicsAlgorithm</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class PlatformGraphicsAlgorithmModelObject<E extends PlatformGraphicsAlgorithm> extends
      GraphicsAlgorithmModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return AlgorithmsModelPackage.INSTANCE.getPlatformGraphicsAlgorithmEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return AlgorithmsModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case AlgorithmsModelPackage.PLATFORMGRAPHICSALGORITHM_ID_FEATURE_ID:
        return getTarget().getId();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case AlgorithmsModelPackage.PLATFORMGRAPHICSALGORITHM_ID_FEATURE_ID:
        getTarget().setId((String) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>MultiText</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class MultiTextModelObject<E extends MultiText> extends AbstractTextModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return AlgorithmsModelPackage.INSTANCE.getMultiTextEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return AlgorithmsModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }
}