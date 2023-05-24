/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import model.CustomerModel;
import model.RentalModel;
import model.VehicleModel;
import rojeru_san.componentes.RSDateChooser;
import view.CustomerPanelCarsView;

/**
 *
 * @author TUF GAMING
 */
public class ManagePaymentController {
    VehicleModel vehicleModel = new VehicleModel(0, 0, 0, "", "", "", "", "");

    CustomerPanelCarsView customerPanelCarsView;
    CustomerModel customerModel;
    DefaultTableModel model;
    public ManagePaymentController(CustomerPanelCarsView customerPanelCarsView, CustomerModel customerModel, DefaultTableModel model) {
        this.customerPanelCarsView = customerPanelCarsView;
        this.customerModel = customerModel;
        this.model = model;

        
        customerPanelCarsView.getBtnSearch().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {        
                String name = customerPanelCarsView.getTxtSearch().getText();
                VehicleModel[] vehicles = vehicleModel.searchVehicleByLicense("name", name);
                clearVehicleTable();
                
                final DefaultTableModel model = (DefaultTableModel) customerPanelCarsView.getTblVehicleDetail().getModel();
                for(VehicleModel vehicle : vehicles){
                    Object[] obj = {vehicle.getId_vehicle(), vehicle.getName(), vehicle.getQuantity(), vehicle.getPrice(), vehicle.getDescription(), vehicle.getCategories()};
                    setModel(model);
                    model.addRow(obj);                    
                }

            }
        }); 
        
        customerPanelCarsView.getBtnRent().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) { 
                RentalModel rentalModel = new RentalModel(0, 0, "", "", "", "", "");
                String license = customerPanelCarsView.getFldForm().getText();
                RSDateChooser startRent = customerPanelCarsView.getStartRent();
                RSDateChooser endRent = customerPanelCarsView.getEndRent();

                rentalModel.addRental(customerModel, license, startRent, endRent);
                
//                final DefaultTableModel model = (DefaultTableModel) customerPanelCarsView.getTblVehicleDetail().getModel();                   
            }
        });
            
    }
    
    public void setVehicleDetailToTable(){
        VehicleModel[] vehicle = vehicleModel.putAllDataFree("vehicle", "free");
        int i=0, id=0, quantity=0, price=0;
        String name, license, description, categories; JButton btn = new JButton("Rental Now");
        while(i < vehicle.length){
            license = vehicle[i].getId_vehicle();
            name = vehicle[i].getName();
            quantity = vehicle[i].getQuantity();
            price = vehicle[i].getPrice();
            description = vehicle[i].getDescription();
            categories = vehicle[i].getCategories();
            Object[] obj = {license, name, quantity, price, description, categories, btn};
            model = (DefaultTableModel)customerPanelCarsView.getTblVehicleDetail().getModel();
            model.addRow(obj);
            i++;
        }
    }
        
    public void clearVehicleTable(){
       DefaultTableModel model = (DefaultTableModel)customerPanelCarsView.getTblVehicleDetail().getModel(); 
       model.setRowCount(0);
   }

    public void setModel(DefaultTableModel model) {
        this.model = model;
    }
    
}
