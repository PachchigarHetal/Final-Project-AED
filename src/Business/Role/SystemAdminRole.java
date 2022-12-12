/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.City.City;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import static Business.Role.Role.RoleType.SystemAdmin;

import Business.UserAccount.UserAccount;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
import javax.swing.JPanel;
import userinterface.VaccineManufacturer.ManageDeliveryManagerJPanel;

/**
 *
 * @author hetalp
 */
public class SystemAdminRole extends Role{
    //private EcoSystem system;
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, City city, UserAccount userAccount, Organization organization, 
            Enterprise enterprise, EcoSystem system) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer,city, userAccount, organization, enterprise, system);
    } 
    
}
