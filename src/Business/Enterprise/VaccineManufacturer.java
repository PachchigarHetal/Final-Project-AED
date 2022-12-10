/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import Business.Vaccine.VaccineDirectory;
import java.util.ArrayList;

/**
 *
 * @author japangor
 */
public class VaccineManufacturer extends Enterprise {
    VaccineDirectory vaccineDirectory=new VaccineDirectory();
     
    public VaccineManufacturer (String name){
        super( Enterprise.EnterpriseType.VaccineManufacturer, name);
        vaccineDirectory = new VaccineDirectory();
    }

    public VaccineDirectory getVaccineDirectory() {
        return vaccineDirectory;
    }

    public void setVaccineDitrectory(VaccineDirectory vaccineDitrectory) {
        this.vaccineDirectory = vaccineDitrectory;
    }
     

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
