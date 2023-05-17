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
import model.UserModel;
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
//                        AdminView adminView = new AdminView();
//                        AdminModel adminModel = new AdminModel();
//                        AdminController AdminController = new AdminController(adminModel, adminView);
//                    loginView.dispose();
                }else if(userModel.loginUser(name, password).equals("customer")){
                    JOptionPane.showMessageDialog(null, "Login Success");
//                        ParkingDataModel parkingDataModel = new ParkingDataModel();
//                        ParkingPageView parkingPageView = new ParkingPageView();
//                        ParkingPageController ppc = new ParkingPageController(parkingDataModel, parkingPageView, username);
//                    loginView.dispose();
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
