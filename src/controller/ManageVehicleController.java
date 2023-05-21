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
import java.awt.event.MouseAdapter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.event.MouseEvent;
import model.AdminModel;
import model.VehicleModel;
import view.AdminHomeView;
import view.AdminHomesView;
import view.AdminPanelVehicleView;
//import view.AdminSetVehicleView;

/**
 *
 * @author TUF GAMING
 */
public class ManageVehicleController {
    VehicleModel vehicleModel = new VehicleModel(0, 0, 0, "", "", "", "");
    AdminHomesView adminHomeView;
    
    DefaultTableModel model;
    AdminPanelVehicleView adminPanelVehicleView;
    int qtyBefore = 0;

    
    public void setModel(DefaultTableModel model) {
        this.model = model;
    }
    
    public ManageVehicleController(AdminPanelVehicleView adminPanelVehicleView, DefaultTableModel model) {
        this.model = model;
        this.adminPanelVehicleView = adminPanelVehicleView;
//        this.adminHomeView = adminHomeView;

        
        adminPanelVehicleView.getTblVehicleDetail().addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                int rowNo = adminPanelVehicleView.getTblVehicleDetail().getSelectedRow();
                TableModel model = adminPanelVehicleView.getTblVehicleDetail().getModel();
                
                adminPanelVehicleView.getLblLicense().setText(model.getValueAt(rowNo, 0).toString());
                adminPanelVehicleView.getFldName().setText(model.getValueAt(rowNo, 1).toString());
                adminPanelVehicleView.getFldQuantity().setText(model.getValueAt(rowNo, 2).toString());
                adminPanelVehicleView.getFldPrice().setText(model.getValueAt(rowNo, 3).toString());
                adminPanelVehicleView.getFldDescription().setText(model.getValueAt(rowNo, 4).toString());
                adminPanelVehicleView.getCbxCategories().setSelectedItem(model.getValueAt(rowNo, 5).toString());
                adminPanelVehicleView.getLblIdType().setText(String.valueOf(vehicleModel.searchVehicleByLicense(adminPanelVehicleView.getLblLicense().getText()).getId_type()));
//              qtyBefore= Integer.parseInt(adminPanelVehicleView.getFldQuantity().getText());
            }
        });
        
        adminPanelVehicleView.getBtnAdd().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                System.out.println(String.valueOf(vehicleModel.searchVehicleByLicense(adminPanelVehicleView.getLblLicense().getText()).getId_type()));
                String name = adminPanelVehicleView.getFldName().getText();
                String quantity = adminPanelVehicleView.getFldQuantity().getText();
                String price = adminPanelVehicleView.getFldPrice().getText();
                String description = (String)adminPanelVehicleView.getFldDescription().getText();
                String categories = (String)adminPanelVehicleView.getCbxCategories().getSelectedItem();

                if(name.equals("") || quantity.equals("") || price.equals("")|| description.equals("")|| categories.equals("")){
                    JOptionPane.showMessageDialog(null, "Please Enter fill You'r form !!", "Message", JOptionPane.ERROR_MESSAGE);
                }else if(!vehicleModel.isValidName(name)){
                    JOptionPane.showMessageDialog(null, "Use another name !!", "Message", JOptionPane.ERROR_MESSAGE);
                }else if(!vehicleModel.isValidQuantity(Integer.parseInt(quantity))){
                    JOptionPane.showMessageDialog(null, "You'r quantity vehicle can't negative number", "Message", JOptionPane.ERROR_MESSAGE);
                }else{
                    vehicleModel.addType(name, description, Integer.parseInt(price), Integer.parseInt(quantity));
                    JOptionPane.showMessageDialog(null, "Succes Adding new type !!");
                    
                    //pindah page setLicense sebanyak qty
//                    AdminSetVehicleView adminSetVehicleView = new AdminSetVehicleView(Integer.parseInt(quantity));
//                    adminHomeView.dispose();
//                    adminSetVehicleView.show();
//                    SetVehicleController setVehicleController = new SetVehicleController(Integer.parseInt(quantity), adminSetVehicleView);
//                    setVehicleController.updateVehicle(Integer.parseInt(quantity));
                }
            }
        });  
        
        adminPanelVehicleView.getBtnUpdate().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                String license = adminPanelVehicleView.getLblLicense().getText();
                String name = adminPanelVehicleView.getFldName().getText();
                String quantity = adminPanelVehicleView.getFldQuantity().getText();
                String price = adminPanelVehicleView.getFldPrice().getText();
                int id_type = Integer.parseInt(adminPanelVehicleView.getLblIdType().getText());
                String description = (String)adminPanelVehicleView.getFldDescription().getText();
                String categories = (String)adminPanelVehicleView.getCbxCategories().getSelectedItem();

                if(license.equals("") || name.equals("") || quantity.equals("") || price.equals("")|| description.equals("")|| categories.equals("")){
                    JOptionPane.showMessageDialog(null, "Please Enter fill You'r form !!", "Message", JOptionPane.ERROR_MESSAGE);
                }else if(!vehicleModel.isValidName(name)){
                    JOptionPane.showMessageDialog(null, "Use another name !!", "Message", JOptionPane.ERROR_MESSAGE);
                }else if(!vehicleModel.isValidQuantity(Integer.parseInt(quantity))){
                    JOptionPane.showMessageDialog(null, "Your password must meet the following criteria : \n Must have at least one numeric character \n Must have at least one lowercase character \n Must have at least one uppercase character \n Must have at least one special symbol among @#$% \n Password length should be between 8 and 20", "Message", JOptionPane.ERROR_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null, "Succes Updating vehicle !!");
                    
                    if(Integer.parseInt(quantity) <= qtyBefore){
                        JOptionPane.showMessageDialog(null, "Failed Updating vehicle, check you'r quantity !!");
                    }else {
                        vehicleModel.updateType(name, description, Integer.parseInt(price), Integer.parseInt(quantity), id_type);
                        JOptionPane.showMessageDialog(null, "Succes Updating vehicle !!");

                    }
                    
                    clearVehicleTable();
                    setVehicleDetailToTable();
                }
            }
        });  
        
        adminPanelVehicleView.getBtnSearch().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {        
                String license = adminPanelVehicleView.getTxtSearch().getText();
                VehicleModel vehicle = vehicleModel.searchVehicleByLicense(license);
                clearVehicleTable();
                
                final DefaultTableModel model = (DefaultTableModel) adminPanelVehicleView.getTblVehicleDetail().getModel();
                Object[] obj = {vehicle.getId_vehicle(), vehicle.getName(), vehicle.getQuantity(), vehicle.getPrice(), vehicle.getDescription(), vehicle.getCategories()};
                setModel(model);
                model.addRow(obj);
            }
        });  
        
        adminPanelVehicleView.getTxtSearch().addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (adminPanelVehicleView.getTxtSearch().getText().equals("Search ...")) {
                    adminPanelVehicleView.getTxtSearch().setText("");
                    adminPanelVehicleView.getTxtSearch().setForeground(Color.BLACK);
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                if (adminPanelVehicleView.getTxtSearch().getText().isEmpty()) {
                    adminPanelVehicleView.getTxtSearch().setForeground(Color.GRAY);
                    adminPanelVehicleView.getTxtSearch().setText("Search ...");
                }
            }
        });
        
    }
    
   public void setVehicleDetailToTable(){
        VehicleModel vehicleModel = new VehicleModel(0, 0, 0, "", "", "", "");
        VehicleModel[] vehicle = vehicleModel.putAllDataTable("vehicle");
        int i=0, id=0, quantity=0, price=0;
        String name, license, description, categories;
        while(i < vehicle.length){
            license = vehicle[i].getId_vehicle();
            name = vehicle[i].getName();
            quantity = vehicle[i].getQuantity();
            price = vehicle[i].getPrice();
            description = vehicle[i].getDescription();
            categories = vehicle[i].getCategories();
            Object[] obj = {license, name, quantity, price, description, categories};
            model = (DefaultTableModel)adminPanelVehicleView.getTblVehicleDetail().getModel();
            model.addRow(obj);
            i++;
        }
    }
  
   public void clearVehicleTable(){
       DefaultTableModel model = (DefaultTableModel)adminPanelVehicleView.getTblVehicleDetail().getModel(); 
       model.setRowCount(0);
   }
   
   
   
}