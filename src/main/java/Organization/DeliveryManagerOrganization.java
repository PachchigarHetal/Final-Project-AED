/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;
import Business.Role.DeliveryManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author meghi
 */
public class DeliveryManagerOrganization extends Organization { 
    public DeliveryManOrganization(String name) {
        super(Type.DeliveryManager.getValue(), name);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DeliveryManagerRole());
        return roles;
    }
}
