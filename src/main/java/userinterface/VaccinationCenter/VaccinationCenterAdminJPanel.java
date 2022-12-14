/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.VaccinationCenter;


import Business.City.City;
import Business.EcoSystem;
import Business.Employee.EmployeeDirectory;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;


/**
 *
 * @author meghi
 */

public class VaccinationCenterAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form VaccinationCenterAdminJPanel
     */
    
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount userAccount;
    Organization organization;
    Enterprise enterprise;
    City city;
    //Enterprise enterprise;
    public VaccinationCenterAdminJPanel(JPanel userProcessContainer, City city, UserAccount userAccount, Organization organization, 
            Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.system=system;  
        this.userAccount=userAccount;
        this.enterprise=enterprise;
        this.city=city;
        this.organization=organization;
        //this.enterprise=enterprise;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnViewInventory = new javax.swing.JButton();
        btnManageStaff = new javax.swing.JButton();
        btnPlaceOrder = new javax.swing.JButton();
        lblManufacturereAdmin = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnViewInventory.setBackground(new java.awt.Color(0, 0, 0));
        btnViewInventory.setForeground(new java.awt.Color(255, 255, 255));
        btnViewInventory.setText("View Inventory");
        btnViewInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewInventoryActionPerformed(evt);
            }
        });
        add(btnViewInventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 192, 30));

        btnManageStaff.setBackground(new java.awt.Color(0, 0, 0));
        btnManageStaff.setForeground(new java.awt.Color(255, 255, 255));
        btnManageStaff.setText("Manage Staff");
        btnManageStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageStaffActionPerformed(evt);
            }
        });
        add(btnManageStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 192, 30));

        btnPlaceOrder.setBackground(new java.awt.Color(0, 0, 0));
        btnPlaceOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnPlaceOrder.setText("Place Order");
        btnPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceOrderActionPerformed(evt);
            }
        });
        add(btnPlaceOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 192, 30));

        lblManufacturereAdmin.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblManufacturereAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManufacturereAdmin.setText("WELCOME VACCINATION CENTER ADMIN");
        add(lblManufacturereAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(-210, 0, 988, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewInventoryActionPerformed
       ViewVaccineInventoryJPanel viewVaccineInventoryJPanel = new ViewVaccineInventoryJPanel(userProcessContainer, city, userAccount, organization, enterprise, system);
       userProcessContainer.add("viewVaccineInventoryJPanel", viewVaccineInventoryJPanel);
       CardLayout layout = (CardLayout) userProcessContainer.getLayout();
       layout.next( userProcessContainer);
    }//GEN-LAST:event_btnViewInventoryActionPerformed

    private void btnManageStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageStaffActionPerformed
       ManageVaccinationCenterStaffJPanel manageVaccinationCenterStaffJPanel = new ManageVaccinationCenterStaffJPanel(userProcessContainer, city, userAccount, organization, enterprise, system);
       userProcessContainer.add("manageVaccinationCenterStaffJPanel", manageVaccinationCenterStaffJPanel);
       CardLayout layout = (CardLayout) userProcessContainer.getLayout();
       layout.next( userProcessContainer);
    }//GEN-LAST:event_btnManageStaffActionPerformed

    private void btnPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOrderActionPerformed
       PlaceVaccineOrderJPanel placeVaccineOrderJPanel = new PlaceVaccineOrderJPanel(userProcessContainer, city, userAccount, organization, enterprise, system);
       userProcessContainer.add("placeVaccineOrderJPanel", placeVaccineOrderJPanel);
       CardLayout layout = (CardLayout) userProcessContainer.getLayout();
       layout.next( userProcessContainer);
    }//GEN-LAST:event_btnPlaceOrderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageStaff;
    private javax.swing.JButton btnPlaceOrder;
    private javax.swing.JButton btnViewInventory;
    private javax.swing.JLabel lblManufacturereAdmin;
    // End of variables declaration//GEN-END:variables
}
