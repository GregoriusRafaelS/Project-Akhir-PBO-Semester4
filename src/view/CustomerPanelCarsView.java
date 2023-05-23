/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ManageRentalController;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TUF GAMING
 */
public class CustomerPanelCarsView extends javax.swing.JPanel {

    /**
     * Creates new form CustomerPanelCarView
     */
    DefaultTableModel model;
    public CustomerPanelCarsView() {
        initComponents();
        
//        ManagePaymentController controller = new ManagePaymentController(this, model);
//        controller.setRecordsDetailToTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel19 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblVehicleDetail = new rojerusan.RSTableMetro();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rSDateChooser1 = new rojeru_san.componentes.RSDateChooser();
        rSDateChooser2 = new rojeru_san.componentes.RSDateChooser();

        setPreferredSize(new java.awt.Dimension(790, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Exotc350 Bd BT", 1, 24)); // NOI18N
        jLabel19.setText("Vehicle LIST");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jButton1.setText("Search");
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 160, 90, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 610, -1));

        tblVehicleDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "License", "Name", "Quantiity", "Price", "Description", "Categories", "Rental"
            }
        ));
        tblVehicleDetail.setColorBordeFilas(new java.awt.Color(0, 112, 192));
        tblVehicleDetail.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 10)); // NOI18N
        tblVehicleDetail.setFuenteFilas(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        tblVehicleDetail.setFuenteFilasSelect(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        tblVehicleDetail.setFuenteHead(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tblVehicleDetail.setRowHeight(20);
        jScrollPane3.setViewportView(tblVehicleDetail);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 730, 410));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("End Rental ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, -1, -1));

        jLabel2.setText("Let's Rental a Vehicle Right Now");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Start Rental ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        rSDateChooser1.setPlaceholder("Select a return date");
        add(rSDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 250, 30));

        rSDateChooser2.setPlaceholder("Select a rental date");
        add(rSDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 250, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private rojeru_san.componentes.RSDateChooser rSDateChooser1;
    private rojeru_san.componentes.RSDateChooser rSDateChooser2;
    private rojerusan.RSTableMetro tblVehicleDetail;
    // End of variables declaration//GEN-END:variables
}