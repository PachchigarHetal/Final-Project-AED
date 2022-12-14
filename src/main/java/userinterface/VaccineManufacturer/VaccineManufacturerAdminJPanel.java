/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.VaccineManufacturer;

import Business.City.City;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author meghi
 */
public class VaccineManufacturerAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form VaccineManufacturerAdminJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount userAccount;
    Organization organization;
    Enterprise enterprise;
    City city;
    //Enterprise enterprise;
    public VaccineManufacturerAdminJPanel(JPanel userProcessContainer, City city, UserAccount userAccount, Organization organization, 
            Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.system=system;
        this.userAccount=userAccount;
        this.city=city;
        this.organization=organization;
        this.enterprise=enterprise;
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

        btnManageInventory = new javax.swing.JButton();
        btnManageDeliveryManger = new javax.swing.JButton();
        lblManufacturereAdmin = new javax.swing.JLabel();
        btnManageOrder = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnManageInventory.setBackground(new java.awt.Color(0, 0, 0));
        btnManageInventory.setForeground(new java.awt.Color(255, 255, 255));
        btnManageInventory.setText("Manage Inventory");
        btnManageInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageInventoryActionPerformed(evt);
            }
        });
        add(btnManageInventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 181, 30));

        btnManageDeliveryManger.setBackground(new java.awt.Color(0, 0, 0));
        btnManageDeliveryManger.setForeground(new java.awt.Color(255, 255, 255));
        btnManageDeliveryManger.setText("Manage Delivery Manager");
        btnManageDeliveryManger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageDeliveryMangerActionPerformed(evt);
            }
        });
        add(btnManageDeliveryManger, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, 30));

        lblManufacturereAdmin.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblManufacturereAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManufacturereAdmin.setText("WELCOME VACCINE MANUFACTURER");
        add(lblManufacturereAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 730, -1));

        btnManageOrder.setBackground(new java.awt.Color(0, 0, 0));
        btnManageOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnManageOrder.setText("Manage Orders");
        btnManageOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageOrderActionPerformed(evt);
            }
        });
        add(btnManageOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 181, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageInventoryActionPerformed
       ManageInventoryJPanel manageInventoryJPanel = new ManageInventoryJPanel(userProcessContainer, city, userAccount, organization, enterprise, system);
       userProcessContainer.add("manageInventoryJPanel", manageInventoryJPanel);
       CardLayout layout = (CardLayout) userProcessContainer.getLayout();
       layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageInventoryActionPerformed

    private void btnManageDeliveryMangerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageDeliveryMangerActionPerformed
       ManageDeliveryManagerJPanel manageDeliveryJPanel = new ManageDeliveryManagerJPanel(userProcessContainer, city, userAccount, organization, enterprise, system);
       userProcessContainer.add("manageDeliveryJPanel", manageDeliveryJPanel);
       CardLayout layout = (CardLayout) userProcessContainer.getLayout();
       layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageDeliveryMangerActionPerformed

    private void btnManageOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageOrderActionPerformed
       ManageOrdersJPanel manageOrderJPanel = new ManageOrdersJPanel(userProcessContainer, city, userAccount, organization, enterprise, system);
       userProcessContainer.add("manageOrderJPanel", manageOrderJPanel);
       CardLayout layout = (CardLayout) userProcessContainer.getLayout();
       layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageOrderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageDeliveryManger;
    private javax.swing.JButton btnManageInventory;
    private javax.swing.JButton btnManageOrder;
    private javax.swing.JLabel lblManufacturereAdmin;
    // End of variables declaration//GEN-END:variables
}
