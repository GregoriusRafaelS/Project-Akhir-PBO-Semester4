/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import model.AdminModel;
import view.AdminHomeView;
import view.AdminHomesView;
import view.AdminPanelVehicleView;
import view.AdminVehicleView;


/**
 *
 * @author TUF GAMING
 */
public class AdminController{
    AdminModel adminModel;
    AdminHomesView adminHomeView;
    public AdminController(AdminModel adminModel, AdminHomesView adminHomeView){
        this.adminModel = adminModel;
        this.adminHomeView = adminHomeView;
        
        adminHomeView.getLblVehicleView().addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("ss");
//                AdminVehicleView adminVehicleView = new AdminVehicleView();
//                adminVehicleView.show();
//                adminHomeView.dispose();
//                  AdminPanelVehicleView adminPanelVehicleView = new AdminPanelVehicleView();
//                  adminHomeView.setPnlDefaultAdmin(adminPanelVehicleView);
                  switchPanels(adminHomeView.getPnlVehicleAdmin());
              }
          });
        
        adminHomeView.getLblDashboardView().addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("ss");
//                AdminVehicleView adminVehicleView = new AdminVehicleView();
//                adminVehicleView.show();
//                adminHomeView.dispose();
//                  AdminPanelVehicleView adminPanelVehicleView = new AdminPanelVehicleView();
//                  adminHomeView.setPnlDefaultAdmin(adminPanelVehicleView);
                  switchPanels(adminHomeView.getPnlDefaultAdmin());
              }
          });
      
          
//        adminVehicleView.getlblHomeView().addMouseListener(new MouseAdapter(){
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                AdminVehicleView adminVehicleView = new AdminVehicleView();
//                adminVehicleView.show();
//                adminHomeView.dispose();
//              }
//          });
    }
      public void switchPanels(JPanel panel){
            adminHomeView.getLayeredPane().removeAll();
            adminHomeView.getLayeredPane().add(adminHomeView.getjPanel1());
            adminHomeView.getLayeredPane().add(adminHomeView.getjPanel4());
            adminHomeView.getLayeredPane().add(panel).setBounds(180, 60, 820, 640);
            adminHomeView.getLayeredPane().repaint();
            adminHomeView.getLayeredPane().revalidate();
      }
}
