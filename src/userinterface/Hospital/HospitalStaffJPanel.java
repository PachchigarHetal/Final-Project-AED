
package userinterface.Hospital;

import Business.City.City;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author japangor
 */
public class HospitalStaffJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HospitalStaffJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount userAccount;
    Organization organization;
    Enterprise enterprise;
    City city;
    public HospitalStaffJPanel(JPanel userProcessContainer, City city, UserAccount userAccount, Organization organization, 
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

        btnManageVitalSign = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnManageVitalSign.setBackground(new java.awt.Color(0, 0, 0));
        btnManageVitalSign.setForeground(new java.awt.Color(255, 255, 255));
        btnManageVitalSign.setText("Manage Vital Signs");
        btnManageVitalSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageVitalSignActionPerformed(evt);
            }
        });
        add(btnManageVitalSign, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 230, 40));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("WELCOME, STAFF MEMBER");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 70, 630, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageVitalSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageVitalSignActionPerformed
        // TODO add your handling code here:
        ManageVitalSignsReportJPanel manageVitalSignsJPanel = new ManageVitalSignsReportJPanel(userProcessContainer, city, userAccount, organization, enterprise, system);
        userProcessContainer.add("manageTestCenterJPanel", manageVitalSignsJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageVitalSignActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageVitalSign;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
