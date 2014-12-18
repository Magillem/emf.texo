package org.eclipse.emf.texo.test.model.samples.capa;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>MachineList</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "capa_MachineList")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class MachineList extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  @OrderColumn()
  private List<Machine> machines = new ArrayList<Machine>();

  /**
   * Returns the value of '<em><b>machines</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>machines</b></em>' feature
   * @generated
   */
  public List<Machine> getMachines() {
    return machines;
  }

  /**
   * Adds to the <em>machines</em> feature.
   * 
   * @param machinesValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToMachines(Machine machinesValue) {
    if (!machines.contains(machinesValue)) {
      boolean result = machines.add(machinesValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>machines</em> feature.
   * 
   * @param machinesValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromMachines(Machine machinesValue) {
    if (machines.contains(machinesValue)) {
      boolean result = machines.remove(machinesValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>machines</em> feature.
   * 
   * @generated
   */
  public void clearMachines() {
    while (!machines.isEmpty()) {
      removeFromMachines(machines.iterator().next());
    }
  }

  /**
   * Sets the '{@link MachineList#getMachines() <em>machines</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newMachines
   *          the new value of the '{@link MachineList#getMachines() machines}' feature.
   * @generated
   */
  public void setMachines(List<Machine> newMachines) {
    machines = newMachines;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "MachineList ";
  }
}
