/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ManageUserController;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import rojerusan.RSTableMetro;

/**
 *
 * @author TUF GAMING
 */
public class AdminPanelUsersView extends javax.swing.JPanel {

    /**
     * Creates new form AdminPanelUsersView
     */
    
    private DefaultTableModel model;
    public AdminPanelUsersView() {
        initComponents();
        ManageUserController controller = new ManageUserController(this, model);
        controller.setUserDetailToTable();
    }

    public RSTableMetro getTblUsersDetail() {
        return tblUsersDetail;
    }

    public JComboBox<String> getCbxRole() {
        return cbxRole;
    }

    public JTextField getTxtEmail() {
        return txtEmail;
    }

    public JTextField getTxtName() {
        return txtName;
    }

    public JTextField getTxtPassword() {
        return txtPassword;
    }

    public JTextField getTxtPhone() {
        return txtPhone;
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel12 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        cbxRole = new javax.swing.JComboBox<>();
        btnDelete = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblUsersDetail = new rojerusan.RSTableMetro();
        jLabel22 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(820, 640));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Name");
        jPanel12.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel12.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 170, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/name.png"))); // NOI18N
        jPanel12.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 30, 30));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel23.setText("Password");
        jPanel12.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        jPanel12.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 170, 30));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/password.png"))); // NOI18N
        jPanel12.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 30, 30));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel25.setText("Phone");
        jPanel12.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, -1, -1));

        txtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneActionPerformed(evt);
            }
        });
        jPanel12.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 170, 30));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/phone.png"))); // NOI18N
        jPanel12.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 30, 30));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel27.setText("Role");
        jPanel12.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, -1, -1));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/email.png"))); // NOI18N
        jPanel12.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 30, 30));

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel12.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 160, 30));

        cbxRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "customer", "admin" }));
        jPanel12.add(cbxRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, 120, -1));

        btnDelete.setText("Delete");
        jPanel12.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, 100, 30));

        btnAdd.setText("Add");
        jPanel12.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 100, 30));

        btnUpdate.setText("Update");
        jPanel12.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 100, 30));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel31.setText("Manage Users");
        jPanel12.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        lblId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblId.setText("0");
        jPanel12.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, -1, -1));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel33.setText("Email");
        jPanel12.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, -1, -1));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel34.setText("ID Users : ");
        jPanel12.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, -1, -1));

        add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 320));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblUsersDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Password", "Email", "Phone", "Role"
            }
        ));
        tblUsersDetail.setColorBordeFilas(new java.awt.Color(0, 112, 192));
        tblUsersDetail.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 10)); // NOI18N
        tblUsersDetail.setFuenteFilas(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        tblUsersDetail.setFuenteFilasSelect(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        tblUsersDetail.setFuenteHead(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tblUsersDetail.setRowHeight(20);
        jScrollPane3.setViewportView(tblUsersDetail);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 680, 170));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel22.setText("Data Users In Database");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        txtSearch.setText("Search ...");
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        jPanel4.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 530, -1));

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel4.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 70, 90, -1));

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 820, 320));
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchActionPerformed

    public DefaultTableModel getModel() {
        return model;
    }

    public void setModel(DefaultTableModel model) {
        this.model = model;
    }

    public JButton getBtnAdd() {
        return btnAdd;
    }

    public JButton getBtnDelete() {
        return btnDelete;
    }

    public JButton getBtnUpdate() {
        return btnUpdate;
    }

    public JLabel getLblId() {
        return lblId;
    }

    public JButton getBtnSearch() {
        return btnSearch;
    }

    public JTextField getTxtSearch() {
        return txtSearch;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbxRole;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblId;
    private rojerusan.RSTableMetro tblUsersDetail;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
