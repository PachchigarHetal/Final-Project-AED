/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DoctorRole;
import Business.Role.Role;
import Business.Role.TestingLabAdminRole;
import java.util.ArrayList;
/**
 *
 * @author meghi
 */
public class TestingLabAdminOrganization extends Organization{
    
     public TestingLabAdminOrganization(String name) {
        super(Organization.Type.TestingLabAdmin.getValue(), name);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new TestingLabAdminRole());
        return roles;
    }
}
