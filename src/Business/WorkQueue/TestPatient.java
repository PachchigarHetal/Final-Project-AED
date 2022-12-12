
package Business.WorkQueue;

import Business.UserAccount.UserAccount;

/**
 *
 * @author hetalp
 */
public class TestPatient extends WorkRequest {
    
    private int patientID;
    private String patientName;

   
    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
    
    public TestPatient(String message, UserAccount sender, UserAccount receiver, String status) {
        super(message, sender, receiver, status);
        
    }

    
    
    
}
