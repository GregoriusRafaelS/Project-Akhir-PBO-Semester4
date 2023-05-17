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
import javax.swing.JOptionPane;

/**
 *
 * @author TUF GAMING
 */
public class UserModel extends DatabaseConnector{
    private int id;
    private String name, pass, email, phone; 
    
    public UserModel(int id, String name, String pass, String email, String phone){
        this.id = id;
        this.name = name;
        this.pass = pass;
        this.email = email;
        this.phone = phone;
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
                users[i] = new UserModel(resultSet.getInt("id_user"), resultSet.getString("name"), resultSet.getString("password"), resultSet.getString("phone"), resultSet.getString("email"));
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
        String data;
        
        try {
            String query = "SELECT * FROM `users` WHERE "
                    + "`name`='" + name + "' AND "
                    + "`password`='" + pass + "'";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            
            if (resultSet.next()) {
                setId(resultSet.getInt("id_user"));
                data = resultSet.getString("role");
                return data;
            } 
            
            statement.close();

            return " ";
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
            return " ";
        } 
        
    }
    
    public boolean registerUser(String name, String pass, String email, String phone){
        Date dateNow = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        System.out.println(checkName(name));
        if(checkName(name)){
//            System.out.println("aa");
            return false;
        }
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
            
//            int remain = Integer.parseInt(readRemaining());
//            remain--;
//            
//            updateRemain(String.valueOf(remain));
            
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        } 
        return true;
    }
    
    public boolean checkName(String name){   
        UserModel[] users = putAllData();
//        System.out.println();
        for(int i=0;i<users.length;i++){    
            if(users[i].name.equals(name)){    
                return true;    
            }    
        }    
        return false;    
    }    

    public void setId(int id) {
        this.id = id;
    }
    
}
