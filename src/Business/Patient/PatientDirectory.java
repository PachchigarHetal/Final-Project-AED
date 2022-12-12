/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.Person.Person;
import Business.Vaccine.Vaccine;
import java.util.ArrayList;

/**
 *
 * @author japangor
 */
public class PatientDirectory {
    private ArrayList<Patient> patientDir; 
    
    public PatientDirectory(){
        patientDir = new ArrayList<Patient>();
    }

    public ArrayList<Patient> getPatientDir() {
        return patientDir;
    }

    public void setPatientDir(ArrayList<Patient> patientDir) {
        this.patientDir = patientDir;
    }
    
    public void deletePatient(Patient patient){
        patientDir.remove(patient);
    }
    
    public Patient addPatientDir(int personID, String name, String street, String zipcode, int age, String Community, String phoneNo, String email, String DoctorName, String QuarantineStatus, String VaccinationStatus) {
        Patient p = new Patient(personID, name, street, zipcode, age, Community, phoneNo, email, DoctorName, QuarantineStatus, VaccinationStatus);
        
        patientDir.add(p);
        return p;
    }
}
