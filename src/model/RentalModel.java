/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;

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
