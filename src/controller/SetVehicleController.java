/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.DatabaseConnector;
import model.VehicleModel;
import view.AdminSetVehicleView;

/**
 *
 * @author TUF GAMING
 */
public class SetVehicleController extends DatabaseConnector{
    VehicleModel vehicleModel = new VehicleModel(0, 0, 0, "", "", "", "", "");
    int qty, id_type;
    AdminSetVehicleView adminSetVehicleView;
    String categories;
    
    public SetVehicleController(int qty, AdminSetVehicleView adminSetVehicleView, String categories, int id_type) {
        this.qty = qty;
        this.adminSetVehicleView = adminSetVehicleView;
        this.categories = categories;
        this.id_type = id_type;

        adminSetVehicleView.addButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){   
                boolean validFldLicense = false;
                for (JTextField textField : adminSetVehicleView.getTextFields()) {
                    String license = textField.getText();
                    adminSetVehicleView.getLicenseList().add(license);
                }
                        
                for (String license : adminSetVehicleView.getLicenseList()) {
                    if (license.isEmpty()) {
                        validFldLicense = false;
                        break;
                    } else {
                        validFldLicense = true;
                    }
                }
                if (validFldLicense) {
                    vehicleModel.addsVehicle(adminSetVehicleView.getLicenseList(), categories, id_type);
                    adminSetVehicleView.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Failed Updating vehicle, fill yo'r form !!", "Message", JOptionPane.ERROR_MESSAGE);
                }

            }
        });

    }
}