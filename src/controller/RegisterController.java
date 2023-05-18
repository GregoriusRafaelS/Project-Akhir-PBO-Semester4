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
public class RegisterController {
    UserModel userModel;
    RegisterView registerView;
    
    public RegisterController(UserModel userModel, RegisterView registerView){
        this.userModel = userModel;
        this.registerView = registerView;
        
        registerView.btnRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                String name = registerView.getName();
                String password = registerView.getPassword();
                String email = registerView.getEmail();
                String phone = registerView.getPhone();                
                
                if(name.isEmpty() || password.isEmpty() || email.isEmpty() || phone.isEmpty() ){
                    JOptionPane.showMessageDialog(null, "Please Enter fill You'r form !!", "Message", JOptionPane.ERROR_MESSAGE);
                }else if(!userModel.isValidName(name)){
                    JOptionPane.showMessageDialog(null, "Use another name !!", "Message", JOptionPane.ERROR_MESSAGE);
                }else if(!userModel.isValidEmail(email)){
                    JOptionPane.showMessageDialog(null, "Please Input a valid email address !!", "Message", JOptionPane.ERROR_MESSAGE);
                }else if(!userModel.isValidPassword(password)){
                    JOptionPane.showMessageDialog(null, "Your password must meet the following criteria : \n Must have at least one numeric character \n Must have at least one lowercase character \n Must have at least one uppercase character \n Must have at least one special symbol among @#$% \n Password length should be between 8 and 20", "Message", JOptionPane.ERROR_MESSAGE);
                }else if(!userModel.isValidPhone(phone)){
                    JOptionPane.showMessageDialog(null, "Please Input a valid phone nuber !!", "Message", JOptionPane.ERROR_MESSAGE);
                }else{
                    userModel.registerUser(name, password, email, phone);
                    JOptionPane.showMessageDialog(null, "Succes Adding new account !!");
                    LoginView loginView = new LoginView();
                    LoginController loginController = new LoginController(userModel, loginView);
                }
            }
        });
        
        registerView.btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                LoginView loginView = new LoginView();
                LoginController loginController = new LoginController(userModel, loginView);
                registerView.dispose();
            }
        });
       
        registerView.btnPass.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                System.out.println("HEHE");
                if(registerView.pass.equals("hide password")){
                    registerView.fldPass.setEchoChar((char)0);
                    registerView.pass = "show password";
                    registerView.imgPass = "C:\\Users\\TUF GAMING\\OneDrive\\Documents\\NetBeansProjects\\RentalCarSystem\\src\\assets\\hidePass.png";
                }else{
                    registerView.fldPass.setEchoChar('*');
                    registerView.pass = "hide password";
                    registerView.imgPass = "C:\\Users\\TUF GAMING\\OneDrive\\Documents\\NetBeansProjects\\RentalCarSystem\\src\\assets\\showPass.png";
                }
                
            }
        });
        
    }
    
    
    }
//}
