/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;
import Business.Role.DoctorRole;
import Business.Role.Role;
import Business.Role.VaccineManufacturerRole;
import java.util.ArrayList;
/**
 *
 * @author meghi
 */
public class VaccineManufacturerOrganization extends Organization {
    
     public VaccineManufacturerOrganization(String name) {
        super(Organization.Type.VaccineManufacturerAdmin.getValue(), name);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new VaccineManufacturerRole());
        return roles;
    }
}
