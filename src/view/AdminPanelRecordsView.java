/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author TUF GAMING
 */
public class AdminPanelRecordsView extends javax.swing.JPanel {

    /**
     * Creates new form AdminPanelRecordsView
     */
    public AdminPanelRecordsView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        rSTableMetro3 = new rojerusan.RSTableMetro();
        jLabel22 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        rSTableMetro4 = new rojerusan.RSTableMetro();
        jLabel23 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(820, 640));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSTableMetro3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"K 6425 XA", "Honda", "500000", "3", "Btn", null},
                {"BA 2225 XA", "Honda", "500000", "3", "Btn", null},
                {"K 6425 XA", "Honda", "500000", "3", "Btn", null},
                {"K 6425 XA", "Honda", "500000", null, "Btn", null}
            },
            new String [] {
                "Username", "Licesce", "Name Car", "start_rental", "end_rental", "type"
            }
        ));
        rSTableMetro3.setColorBordeFilas(new java.awt.Color(0, 112, 192));
        rSTableMetro3.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 10)); // NOI18N
        rSTableMetro3.setFuenteFilas(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        rSTableMetro3.setFuenteFilasSelect(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        rSTableMetro3.setFuenteHead(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rSTableMetro3.setRowHeight(20);
        jScrollPane3.setViewportView(rSTableMetro3);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 680, 170));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel22.setText("Records Pending Approval");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 320));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSTableMetro4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Name car", "Pice", "Start", "End", "Returned"
            }
        ));
        rSTableMetro4.setColorBordeFilas(new java.awt.Color(0, 112, 192));
        rSTableMetro4.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 10)); // NOI18N
        rSTableMetro4.setFuenteFilas(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        rSTableMetro4.setFuenteFilasSelect(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        rSTableMetro4.setFuenteHead(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rSTableMetro4.setRowHeight(20);
        jScrollPane4.setViewportView(rSTableMetro4);

        jPanel5.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 680, 170));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel23.setText("Data Transaction");
        jPanel5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, -1, -1));

        txtSearch.setText("Search ...");
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        jPanel5.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 530, -1));

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel5.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 70, 90, -1));

        add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 820, 320));
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private rojerusan.RSTableMetro rSTableMetro3;
    private rojerusan.RSTableMetro rSTableMetro4;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
