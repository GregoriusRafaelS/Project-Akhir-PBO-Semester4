package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class AdminSetVehicleView extends JFrame {
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
        setLayout(null); // Gunakan layout manager null untuk mengatur posisi komponen secara manual

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

        // Initialize lists
        labels = new ArrayList<>();
        textFields = new ArrayList<>();

        // Create GridBagConstraints
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.CENTER; // Mengatur anchor ke CENTER
        gbc.insets = new Insets(10, 10, 10, 10); // Jarak antara komponen

        // Add lblTitle to mainPanel
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2; // Mengatur gridwidth menjadi 2 agar lblTitle memenuhi 2 kolom
        mainPanel.add(lblTitle, gbc);

        // Reset gridwidth
        gbc.gridwidth = 1;

        // Add labels and text fields to the panel
        for (int i = 1; i <= numberOfFields; i++) {
            JLabel label = new JLabel("License vehicle - " + i);
            JTextField textField = new JTextField(20);

            labels.add(label);
            textFields.add(textField);

            // Set GridBagConstraints for each component
            gbc.gridx = 0;
            gbc.gridy = i;
            mainPanel.add(label, gbc);

            gbc.gridx = 1;
            mainPanel.add(textField, gbc);
        }
          
        
        // Add "Add License" button
        gbc.gridx = 0;
        gbc.gridy = numberOfFields + 1; // Mengatur posisi pada baris setelah label dan text field terakhir
        gbc.gridwidth = 2; // Mengatur gridwidth menjadi 2 agar tombol memenuhi 2 kolom
        mainPanel.add(addButton, gbc);
        
        // Set the content pane
        setContentPane(scrollPane);

        // Set the content pane
        setContentPane(scrollPane);

        // Pack the JFrame
        pack();

        // Set JFrame location to the center of the screen
        setLocationRelativeTo(null);

        // Display the JFrame
        setVisible(true);
        
        
    }

    public List<JTextField> getTextFields() {
        return textFields;
    }

    public List<String> getLicenseList() {
        return licenseList;
    }
    
    
    
    
}
