/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author TUF GAMING
 */
public class VehicleModel extends DatabaseConnector {
    private int id_type, price, quantity;
    private String categories, id_vehicle, name, description;

    public VehicleModel(int id_type, int price, int quantity, String id_vehicle, String categories, String name, String description) {
        this.id_type = id_type;
        this.price = price;
        this.categories = categories;
        this.id_vehicle = id_vehicle;
        this.name = name;
        this.quantity = quantity;
        this.description = description;
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
    
    public VehicleModel[] putAllDataTable(String data){
        int amtVehicle = amtData(data);
        VehicleModel[] vehicle = new VehicleModel[amtVehicle];
    
        int i = 0;
        
        try {
            String query = "SELECT i.id_vehicle, i.id_type, "
                                + "j.name, j.price, "
                                + "j.description, "
                                + "j.availability, "
                                + "i.categories "
                                + "FROM vehicle i "
                                + "INNER JOIN type j ON i.id_type = j.id_type";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
   
            while(resultSet.next()){
                vehicle[i] = new VehicleModel(resultSet.getInt("i.id_type"), resultSet.getInt("j.price"), resultSet.getInt("j.availability"), resultSet.getString("i.id_vehicle"), resultSet.getString("i.categories"), resultSet.getString("j.name"), resultSet.getString("j.description"));
                i++;
            }
            
            statement.close();
            resultSet.close();

        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        } 
        return vehicle;
    }
    
    public Object[][] putAllData(String data){
        int amtData = amtData(data);
        Object[][] obj = new Object[amtData][5];

        int i = 0;
        
        try {
            String query = "SELECT * FROM `" + data + "`";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
   
            while(resultSet.next()){
                // Ambil nilai dari kolom yang sesuai dari ResultSet
                String column1Value = resultSet.getString("id_type");
                String column2Value = resultSet.getString("name");
                String column3Value = resultSet.getString("description");
                String column4Value = resultSet.getString("price");
                String column5Value = resultSet.getString("availability");

                // Set nilai-nilai tersebut ke array obj
                obj[i][0] = column1Value;
                obj[i][1] = column2Value;
                obj[i][2] = column3Value;
                obj[i][3] = column4Value;
                obj[i][4] = column5Value;
                i++;
            }
            
            statement.close();
            resultSet.close();

        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        } 
        return obj;
    }
    
    public int addType(String name, String description, int price, int quantity){
        int last_id = 0;
        try {
            String query = "INSERT INTO `type`"
                    + "(`name`, `description`, `price`, `availability`) "
                    + "VALUES "
                    + "('" + name + "'"
                    + ",'"+ description + "'"
                    + "," + price 
                    + "," + quantity 
                    + ")";
            
            statement = connection.createStatement();
            
            statement.executeUpdate(query);
            
            ResultSet resultSet = statement.executeQuery("SELECT LAST_INSERT_ID() as last_id");
            
            if (resultSet.next()) {
                last_id = resultSet.getInt("last_id");
                System.out.println(last_id);
            }
            
            statement.close();
            
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        } 
        return last_id;
    }
    
    public void updateType(String name, String description, int price, int quantity, int id_type){
        try {
            String query = "UPDATE `type` SET "
                                + "`name` = '" + name
                                + "', `description` = '" + description
                                + "', `price` = " + price
                                + ", `availability` = " + quantity
                                + " WHERE `id_type` = '" + id_type + "'";

            statement = connection.createStatement();
            statement.executeUpdate(query);
            
            statement.close();
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        } 
    }
    
    public VehicleModel searchVehicleByLicense(String license){
        VehicleModel vehicle =  new VehicleModel(0, 0, 0, "", "", "", "");
        try {
            String query = "SELECT i.id_vehicle, "
                                + "j.name, j.price, "
                                + "j.description, "
                                + "j.availability, "
                                + "i.categories, "
                                + "j.id_type "
                                + "FROM vehicle i "
                                + "INNER JOIN type j ON i.id_type = j.id_type "
                                + "WHERE i.id_vehicle = '" + license +"'";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            
            if (resultSet.next()) {
                license = (resultSet.getString("Id_vehicle"));
                name = (resultSet.getString("name"));
                quantity = (resultSet.getInt("availability"));
                price = (resultSet.getInt("price"));
                description = (resultSet.getString("description"));
                categories = (resultSet.getString("categories"));
                id_type = (resultSet.getInt("id_type"));

               
            } else{
                license = null;
                name = null;
                quantity = 0;
                price =  0;
                description = null;
                categories = null;
                id_type = 0;
            }
            vehicle.setId_vehicle(license);
            vehicle.setName(name);
            vehicle.setQuantity(quantity);
            vehicle.setPrice(price);
            vehicle.setDescription(description);
            vehicle.setCategories(categories);
            vehicle.setId_type(id_type);

            statement.close();
            resultSet.close();
            
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        } 
        return vehicle;
    }
    
    public void addsVehicle(List<String> license, String categories, int id_type) {
        try {
            for (String licenseValue : license) {
                String query = "INSERT INTO `vehicle` SET "
                                + "`id_vehicle` = '" + licenseValue + "', "
                                + "`categories` = '" + categories + "', "
                                + "`id_type` = " + id_type;
                statement = connection.createStatement();
                statement.executeUpdate(query);
                statement.close();
            }
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
    
    public boolean isValidLicense(String license){
        String regex = "^[A-Z]{1,2}\\s\\d{1,4}\\s[A-Z]{1,3}$";  

        Pattern pattern = Pattern.compile(regex);  
        Matcher matcher = pattern.matcher(license);  
        return matcher.matches();
    }  
    
    public boolean isValidQuantity(int qty){   
        if(qty < 0){  
            return false;    
        }    
        return true;   
    }  
     
    public boolean isValidName(String name){   
        Object[][] type = putAllData("type");
        for(int i=0;i<type.length;i++){  
            if(type[i][1].equals(name)){  
                return false;    
            }    
        }    
        return true;    
    }  

    public void setId_type(int id_type) {
        this.id_type = id_type;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public void setId_vehicle(String id_vehicle) {
        this.id_vehicle = id_vehicle;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId_type() {
        return id_type;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCategories() {
        return categories;
    }

    public String getId_vehicle() {
        return id_vehicle;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
    
    
}
