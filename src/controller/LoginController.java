/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.AdminModel;
import model.CustomerModel;
import model.UserModel;
import view.AdminHomeView;
import view.CustomerHomeView;
import view.LoginView;
import view.RegisterView;

/**
 *
 * @author TUF GAMING
 */
public class LoginController {
    UserModel userModel;
    LoginView loginView;
    
    public LoginController(UserModel userModel, LoginView loginView){
        this.userModel = userModel;
        this.loginView = loginView;
        
        loginView.btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                String name = loginView.getName();
                String password = loginView.getPassword();
                
                if(userModel.loginUser(name, password).equals("admin")){
                    JOptionPane.showMessageDialog(null, "Login Success");            
                    
                    AdminModel adminModel = new AdminModel(userModel.getId(), userModel.getName(), userModel.getPass(), userModel.getEmail(), userModel.getPhone(), userModel.getRole(), userModel.getCreated_at(), userModel.getUpdated_at());
                    AdminHomeView adminHomeView = new AdminHomeView(adminModel);
                    AdminController adminController = new AdminController(adminModel, adminHomeView);
                    loginView.dispose();
                }else if(userModel.loginUser(name, password).equals("customer")){
                    JOptionPane.showMessageDialog(null, "Login Success");
                    
                    CustomerModel customerModel = new CustomerModel(userModel.getId(), userModel.getName(), userModel.getPass(), userModel.getEmail(), userModel.getPhone(), userModel.getRole(), userModel.getCreated_at(), userModel.getUpdated_at());
                    CustomerHomeView customerHomeView = new CustomerHomeView(customerModel);
                    CustomerController customerController = new CustomerController(customerModel, customerHomeView);
                    loginView.dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "Failed Login");
                }
                
                
            }
        });
        
        loginView.btnRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                RegisterView registerView = new RegisterView();
                RegisterController registerController = new RegisterController(userModel, registerView);
                loginView.dispose();
            }
        });
        
    }
    
    
    }
//}
