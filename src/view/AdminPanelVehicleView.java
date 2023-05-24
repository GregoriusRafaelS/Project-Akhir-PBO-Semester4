/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ManageVehicleController;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import rojerusan.RSTableMetro;

/**
 *
 * @author TUF GAMING
 */
public class AdminPanelVehicleView extends javax.swing.JPanel {

    /**
     * Creates new form AdminPanelVehicleView
     */
    
    DefaultTableModel model;
    AdminHomesView adminHomeView;
    public AdminPanelVehicleView(AdminHomesView adminHomeView) {
        initComponents();
        this.adminHomeView = adminHomeView;
        
        ManageVehicleController controller = new ManageVehicleController(adminHomeView, this, model);
        controller.setVehicleDetailToTable();
    }

    public JButton getBtnAdd() {
        return btnAdd;
    }
    
    public JButton getBtnSearch() {
        return btnSearch;
    }

    public JButton getBtnUpdate() {
        return btnUpdate;
    }

    public JComboBox<String> getCbxCategories() {
        return cbxCategories;
    }

    public JTextArea getFldDescription() {
        return fldDescription;
    }

    public JLabel getLblLicense() {
        return lblLicense;
    }

    public JTextField getFldName() {
        return fldName;
    }

    public JTextField getFldPrice() {
        return fldPrice;
    }

    public JTextField getFldQuantity() {
        return fldQuantity;
    }

    public JPanel getPnlVehicleView() {
        return pnlVehicleView;
    }

    public RSTableMetro getTblVehicleDetail() {
        return tblVehicleDetail;
    }

    public JTextField getTxtSearch() {
        return txtSearch;
    }

    public JLabel getLblIdType() {
        return lblIdType;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlVehicleView = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        rSTableMetro2 = new rojerusan.RSTableMetro();
        jLabel21 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblVehicleDetail = new rojerusan.RSTableMetro();
        jLabel22 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        fldName = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        fldPrice = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        fldQuantity = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        fldDescription = new javax.swing.JTextArea();
        cbxCategories = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblIdType = new javax.swing.JLabel();
        lblLicense = new javax.swing.JLabel();

        pnlVehicleView.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSTableMetro2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"K 6425 XA", "Honda", "500000", "3", "Btn", null},
                {"BA 2225 XA", "Honda", "500000", "3", "Btn", null},
                {"K 6425 XA", "Honda", "500000", "3", "Btn", null},
                {"K 6425 XA", "Honda", "500000", null, "Btn", null}
            },
            new String [] {
                "License", "Name", "Quantiity", "Price", "Description", "Categories"
            }
        ));
        rSTableMetro2.setColorBordeFilas(new java.awt.Color(0, 112, 192));
        rSTableMetro2.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 10)); // NOI18N
        rSTableMetro2.setFuenteFilas(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        rSTableMetro2.setFuenteFilasSelect(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        rSTableMetro2.setFuenteHead(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rSTableMetro2.setRowHeight(20);
        jScrollPane2.setViewportView(rSTableMetro2);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 680, 170));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel21.setText("Data Vehicle In Database");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));

        pnlVehicleView.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 820, 320));

        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("License");
        jPanel11.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel11.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 170, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/dataUserNonActive.png"))); // NOI18N
        jPanel11.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 30, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Name");
        jPanel11.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel11.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 170, 30));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/dataUserNonActive.png"))); // NOI18N
        jPanel11.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 30, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Price");
        jPanel11.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, -1, -1));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel11.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 170, 30));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/dataUserNonActive.png"))); // NOI18N
        jPanel11.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 30, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Quantity");
        jPanel11.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/dataUserNonActive.png"))); // NOI18N
        jPanel11.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 30, 30));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel11.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 160, 30));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setText("Description");
        jPanel11.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/dataUserNonActive.png"))); // NOI18N
        jPanel11.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 30, 30));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel11.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 190, 110));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel11.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 70, -1));

        jButton1.setText("Delete");
        jPanel11.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 270, 100, 30));

        jButton2.setText("Add");
        jPanel11.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 100, 30));

        jButton3.setText("Update");
        jPanel11.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 100, 30));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel20.setText("Manage Data Vehicle");
        jPanel11.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        pnlVehicleView.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 820, 320));

        setPreferredSize(new java.awt.Dimension(820, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblVehicleDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "License", "Name", "Quantiity", "Price", "Description", "Categories"
            }
        ));
        tblVehicleDetail.setColorBordeFilas(new java.awt.Color(0, 112, 192));
        tblVehicleDetail.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 10)); // NOI18N
        tblVehicleDetail.setFuenteFilas(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        tblVehicleDetail.setFuenteFilasSelect(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        tblVehicleDetail.setFuenteHead(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tblVehicleDetail.setRowHeight(20);
        jScrollPane3.setViewportView(tblVehicleDetail);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 680, 170));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel22.setText("Data Vehicle In Database");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));

        txtSearch.setText("Search ...");
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        jPanel4.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 530, -1));

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel4.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 80, 90, -1));

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 820, 320));

        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("License");
        jPanel12.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/dataUserNonActive.png"))); // NOI18N
        jPanel12.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 30, 30));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel23.setText("Name");
        jPanel12.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        fldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldNameActionPerformed(evt);
            }
        });
        jPanel12.add(fldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 170, 30));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/name.png"))); // NOI18N
        jPanel12.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 30, 30));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel25.setText("Price");
        jPanel12.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, -1, -1));

        fldPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldPriceActionPerformed(evt);
            }
        });
        jPanel12.add(fldPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 170, 30));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/price.png"))); // NOI18N
        jPanel12.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 30, 30));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel27.setText("Quantity");
        jPanel12.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, -1, -1));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/quantity.png"))); // NOI18N
        jPanel12.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 30, 30));

        fldQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldQuantityActionPerformed(evt);
            }
        });
        jPanel12.add(fldQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 160, 30));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel29.setText("Description");
        jPanel12.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, -1, -1));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/description.png"))); // NOI18N
        jPanel12.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, 30, 30));

        fldDescription.setColumns(20);
        fldDescription.setRows(5);
        jScrollPane4.setViewportView(fldDescription);

        jPanel12.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 210, 70));

        cbxCategories.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "car", "motorcycle" }));
        jPanel12.add(cbxCategories, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 100, -1));

        btnAdd.setText("Add");
        jPanel12.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 100, 30));

        btnUpdate.setText("Update");
        jPanel12.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 100, 30));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel31.setText("Manage Data Vehicle");
        jPanel12.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("ID Type :");
        jPanel12.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, -1, -1));

        lblIdType.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblIdType.setText("0");
        jPanel12.add(lblIdType, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 70, -1, -1));

        lblLicense.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblLicense.setText("-");
        jPanel12.add(lblLicense, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 170, 30));

        add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 320));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void fldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldNameActionPerformed

    private void fldPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldPriceActionPerformed

    private void fldQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldQuantityActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbxCategories;
    private javax.swing.JTextArea fldDescription;
    private javax.swing.JTextField fldName;
    private javax.swing.JTextField fldPrice;
    private javax.swing.JTextField fldQuantity;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lblIdType;
    private javax.swing.JLabel lblLicense;
    private javax.swing.JPanel pnlVehicleView;
    private rojerusan.RSTableMetro rSTableMetro2;
    private rojerusan.RSTableMetro tblVehicleDetail;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
