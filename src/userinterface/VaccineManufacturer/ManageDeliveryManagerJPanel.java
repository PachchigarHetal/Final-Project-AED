/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.VaccineManufacturer;

import Business.City.City;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Role.DeliveryManagerRole;
import Business.Role.Role;
import Business.Role.VaccinationCenterStaffRole;
import Business.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.awt.CardLayout;
import java.awt.Component;

/**
 *
 * @author hetalp
 */
public class ManageDeliveryManagerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageDeliveryManagerJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount userAccount;
    Organization organization;
    Enterprise enterprise;
    City city;
    public ManageDeliveryManagerJPanel(JPanel userProcessContainer,City city,UserAccount userAccount,Organization organization,Enterprise enterprise,EcoSystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.system=system;
        this.userAccount=userAccount;
        this.city=city;
        this.organization=organization;
        this.enterprise=enterprise;
        populaTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDeliveryManager = new javax.swing.JTable();
        lblManageAdmin = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        txtPassword = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDeliveryManager.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Username", "Staff ID", "Name", "Password"
            }
        ));
        jScrollPane1.setViewportView(tblDeliveryManager);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 988, 183));

        lblManageAdmin.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblManageAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageAdmin.setText("MANAGE DELIVERY MANAGER");
        add(lblManageAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 610, -1));

        lblPassword.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblPassword.setText("Password:");
        add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, -1, -1));

        btnCreate.setBackground(new java.awt.Color(0, 0, 0));
        btnCreate.setForeground(new java.awt.Color(255, 255, 255));
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, -1, -1));
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 212, -1));

        lblUsername.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblUsername.setText("Username:");
        add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, -1, -1));
        add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 212, -1));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 212, -1));

        lblName.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblName.setText("Name:");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        Employee employee = enterprise.getEmployeeDirectory().createEmployee(txtName.getText());
        String userName = txtUsername.getText();
        String password = txtPassword.getText();
        if (enterprise.getUserAccountDirectory().authenticateUser(userName, password) != null) {
                JOptionPane.showMessageDialog(null, "Username Already exists");
                    return;
        }

        else if (userName.equals("") || password.equals("")) {
               JOptionPane.showMessageDialog(null, "Username and password can not be empty");
                    return;
        }
        else{
        Role role = new DeliveryManagerRole();
        UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(userName, password, employee, role);
                     
       populaTable();
       JOptionPane.showMessageDialog(this,"Delivery Manager Created");
        }
        txtName.setText(" ");
        txtUsername.setText(" ");
        txtPassword.setText(" ");
//        txtStaffID.setText(" ");
    }//GEN-LAST:event_btnCreateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        VaccineManufacturerAdminJPanel manageOrderjp = (VaccineManufacturerAdminJPanel) component;
        //        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblManageAdmin;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTable tblDeliveryManager;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    private void populaTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblDeliveryManager.getModel();
        dtm.setRowCount(0);

            
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    if("Business.Role.DeliveryManagerRole".equals(userAccount.getRole().getClass().getName())){
                    System.out.println(userAccount.getRole());
                    Object[] row = new Object[4];
                    row[0] = userAccount;
                    row[1] = userAccount.getEmployee().getId();
                    row[2] = userAccount.getEmployee().getName();
                    row[3] = userAccount.getPassword();

                    dtm.addRow(row);
                }
                }

    }
}