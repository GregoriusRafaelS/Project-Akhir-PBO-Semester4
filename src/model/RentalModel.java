/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.security.Timestamp;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JOptionPane;
import rojeru_san.componentes.RSDateChooser;

/**
 *
 * @author TUF GAMING
 */
public class RentalModel extends DatabaseConnector {
    private int price, id_rental;
    private String id_vehicle, username, start_rental, end_rental,  return_date;

    public RentalModel(int id_rental, int price, String username, String id_vehicle, String start_rental, String end_rental, String return_date) {
        this.username = username;
        this.price = price;
        this.id_vehicle = id_vehicle;
        this.start_rental = start_rental;
        this.end_rental = end_rental;
        this.return_date = return_date;
        this.id_rental = id_rental;
    }
    
    
    public int amtData(String data, String key){
        int i = 0;
        
        try {
            String query = key.equals("all") ? "SELECT * FROM `" + data + "`" : "SELECT * FROM `" + data + "` WHERE id_user = " + Integer.parseInt(key);
            
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
   
            while(resultSet.next()){
                i++;
            }
            
            statement.close();
            resultSet.close();
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        } 
        return i;
    }

    public RentalModel[] putAllData(String query, String key){
        int amtUsers = amtData("rental", key);
        RentalModel[] rental = new RentalModel[amtUsers];

        int i = 0;
        
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
   
            while(resultSet.next()){

                rental[i] = new RentalModel(resultSet.getInt("id_rental"), resultSet.getInt("price"), resultSet.getString("name"), resultSet.getString("id_vehicle"), resultSet.getString("start_rental"), resultSet.getString("end_rental"), resultSet.getString("returned_date"));
                i++;
            }
            
            statement.close();
            resultSet.close();

        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        } 
        return rental;
    }

    public void addRental(CustomerModel customerModel, String license, RSDateChooser startRent, RSDateChooser endRent){
        // check vehicle free / ga
        VehicleModel vehicleModel = new VehicleModel(0, 0, 0, "", "", "", "", "");
        Date date1 = startRent.getDatoFecha();
        Date date2 = endRent.getDatoFecha();

        long l1 = date1.getTime();
        long l2 = date2.getTime();

        // Membuat objek java.sql.Timestamp dari java.util.Date
        java.sql.Date newDate1 = new java.sql.Date(l1);
        java.sql.Date newDate2 = new java.sql.Date(l2);

        
        VehicleModel[] vehicle = vehicleModel.searchVehicleByLicense("id_vehicle", license);
        System.out.println(vehicle[0].getQuantity());
        System.out.println(vehicle[0].getStatus());
        if(vehicle[0].getQuantity() <= 0 || vehicle[0].getStatus().equals("busy")){
            JOptionPane.showMessageDialog(null, "Choice Vehicle in te table !!", "Message", JOptionPane.ERROR_MESSAGE);
        }else{
            try {
                // tambahkan
                     String query = "INSERT INTO `rental`"
                        + "( `id_user`, `id_vehicle`, `start_rental`, `end_rental`, `price`)"
                        + "VALUES "
                        + "('" + customerModel.getId() + "'"
                        + ",'"+ license + "'"
                        + ",'" +  newDate1 + "'"
                        + ",'" +  newDate2 + "'"
                        + ",'" +  vehicle[0].getPrice()
                        + "')";
            statement = connection.createStatement();
            
            statement.executeUpdate(query);
            
            statement.close();
            
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        } 

        vehicleModel.updateVehicle(license, "busy");

        int qty = vehicle[0].getQuantity();
        qty -= 1;
        vehicle[0].setQuantity(qty);
        vehicleModel.updateType(vehicle[0].getName(), vehicle[0].getDescription(), vehicle[0].getQuantity(), vehicle[0].getId_type(), vehicle[0].getPrice());
        }
        
    }
    
    
    
    public String getUsername() {
        return username;
    }

    public int getPrice() {
        return price;
    }

    public String getId_vehicle() {
        return id_vehicle;
    }

    public String getStart_rental() {
        return start_rental;
    }

    public String getEnd_rental() {
        return end_rental;
    }

    public String getReturn_date() {
        return return_date;
    }

    public int getId_rental() {
        return id_rental;
    }
    
    
}
