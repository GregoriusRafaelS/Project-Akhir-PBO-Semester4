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
import javax.swing.table.DefaultTableModel;
import model.AdminModel;
import model.UserModel;
import view.AdminHomeView;
import view.AdminHomesView;
import view.AdminPanelHomeView;
import view.AdminPanelRecordsView;
import view.AdminPanelUsersView;
import view.AdminPanelVehicleView;
import view.LoginView;


/**
 *
 * @author TUF GAMING
 */
public class AdminController{
    AdminModel adminModel;
    AdminHomesView adminHomeView;
    DefaultTableModel model;
    
    public AdminController(AdminModel adminModel, AdminHomesView adminHomeView){
        this.adminModel = adminModel;
        this.adminHomeView = adminHomeView;
        
        adminHomeView.getLblVehicleView().addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("ss");
                  AdminPanelVehicleView adminPanelVehicleView = new AdminPanelVehicleView();
                  switchPanels(adminPanelVehicleView);
              }
          });
        
        adminHomeView.getLblDashboardView().addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("ss");
                  AdminPanelHomeView adminPanelHomeView = new AdminPanelHomeView();
                  switchPanels(adminPanelHomeView);
              }
          });

        adminHomeView.getLblLogoutView().addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                  System.out.println("ss");
                  adminHomeView.dispose();
                  LoginView loginView = new LoginView();
              }
        });
                  
        adminHomeView.getLblUsersView().addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                  System.out.println("sss");
                  AdminPanelUsersView adminPanelUsersView = new AdminPanelUsersView();
                  switchPanels(adminPanelUsersView);
              }
          });
                  
          
        adminHomeView.getLblRecordsView().addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("sss");
                AdminPanelRecordsView adminPanelRecordsView = new AdminPanelRecordsView();
                switchPanels(adminPanelRecordsView);
              }
          });
        
        adminHomeView.getLblRecordsView().addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("sss");
                AdminPanelRecordsView adminPanelRecordsView = new AdminPanelRecordsView();
                switchPanels(adminPanelRecordsView);
              }
          });
        }
    
      public void switchPanels(JPanel panel){
            adminHomeView.getLayeredPane().removeAll();
            adminHomeView.getLayeredPane().add(adminHomeView.getjPanel1());
            adminHomeView.getLayeredPane().add(adminHomeView.getjPanel4());
            adminHomeView.getLayeredPane().add(panel).setBounds(180, 60, 820, 640);
            System.out.println("ss");
            adminHomeView.getLayeredPane().repaint();
            adminHomeView.getLayeredPane().revalidate();
      }
      
}
