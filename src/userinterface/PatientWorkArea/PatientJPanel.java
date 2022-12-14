/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.PatientWorkArea;

import Business.City.City;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import static Business.Enterprise.Enterprise.EnterpriseType.Hospital;
import Business.Enterprise.Hospital;
import Business.Organization.Organization;
import Business.Patient.Patient;
import Business.Person.Person;
import Business.TestReport.TestReport;
import Business.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author hetalp
 */
public class PatientJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount userAccount;
    Organization organization;
    Enterprise enterprise;
    City city;
    public PatientJPanel(JPanel userProcessContainer, City city, UserAccount userAccount, Organization organization, 
            Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.system=system;  
        this.userAccount=userAccount;
        this.enterprise=enterprise;
        this.city=city;
        this.organization=organization;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        txtReport = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        lblWelcome = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PATIENT PANEL");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 550, -1));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel2.setText("Your Vaccination Status");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 157, 39));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel3.setText("Your Test Report");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 157, -1));

        txtStatus.setEditable(false);
        txtStatus.setBackground(new java.awt.Color(214, 229, 244));
        add(txtStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 149, -1));

        txtReport.setEditable(false);
        txtReport.setBackground(new java.awt.Color(214, 229, 244));
        add(txtReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 149, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Check");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, -1, -1));
        add(lblWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, 361, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
        for(City c : system.getCityList()){
             
           for(Enterprise e : c.getEnterpriseDirectory().getEnterpriseList()){
               //Hospital hos = (Hospital)e;
               if(e.getClass().getName().equals("Business.Enterprise.Hospital")){
                   Hospital hos = (Hospital)e;
                   //System.out.println(e);
                    for(Patient patient: hos.getPatientDirectory().getPatientDir()){
                        if(patient.getName().equals(userAccount.getEmployee().getName())){
                            txtStatus.setText(patient.getVaccinationStatus());
                            //lblWelcome.setText("Welcome "+patient.getName()+" to Covid Care");
                        }
                    }
               }
           }
        }}
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Please get your vaccinated status");
        }
        String status=" ";
        try{
        for(Person p : system.getPersonDirectory().getPersonList()){
            if(p.getName().equals(userAccount.getEmployee().getName())){
                TestReport report = p.getTestHistory().getTestReportList().get(p.getTestHistory().getTestReportList().size()-1);
                if(report.isResult()==true){
                    status = "Covid Positive";
                }
                else{
                    status = "Covid Negative";
                }
                txtReport.setText(status);
            }
        }
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(this,"Please get tested first");
    }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JTextField txtReport;
    private javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables
}
