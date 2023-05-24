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
import model.CustomerModel;
import model.UserModel;
import view.AdminHomesView;
import view.AdminPanelRecordsView;
import view.CustomerHomeView;
import view.CustomerPanelCarsView;
import view.CustomerPanelHistoryView;
import view.CustomerPanelReturnView;
import view.LoginView;

/**
 *
 * @author TUF GAMING
 */
public class CustomerController {
    CustomerHomeView customerHomeView;
    
    CustomerModel customerModel;
    public CustomerController(CustomerModel customerModel, CustomerHomeView customerHomeView){
        this.customerModel = customerModel;
        this.customerHomeView = customerHomeView;
        System.out.println(customerModel.getPhone());


        customerHomeView.getBtnList().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){ 
            CustomerPanelCarsView customerPanelCarsView = new CustomerPanelCarsView(customerModel);
            switchPanels(customerPanelCarsView);
                     System.out.println(customerModel.getId());
          }
        });
        
        customerHomeView.getBtnReturn().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
            CustomerPanelReturnView customerPanelReturnView = new CustomerPanelReturnView(customerModel);
            switchPanels(customerPanelReturnView);
          }
        });
        
        customerHomeView.getBtnHistory().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
            CustomerPanelHistoryView customerPanelHistoryView = new CustomerPanelHistoryView(customerModel);
            switchPanels(customerPanelHistoryView);
          }
        });
        
        customerHomeView.getBtnLogout().addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                  LoginView loginView = new LoginView();
                  LoginController loginController = new LoginController(customerModel, loginView);
                  customerHomeView.dispose();
              }
        });
    }
    
    public void switchPanels(JPanel panel){
        customerHomeView.getLayeredPane().removeAll();
        customerHomeView.getLayeredPane().add(customerHomeView.getjPanel3());
        customerHomeView.getLayeredPane().add(panel).setBounds(210, 0, 820, 700);
        customerHomeView.getLayeredPane().repaint();
        customerHomeView.getLayeredPane().revalidate();
    }
}
