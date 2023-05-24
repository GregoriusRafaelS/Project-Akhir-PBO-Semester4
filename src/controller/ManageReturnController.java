/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import model.CustomerModel;
import model.RentalModel;
import model.VehicleModel;
import view.CustomerPanelCarsView;
import view.CustomerPanelReturnView;

/**
 *
 * @author TUF GAMING
 */
public class ManageReturnController {
    VehicleModel vehicleModel = new VehicleModel(0, 0, 0, "", "", "", "", "");
    CustomerPanelReturnView customerPanelReturnView;
    CustomerModel customerModel;
    DefaultTableModel model;
    


    public ManageReturnController(CustomerPanelReturnView customerPanelReturnView, CustomerModel customerModel, DefaultTableModel model) {
        this.customerPanelReturnView = customerPanelReturnView;
        this.customerModel = customerModel;
        this.model = model;
            
        customerPanelReturnView.getBtnReturn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) { 
                String query = "SELECT j.name, i.id_rental, "
                                    + "i.price, i.id_vehicle, "
                                    + "i.start_rental, "
                                    + "i.end_rental, "
                                    + "i.returned_date "
                                    + "FROM rental i "
                                    + "INNER JOIN users j ON i.id_user = j.id_user WHERE j.id_user = '" + customerModel.getId() + "'";
                
                String name = customerPanelReturnView.getFldId().getText();
                // cari yang match id & return value NULL
                RentalModel rentalModel = new RentalModel(0, 0, "", "", "", "", "");
                RentalModel[] rental = rentalModel.putAllData(query, String.valueOf(customerModel.getId()));
                    
                VehicleModel vehicle;
                int i=0;
                String id_vehicle;
                    
                while(i < rental.length){
                    if(rental[i].getReturn_date() == null && name == rental[i].getId_vehicle()){
                       id_vehicle = rental[i].getId_vehicle();
                       vehicle = new VehicleModel(0, 0, 0, "", "", "", "", "");
                       vehicle.updateVehicle(id_vehicle, "free");
                       VehicleModel[] vehicles = vehicle.putAllDataFree("all", "free");
                       int qty = vehicles[0].getQuantity() - 1;
                       vehicle.updateType(vehicles[0].getName(), vehicles[0].getDescription(),vehicles[0].getPrice(), qty, vehicles[0].getId_type());
                       break;
                    }
                    i++;
                }
                clearVehicleTable();
            }
        }); 
    }
    
    public void setVehicleDetailToTable(){
        String query = "SELECT j.name, i.id_rental, "
                            + "i.price, i.id_vehicle, "
                            + "i.start_rental, "
                            + "i.end_rental, "
                            + "i.returned_date "
                            + "FROM rental i "
                            + "INNER JOIN users j ON i.id_user = j.id_user WHERE j.id_user = '" + customerModel.getId() + "'";
        
        RentalModel rentalModel = new RentalModel(0, 0, "", "", "", "", "");
        RentalModel[] rental = rentalModel.putAllData(query, String.valueOf(customerModel.getId()));
                    
        int i=0;
        int price, id_rental, quantity;
        String id_vehicle, start_rental, end_rental,  return_date, name;
                    
        while(i < rental.length){
            if(rental[i].getReturn_date() == null){
                id_rental = rental[i].getId_rental();
                name = rental[i].getUsername();
                price = rental[i].getPrice();
                id_vehicle = rental[i].getId_vehicle();
                start_rental = rental[i].getStart_rental();
                end_rental = rental[i].getEnd_rental();
                return_date = rental[i].getReturn_date();
                if(return_date == null){
                    return_date = "Still borrowed";
                }
                    Object[] obj = {id_rental, id_vehicle, start_rental,  end_rental, return_date, price};
                    DefaultTableModel model = (DefaultTableModel)customerPanelReturnView.getTblVehicleDetail().getModel();
                    model.addRow(obj);
            }

            i++;
        }
    }
    
    public void clearVehicleTable(){
       DefaultTableModel model = (DefaultTableModel)customerPanelReturnView.getTblVehicleDetail().getModel(); 
       model.setRowCount(0);
   }

    public void setModel(DefaultTableModel model) {
        this.model = model;
    }
}
