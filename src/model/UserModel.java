/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author TUF GAMING
 */
public class UserModel extends DatabaseConnector{
    private int id;
    private String name, pass, email, phone, role, created_at, updated_at; 
    
    public UserModel(int id, String name, String pass, String email, String phone, String role, String created_at, String updated_at){
        this.id = id;
        this.name = name;
        this.pass = pass;
        this.email = email;
        this.phone = phone;
        this.role = role;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }
    
    public int amtData(String users){
        int i = 0;
        
        try {
            String query = "SELECT * FROM" + "`" + users + "`";
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
    
    public UserModel[] putAllData(){
        int amtUsers = amtData("users");
        UserModel[] users = new UserModel[amtUsers];
//        Stack<UserModel> users = new Stack<UserModel>();
        int i = 0;
        
        try {
            String query = "SELECT * FROM `users`";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
   
            while(resultSet.next()){
                users[i] = new UserModel(resultSet.getInt("id_user"), resultSet.getString("name"), resultSet.getString("password"), resultSet.getString("email"), resultSet.getString("phone"), resultSet.getString("role"), resultSet.getString("created_at"), resultSet.getString("updated_at"));
                i++;
            }
            
            statement.close();
            resultSet.close();
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        } 
        return users;
    }
    
    public String loginUser(String name, String pass){
        try {
            String query = "SELECT * FROM `users` WHERE "
                    + "`name`='" + name + "' AND "
                    + "`password`='" + pass + "'";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            
            if (resultSet.next()) {
                setId(resultSet.getInt("id_user"));
                setName(resultSet.getString("name"));
                setPassword(resultSet.getString("password"));
                setEmail(resultSet.getString("email"));
                setPhone(resultSet.getString("phone"));
                setRole(resultSet.getString("role"));
                
                return this.role;
            } 
            
            statement.close();
            resultSet.close();
            return " ";
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
            return " ";
        } 
        
    }
    
    public void registerUser(String name, String pass, String email, String phone, String role){
        Date dateNow = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        System.out.println(checkName(name));
//        System.out.println(name);
//        System.out.println(email);
//        System.out.println(phone);
//        System.out.println(formatter.format(dateNow));
//        System.out.println(formatter.format(dateNow));
        try {
            String query = "INSERT INTO `users`"
                    + "(`name`, `email`, `password`, `phone`, `role`, `created_at`, `updated_at`) "
                    + "VALUES "
                    + "('" + name + "'"
                    + ",'"+ email + "'"
                    + ",'" + pass + "'"
                    + ",'" + phone + "'"
                    + ",'" + role + "'" 
                    + ",'" + formatter.format(dateNow) + "'"
                    + ",'" + formatter.format(dateNow) + "')";
            
            statement = connection.createStatement();
            statement.executeUpdate(query);
            
            statement.close();
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        } 

    }
    
    public UserModel searchUsersByName(String data){
        UserModel user =  new UserModel(0, "", "", "", "", "", "", "");
        try {
            String query = "SELECT * FROM `users` WHERE "
                    + "`name`='" + data + "'";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            
            if (resultSet.next()) {
                id = (resultSet.getInt("id_user"));
                name = (resultSet.getString("name"));
                email = (resultSet.getString("email"));
                pass = (resultSet.getString("password"));
                phone = (resultSet.getString("phone"));
                role = (resultSet.getString("role"));
                created_at = (resultSet.getString("created_at"));
                updated_at = (resultSet.getString("updated_at"));
                System.out.println(id + "SSSSSSSSSSSSSSSSSSSSSSSSS");
               
            } 
             user = new UserModel(id, name, pass , email, phone, role, created_at, updated_at);
            statement.close();
            resultSet.close();
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        } 
        return user;
    }
    
    public void updateUser(String name, String password, String email, String phone, String role, int id){
        Date dateNow = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(id);
        try {
            String query = "UPDATE `users` SET "
                    + "`name` = '" + name
                    + "', `password` = '" + password
                    + "', `email` = '" + email
                    + "', `phone` = '" + phone
                    + "', `role` = '" + role
                    + "', `updated_at` = '" + formatter.format(dateNow) + "'"
                    + " WHERE `id_user` = " + id;
            statement = connection.createStatement();
            statement.executeUpdate(query);
            
            statement.close();
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        } 
    }
    
    public void deleteUser(int id){
        try {
            String query = "DELETE FROM `users`"
                    + "WHERE `id_user` = " + id;
            statement = connection.createStatement();
            statement.executeUpdate(query);
            
            statement.close();
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        } 
    }
    
    public boolean isValidName(String name){   
        UserModel[] users = putAllData();
        for(int i=0;i<users.length;i++){  
            if(users[i].name.equals(name)){  
                return false;    
            }    
        }    
        return true;    
    }    
    
    public boolean isValidEmail(String email){
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";  

        Pattern pattern = Pattern.compile(regex);  
        Matcher matcher = pattern.matcher(email);  
        return matcher.matches();
    }

    public boolean isValidPassword(String password){
        String regex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20}$";
        
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
    
    public boolean isValidPhone(String phone){
        String regex = "^(^\\+62|62|^08)(\\d{3,4}-?){2}\\d{3,4}$";
        
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phone);
        return matcher.matches();
    }
    
    
    
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String pass) {
        this.pass = pass;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPass() {
        return pass;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getRole() {
        return role;
    }

    public String getCreated_at() {
        return created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }
    
   
    
}
