/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;
import Business.Role.HospitalAdminRole;
import Business.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author meghi
 */
public class HospitalAdminOrganization extends Organization {

    public HospitalAdminOrganization(String name) {
        super(Type.HospitalAdmin.getValue(), name);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new HospitalAdminRole());
        return roles;
    }
}
