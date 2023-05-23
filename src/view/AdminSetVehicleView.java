/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TUF GAMING
 */
public class AdminSetVehicleView extends JFrame {
    
    /**
     * Creates new form AdminSetVehicleView
     */
    
    private JPanel mainPanel;
    private JScrollPane scrollPane;
    private List<JLabel> labels;
    private List<JTextField> textFields;
    private int numberOfFields;
    public JButton addButton = new JButton("Add License");
    public List<String> licenseList = new ArrayList<>();

    

    public AdminSetVehicleView(int numberOfFields) {
        this.numberOfFields = numberOfFields;

        setTitle("Add License Car");
        setLayout(null); 

        JLabel lblTitle = new JLabel("Add License Vehicle");
        lblTitle.setBounds(100, 30, 200, 20);
        add(lblTitle); 

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(600, 400));

        // Create main panel with GridBagLayout
        mainPanel = new JPanel(new GridBagLayout());
        mainPanel.add(lblTitle);
        
        // Create scroll pane
        scrollPane = new JScrollPane(mainPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setPreferredSize(new Dimension(600, 400));

        labels = new ArrayList<>();
        textFields = new ArrayList<>();

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(10, 10, 10, 10);

        
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2; 
        mainPanel.add(lblTitle, gbc);

        gbc.gridwidth = 1;

        for (int i = 1; i <= numberOfFields; i++) {
            JLabel label = new JLabel("License vehicle - " + i);
            JTextField textField = new JTextField(20);

            labels.add(label);
            textFields.add(textField);

            gbc.gridx = 0;
            gbc.gridy = i;
            mainPanel.add(label, gbc);

            gbc.gridx = 1;
            mainPanel.add(textField, gbc);
        }
          
        gbc.gridx = 0;
        gbc.gridy = numberOfFields + 1;
        gbc.gridwidth = 2;
        mainPanel.add(addButton, gbc);
        
        setContentPane(scrollPane);

        setContentPane(scrollPane);

        pack();

        setLocationRelativeTo(null);

        setVisible(true);
        
        
    }

    public List<JTextField> getTextFields() {
        return textFields;
    }

    public List<String> getLicenseList() {
        return licenseList;
    }
    
    
    
    
}
