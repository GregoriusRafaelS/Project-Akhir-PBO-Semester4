/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.swing.table.DefaultTableModel;
import view.AdminPanelUsersView;

/**
 *
 * @author TUF GAMING
 */

public class AdminModel extends UserModel{
    UserModel userModel;
    public AdminModel(int id, String name, String pass, String email, String phone, String role, String created_at, String updated_at){
        super(id, name, pass, email, phone, role, created_at, updated_at);
    }
 
}
