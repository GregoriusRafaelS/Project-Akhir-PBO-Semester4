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
    private int price;
    private String id_vehicle, username, start_rental, end_rental,  return_date;

    public RentalModel(int price, String username, String id_vehicle, String start_rental, String end_rental, String return_date) {
        this.username = username;
        this.price = price;
        this.id_vehicle = id_vehicle;
        this.start_rental = start_rental;
        this.end_rental = end_rental;
        this.return_date = return_date;
    }
    
    
    public int amtData(String data){
        int i = 0;
        
        try {
            String query = "SELECT * FROM" + "`" + data + "`";
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

    public RentalModel[] putAllData(){
        int amtUsers = amtData("rental");
        RentalModel[] rental = new RentalModel[amtUsers];

        int i = 0;
        
        try {
            String query = "SELECT j.name, "
                                + "i.price, i.id_vehicle, "
                                + "i.start_rental, "
                                + "i.end_rental, "
                                + "i.returned_date "
                                + "FROM rental i "
                                + "INNER JOIN users j ON i.id_user = j.id_user";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
   
            while(resultSet.next()){

                rental[i] = new RentalModel(resultSet.getInt("price"), resultSet.getString("name"), resultSet.getString("id_vehicle"), resultSet.getString("start_rental"), resultSet.getString("end_rental"), resultSet.getString("returned_date"));
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
    
    
}
