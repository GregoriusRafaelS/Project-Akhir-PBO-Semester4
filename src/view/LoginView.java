package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class LoginView extends JFrame{
    JLabel lblTitle = new JLabel("LOGIN PAGE");
    
    JLabel lblName = new JLabel("Name");
    JTextField fldName = new JTextField();
    
    JLabel lblPass = new JLabel("Password");
    JPasswordField fldPass = new JPasswordField();
    
    JLabel lblRegister = new JLabel("Dont have an account ?");
    public JButton btnRegister = new JButton("Register Now");
    
    public JButton btnLogin = new JButton("Login");
    
    public LoginView() {
        setSize(1000, 700);
        setTitle("Rental Car System");
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        add(lblTitle);
        add(lblName);
        add(lblPass);
        add(fldName);
        add(fldPass);
        add(lblRegister);
        add(btnRegister);
        add(btnLogin);
        
        lblTitle.setBounds(460, 150, 80, 50);
        
        lblName.setBounds(370, 220, 100, 30);
        fldName.setBounds(370, 250, 250, 30);
        
        lblPass.setBounds(370, 280, 100, 30);
        fldPass.setBounds(370, 310, 250, 30);
        
        lblRegister.setBounds(430, 350, 150, 30);
        btnRegister.setBounds(550, 350, 120, 30);
        
        btnLogin.setBounds(395, 400, 200, 30);
    }
    
    public String getName(){
        return fldName.getText();
    }
    
    public String getPassword(){
        return String.valueOf(fldPass.getPassword());
    }
}
