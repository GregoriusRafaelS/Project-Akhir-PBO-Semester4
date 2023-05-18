package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import model.CustomerModel;

public class CustomerHomeView extends JFrame{
    
    public CustomerHomeView(CustomerModel customerModel) {
        JLabel lblTitle = new JLabel("Selamat Datang " + customerModel.getName());
                
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
