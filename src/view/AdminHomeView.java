/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import model.AdminModel;
import model.CustomerModel;

/**
 *
 * @author TUF GAMING
 */
public class AdminHomeView extends JFrame {
    
    public AdminHomeView(AdminModel adminModel) {
        JLabel lblTitle = new JLabel("Selamat Datang " + adminModel.getName());
                
        setSize(1000, 700);
        setTitle("Rental Car System");
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        add(lblTitle);
        
        lblTitle.setBounds(460, 150, 200, 50);
    }
}
