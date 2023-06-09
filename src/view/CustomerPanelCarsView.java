/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ManagePaymentController;
import controller.ManageRentalController;
import java.awt.Button;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.CustomerModel;
import rojeru_san.componentes.RSDateChooser;
import rojerusan.RSTableMetro;

/**
 *
 * @author TUF GAMING
 */
public class CustomerPanelCarsView extends javax.swing.JPanel {

    /**
     * Creates new form CustomerPanelCarView
     */
    DefaultTableModel model;
    CustomerModel customerModel;
    public CustomerPanelCarsView(CustomerModel customerModel) {
        initComponents();
        this.customerModel = customerModel;
        
        ManagePaymentController controller = new ManagePaymentController(this, customerModel, model);
        controller.setVehicleDetailToTable();
        System.out.println(customerModel.getId());
;
    }

    public JButton getBtnSearch() {
        return btnSearch;
    }

    public JTextField getTxtSearch() {
        return txtSearch;
    }

    public RSTableMetro getTblVehicleDetail() {
        return tblVehicleDetail;
    }

    public JButton getBtnRent() {
        return btnRent;
    }

    public RSDateChooser getEndRent() {
        return endRent;
    }

    public JTextField getFldForm() {
        return fldForm;
    }

    public RSDateChooser getStartRent() {
        return startRent;
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
        btnSearch = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblVehicleDetail = new rojerusan.RSTableMetro();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        endRent = new rojeru_san.componentes.RSDateChooser();
        startRent = new rojeru_san.componentes.RSDateChooser();
        btnRent = new javax.swing.JButton();
        fldForm = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(790, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Exotc350 Bd BT", 1, 24)); // NOI18N
        jLabel19.setText("Vehicle LIST");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        btnSearch.setText("Search");
        add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 120, 90, 30));

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 610, 30));

        tblVehicleDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "License", "Name", "Quantiity", "Price", "Description", "Categories", "Action"
            }
        ));
        tblVehicleDetail.setColorBordeFilas(new java.awt.Color(0, 112, 192));
        tblVehicleDetail.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 10)); // NOI18N
        tblVehicleDetail.setFuenteFilas(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        tblVehicleDetail.setFuenteFilasSelect(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        tblVehicleDetail.setFuenteHead(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tblVehicleDetail.setRowHeight(20);
        jScrollPane3.setViewportView(tblVehicleDetail);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 720, 350));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("End Rental ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 540, -1, -1));

        jLabel2.setText("Let's Rental a Vehicle Right Now");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Start Rental ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, -1, -1));

        endRent.setPlaceholder("Select a return date");
        add(endRent, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 580, 250, 30));

        startRent.setPlaceholder("Select a rental date");
        add(startRent, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 580, 250, 30));

        btnRent.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRent.setText("RENT");
        add(btnRent, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 580, 90, 80));
        add(fldForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 640, 580, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRent;
    private javax.swing.JButton btnSearch;
    private rojeru_san.componentes.RSDateChooser endRent;
    private javax.swing.JTextField fldForm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane3;
    private rojeru_san.componentes.RSDateChooser startRent;
    private rojerusan.RSTableMetro tblVehicleDetail;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
