/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.table.DefaultTableModel;
import model.CustomerModel;
import model.UserModel;
import view.AdminHomesView;
import view.CustomerCarsView;

/**
 *
 * @author TUF GAMING
 */
public class CustomerController {
    AdminHomesView adminHomeView;
    DefaultTableModel model;
    UserModel userModel = new UserModel(0, "", "", "", "", "", "", "");
    public CustomerController(CustomerModel customerModel, CustomerCarsView customerCarsView){
        
    }
}
