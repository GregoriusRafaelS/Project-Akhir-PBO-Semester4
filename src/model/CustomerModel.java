/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author TUF GAMING
 */
public class CustomerModel extends UserModel{

    public CustomerModel(int id, String name, String pass, String email, String phone, String role, String created_at, String updated_at){
          super(id, name, pass, email, phone, role, created_at, updated_at);
    }
    
        
}