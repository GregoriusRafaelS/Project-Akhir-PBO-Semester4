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
import view.CustomerPanelPaymentView;
import view.CustomerPanelReturnView;

/**
 *
 * @author TUF GAMING
 */
public class CustomerController {
    CustomerHomeView customerHomeView;
    
    UserModel userModel = new UserModel(0, "", "", "", "", "", "", "");
    public CustomerController(CustomerModel customerModel, CustomerHomeView customerHomeView){
        this.userModel = customerModel;
        this.customerHomeView = customerHomeView;
        
        customerHomeView.getBtnList().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
            CustomerPanelCarsView customerPanelCarsView = new CustomerPanelCarsView();
            switchPanels(customerPanelCarsView);
          }
        });
        
        customerHomeView.getBtnReturn().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
            CustomerPanelReturnView customerPanelReturnView = new CustomerPanelReturnView();
            switchPanels(customerPanelReturnView);
          }
        });
        
        customerHomeView.getBtnHistory().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
            CustomerPanelPaymentView customerPanelPaymentView = new CustomerPanelPaymentView();
            switchPanels(customerPanelPaymentView);
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
