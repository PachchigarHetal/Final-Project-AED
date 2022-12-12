
package userinterface.Hospital;

import Business.City.City;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import static Business.Enterprise.Enterprise.EnterpriseType.Hospital;
import Business.Enterprise.Hospital;
import Business.Organization.Organization;
import Business.Patient.Patient;
import Business.Patient.PatientDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author japangor
 */
public class HospitalAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HospitalAdminJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount userAccount;
    Organization organization;
    Enterprise enterprise;
    City city;
    public HospitalAdminJPanel(JPanel userProcessContainer, City city, UserAccount userAccount, Organization organization, 
            Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.system=system;  
        this.userAccount=userAccount;
        this.enterprise=enterprise;
        this.city=city;
        this.organization=organization;
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnManageDoctor = new javax.swing.JButton();
        btnManagePatient = new javax.swing.JButton();
        btnManageStaff = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnSendVC = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnManageDoctor.setBackground(new java.awt.Color(0, 0, 0));
        btnManageDoctor.setForeground(new java.awt.Color(255, 255, 255));
        btnManageDoctor.setText("Manage Doctor");
        btnManageDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageDoctorActionPerformed(evt);
            }
        });
        add(btnManageDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 230, 30));

        btnManagePatient.setBackground(new java.awt.Color(0, 0, 0));
        btnManagePatient.setForeground(new java.awt.Color(255, 255, 255));
        btnManagePatient.setText("Manage Patient");
        btnManagePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagePatientActionPerformed(evt);
            }
        });
        add(btnManagePatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 230, 30));

        btnManageStaff.setBackground(new java.awt.Color(0, 0, 0));
        btnManageStaff.setForeground(new java.awt.Color(255, 255, 255));
        btnManageStaff.setText("Manage Staff");
        btnManageStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageStaffActionPerformed(evt);
            }
        });
        add(btnManageStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 230, 30));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("WELCOME, HOSPITAL ADMIN");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 48, 1210, -1));

        btnSendVC.setBackground(new java.awt.Color(0, 0, 0));
        btnSendVC.setForeground(new java.awt.Color(255, 255, 255));
        btnSendVC.setText("Send Non-Vaccinated People");
        btnSendVC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendVCActionPerformed(evt);
            }
        });
        add(btnSendVC, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 200, 230, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageDoctorActionPerformed
        // TODO add your handling code here:
        ManageDoctorJPanel manageDoctorJPanel = new ManageDoctorJPanel(userProcessContainer, city, userAccount, organization, enterprise, system);
        userProcessContainer.add("manageDoctorJPanel", manageDoctorJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageDoctorActionPerformed

    private void btnManagePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagePatientActionPerformed
        // TODO add your handling code here:
        ManagePatientJPanel managePatientJPanel = new ManagePatientJPanel(userProcessContainer, city, userAccount, organization, enterprise, system);
        userProcessContainer.add("managePatientJPanel", managePatientJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManagePatientActionPerformed

    private void btnManageStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageStaffActionPerformed
        // TODO add your handling code here:
        ManageHospitalStaffJPanel manageStaffJPanel = new ManageHospitalStaffJPanel(userProcessContainer, city, userAccount, organization, enterprise, system);
        userProcessContainer.add("manageStaffJPanel", manageStaffJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageStaffActionPerformed

    private void btnSendVCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendVCActionPerformed
        PlaceVaccinationRequest pr = new PlaceVaccinationRequest(userProcessContainer, city, userAccount, organization, enterprise, system);
        userProcessContainer.add("pr", pr);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnSendVCActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageDoctor;
    private javax.swing.JButton btnManagePatient;
    private javax.swing.JButton btnManageStaff;
    private javax.swing.JButton btnSendVC;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
