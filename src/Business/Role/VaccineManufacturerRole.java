/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.City.City;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.VaccineManufacturer.ManageDeliveryManagerJPanel;
import userinterface.VaccineManufacturer.VaccineManufacturerAdminJPanel;

/**
 *
 * @author japangor
 */
    public class VaccineManufacturerRole extends Role {
    private EcoSystem system;
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, City city, UserAccount userAccount, Organization organization, 
            Enterprise enterprise, EcoSystem system) {
        return new VaccineManufacturerAdminJPanel(userProcessContainer,city, userAccount, organization, enterprise, system);
    }  
}
