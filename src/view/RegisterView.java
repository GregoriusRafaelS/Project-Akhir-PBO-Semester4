package view;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class RegisterView extends JFrame{
    public String pass = "hidePass";
    public String imgPass = "./src/assets/hidePass.png";

    JLabel lblTitle = new JLabel("REGISTER PAGE");

    JLabel lblName = new JLabel("Name");
    JTextField fldName = new JTextField();
    
    JLabel lblEmail = new JLabel("Email");
    JTextField fldEmail = new JTextField();
    
    JLabel lblPass = new JLabel("Password");
    public JPasswordField fldPass = new JPasswordField();
    
    public ImageIcon showPassword = new ImageIcon(new ImageIcon(imgPass).getImage().getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH));
    public JButton btnPass = new JButton(null, showPassword);
        
    JLabel lblPhone = new JLabel("Phone");
    JTextField fldPhone = new JTextField();
    
    JLabel lblRegister = new JLabel("Already have an account ?");
    public JButton btnLogin = new JButton("Login Now");
   
    public JButton btnRegister = new JButton("Register");
    
//    public String checkBtn(){
//        return this.imgPass = (imgPass == null ) ? "C:\\Users\\TUF GAMING\\OneDrive\\Documents\\NetBeansProjects\\RentalCarSystem\\src\\assets\\showPass.png" : imgPass;
//    }
//    public JButton updateBtn(){
//        ImageIcon showPassword = new ImageIcon(new ImageIcon(imgPass).getImage().getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH));
//        System.out.println(imgPass);
//        return this.btnPass;
//    }
    
    public RegisterView() {
//        checkBtn();
//        updateBtn();
        setSize(1000, 700);
        setTitle("Rental Car System");
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        add(lblTitle);
        add(lblName);
        add(lblPass);
        add(lblEmail);
        add(lblPhone);
        add(lblRegister);
        add(fldName);
        add(fldPass);
        add(fldEmail);
        add(fldPhone);
        add(btnRegister);
        add(btnLogin);
        add(btnPass);
        
        btnPass.setOpaque(false);
        btnPass.setContentAreaFilled(false);
        btnPass.setBorderPainted(false);
        
        btnLogin.setOpaque(false);
        btnLogin.setContentAreaFilled(false);
        btnLogin.setBorderPainted(false);
        
        lblTitle.setBounds(450, 100, 100, 50);
        
        lblName.setBounds(370, 170, 100, 30);
        fldName.setBounds(370, 200, 250, 30);
        
        lblEmail.setBounds(370, 230, 100, 30);
        fldEmail.setBounds(370, 260, 250, 30);
        
        lblPass.setBounds(370, 290, 100, 30);
        fldPass.setBounds(370, 320, 250, 30);
        btnPass.setBounds(620, 320, 40, 30);
        
        lblPhone.setBounds(370, 350, 100, 30);
        fldPhone.setBounds(370, 380, 250, 30);
        
        lblRegister.setBounds(410, 420, 150, 30);
        btnRegister.setBounds(395, 470, 200, 30);
        
        btnLogin.setBounds(530, 420, 120, 30);
    }
    
    public String getName(){
        return fldName.getText();
    }
    
    public String getPassword(){
        return String.valueOf(fldPass.getPassword());
    }

    public String getEmail() {
        return fldEmail.getText();
    }

    public String getPhone() {
        return fldPhone.getText();
    }

    public void setBtnPass(ImageIcon showPassword) {
        btnPass.setIcon(showPassword);
    }
    
    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPass() {
        return pass;
    }

    public void setShowPassword(String imgPass) {
        this.showPassword = new ImageIcon(new ImageIcon(imgPass).getImage().getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH));
    }

    public ImageIcon getShowPassword() {
        return showPassword;
    }
    
    
}
