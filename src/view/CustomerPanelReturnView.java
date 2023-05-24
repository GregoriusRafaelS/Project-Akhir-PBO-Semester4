/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ManageReturnController;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.CustomerModel;
import rojerusan.RSTableMetro;

/**
 *
 * @author TUF GAMING
 */
public class CustomerPanelReturnView extends javax.swing.JPanel {

    /**
     * Creates new form CustomerPanelReturnView
     */
     CustomerModel customerModel;
     DefaultTableModel model;
    
    public CustomerPanelReturnView(CustomerModel customerModel) {
        initComponents();
        this.customerModel = customerModel;
        
        ManageReturnController controller = new ManageReturnController(this, customerModel, model);
        controller.setVehicleDetailToTable();
    }

    public JButton getBtnReturn() {
        return btnReturn;
    }

    public JTextField getFldId() {
        return fldId;
    }

    public RSTableMetro getTblVehicleDetail() {
        return tblVehicleDetail;
    }

   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        tblVehicleDetail = new rojerusan.RSTableMetro();
        jLabel19 = new javax.swing.JLabel();
        fldId = new javax.swing.JTextField();
        btnReturn = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(790, 700));
        setPreferredSize(new java.awt.Dimension(790, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblVehicleDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id_rental", "License", "start", "end", "return", "Price"
            }
        ));
        tblVehicleDetail.setColorBordeFilas(new java.awt.Color(0, 112, 192));
        tblVehicleDetail.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 10)); // NOI18N
        tblVehicleDetail.setFuenteFilas(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        tblVehicleDetail.setFuenteFilasSelect(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        tblVehicleDetail.setFuenteHead(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tblVehicleDetail.setRowHeight(20);
        jScrollPane3.setViewportView(tblVehicleDetail);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 730, 460));

        jLabel19.setFont(new java.awt.Font("Exotc350 Bd BT", 1, 24)); // NOI18N
        jLabel19.setText("Return You'r Rental Vehicle");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));
        add(fldId, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 600, 30));

        btnReturn.setText("Return Now");
        add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 110, -1, 30));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReturn;
    private javax.swing.JTextField fldId;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JScrollPane jScrollPane3;
    private rojerusan.RSTableMetro tblVehicleDetail;
    // End of variables declaration//GEN-END:variables
}
