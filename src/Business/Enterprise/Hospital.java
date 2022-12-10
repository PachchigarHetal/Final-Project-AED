/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Patient.PatientDirectory;
import Business.Role.Role;
import Business.Vaccine.VaccineDirectory;
import java.util.ArrayList;

/**
 *
 * @author japangor
 */
public class Hospital extends Enterprise {
    PatientDirectory patientDirectory=new PatientDirectory();

    public Hospital (String name){
        super( EnterpriseType.Hospital, name);
        patientDirectory = new PatientDirectory();
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
