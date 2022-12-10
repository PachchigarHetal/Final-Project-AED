/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author japangor
 */
public class VaccinationCenter extends Enterprise {
     public VaccinationCenter (String name){
        super( Enterprise.EnterpriseType.VaccinationCenter, name);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
