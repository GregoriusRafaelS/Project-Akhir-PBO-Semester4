package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class LoginView extends JFrame{
    public String pass = "hide password";
    public String imgPass = "C:\\Users\\TUF GAMING\\OneDrive\\Documents\\NetBeansProjects\\RentalCarSystem\\src\\assets\\hidePass.png";
    
    JLabel lblTitle = new JLabel("LOGIN PAGE");
    
    JLabel lblName = new JLabel("Name");
    JTextField fldName = new JTextField();
    
    JLabel lblPass = new JLabel("Password");
    public JPasswordField fldPass = new JPasswordField();
    
    public ImageIcon showPassword = new ImageIcon(new ImageIcon(imgPass).getImage().getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH));
//    ImageIcon showPassword = new ImageIcon("./assets/showPass.png");
    public JButton btnPass = new JButton(null, showPassword);
    
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
        add(btnPass);
        
        btnPass.setOpaque(false);
        btnPass.setContentAreaFilled(false);
        btnPass.setBorderPainted(false);
        
        btnRegister.setOpaque(false);
        btnRegister.setContentAreaFilled(false);
        btnRegister.setBorderPainted(false);
        
        lblTitle.setBounds(460, 150, 80, 50);
        
        lblName.setBounds(370, 220, 100, 30);
        fldName.setBounds(370, 250, 250, 30);
        
        lblPass.setBounds(370, 280, 100, 30);
        fldPass.setBounds(370, 310, 250, 30);
        btnPass.setBounds(620, 310, 40, 30);
        
        lblRegister.setBounds(400, 350, 150, 30);
        btnRegister.setBounds(520, 350, 120, 30);
        
        btnLogin.setBounds(395, 400, 200, 30);
    }
    
    public String getName(){
        return fldName.getText();
    }
    
    public String getPassword(){
        return String.valueOf(fldPass.getPassword());
    }
}
