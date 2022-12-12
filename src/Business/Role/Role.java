/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.City.City;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;

import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author hetalp
 */
public abstract class Role {
    
    public enum RoleType{
        DeliveryManagerRole("DeliveryManagerRole"),
        DoctorRole("DoctorRole"),
        HospitalAdminRole("HospitalAdminRole"),
        HospitalStaffRole("HospitalStaffRole"),
        PatientRole("PatientRole"),
        LabAdminRole("LabAdminRole"),
        PersonRole("PersonRole"),
        SystemAdmin("SystemAdmin"),
        VaccinationCenterAdminRole("VaccinationCenterAdminRole"),
        VaccinationCenterStaffRole("VaccinationCenterStaffRole"),
        VaccineManufacturerRole("VaccineManufacturerRole");
        
        private String value;
        
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return this.value;
        }
    }
    
   public abstract JPanel createWorkArea(JPanel userProcessContainer,
            City city,
            UserAccount account,  
            Organization organization,
            Enterprise enterprise,
            EcoSystem system);
   
       @Override
    public String toString() {
        return this.getClass().getName();
    }
    
}