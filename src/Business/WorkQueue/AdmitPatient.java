/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;

/**
 *
 * @author japangor
 */
public class AdmitPatient extends WorkRequest {
    private String DoctorName;
    private String PatientName;
    int PatientID=1;
    private String AdmissionStatus;
    
    public AdmitPatient(String message, UserAccount sender, UserAccount receiver, String status) {
        super(message, sender, receiver, status);
        PatientID++;
    }

    public String getDoctorName() {
        return DoctorName;
    }

    public void setDoctorName(String DoctorName) {
        this.DoctorName = DoctorName;
    }

    public String getPatientName() {
        return PatientName;
    }

    public void setPatientName(String PatientName) {
        this.PatientName = PatientName;
    }

    public int getPatientID() {
        return PatientID;
    }

    public void setPatientID(int PatientID) {
        this.PatientID = PatientID;
    }

    public String getAdmissionStatus() {
        return AdmissionStatus;
    }

    public void setAdmissionStatus(String AdmissionStatus) {
        this.AdmissionStatus = AdmissionStatus;
    }
    
    
}
