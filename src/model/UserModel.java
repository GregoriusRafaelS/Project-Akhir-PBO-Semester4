/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

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
//                users[i].id = resultSet.getInt("id_user");
//                users[i].name = resultSet.getString("name");
//                users[i].pass = resultSet.getString("password");
//                users[i].phone = resultSet.getString("phone");
//                users[i].email = resultSet.getString("email");
//                user[0].id = resultSet.getInt("id");
//                user[0].name = resultSet.getString("name");
//                user[0].pass = resultSet.getString("pass");
//                user[0].phone = resultSet.getString("phone");
//                user[0].email = resultSet.getString("email");
//                users.push();
                i++;
            }
            
            statement.close();
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

            return " ";
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
            return " ";
        } 
        
    }
    
    public void registerUser(String name, String pass, String email, String phone){
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
                    + ",'customer'" 
                    + ",'" + formatter.format(dateNow) + "'"
                    + ",'" + formatter.format(dateNow) + "')";
            
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
