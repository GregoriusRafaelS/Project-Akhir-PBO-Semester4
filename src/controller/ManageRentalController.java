/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.table.DefaultTableModel;
import model.RentalModel;
import model.VehicleModel;
import view.AdminPanelRecordsView;

/**
 *
 * @author TUF GAMING
 */
public class ManageRentalController {
    VehicleModel vehicleModel = new VehicleModel(0, 0, 0, "", "", "", "");
    DefaultTableModel model;
    AdminPanelRecordsView adminPanelRecordsView;
    
    public ManageRentalController(AdminPanelRecordsView adminPanelRecordsView, DefaultTableModel model) {
        this.model = model;
        this.adminPanelRecordsView = adminPanelRecordsView;
        
        adminPanelRecordsView.getBtnSearch().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {        
                String license = adminPanelRecordsView.getTxtSearch().getText();
                VehicleModel vehicle = vehicleModel.searchVehicleByLicense(license);
                clearVehicleTable();
                
                final DefaultTableModel model = (DefaultTableModel) adminPanelRecordsView.getTblRecordsDetail().getModel();
                Object[] obj = {vehicle.getId_vehicle(), vehicle.getName(), vehicle.getQuantity(), vehicle.getPrice(), vehicle.getDescription(), vehicle.getCategories()};
                setModel(model);
                model.addRow(obj);
            }
        });  
        
        adminPanelRecordsView.getTxtSearch().addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (adminPanelRecordsView.getTxtSearch().getText().equals("Search ...")) {
                    adminPanelRecordsView.getTxtSearch().setText("");
                    adminPanelRecordsView.getTxtSearch().setForeground(Color.BLACK);
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                if (adminPanelRecordsView.getTxtSearch().getText().isEmpty()) {
                    adminPanelRecordsView.getTxtSearch().setForeground(Color.GRAY);
                    adminPanelRecordsView.getTxtSearch().setText("Search ...");
                }
            }
        });
    }
    
    public void setRecordsDetailToTable(){
        RentalModel rentalModel = new RentalModel(0, "", "", "", "", "");
        RentalModel[] rental = rentalModel.putAllData();
        int i=0;
        int price;
        String id_vehicle, username, start_rental, end_rental,  return_date;

        while(i < rental.length){
            username = rental[i].getUsername();
            price = rental[i].getPrice();
            id_vehicle = rental[i].getId_vehicle();
            start_rental = rental[i].getStart_rental();
            end_rental = rental[i].getEnd_rental();
            return_date = rental[i].getReturn_date();
            if(return_date == null){
                return_date = "Still borrowed";
            }
            Object[] obj = {username, id_vehicle, price, start_rental, end_rental, return_date};
            model = (DefaultTableModel)adminPanelRecordsView.getTblRecordsDetail().getModel();
            model.addRow(obj);
            i++;
        }
    }
    
    public void clearVehicleTable(){
       DefaultTableModel model = (DefaultTableModel)adminPanelRecordsView.getTblRecordsDetail().getModel(); 
       model.setRowCount(0);
   }

    public void setModel(DefaultTableModel model) {
        this.model = model;
    }

}