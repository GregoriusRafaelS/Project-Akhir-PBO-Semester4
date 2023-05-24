/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.table.DefaultTableModel;
import model.UserModel;
import view.AdminPanelUsersView;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

/**
 *
 * @author TUF GAMING
 */
public class ManageUserController {
    UserModel userModel = new UserModel(0, "", "", "", "", "", "", "");
    DefaultTableModel model;
    AdminPanelUsersView adminPanelUserView;

    public void setModel(DefaultTableModel model) {
        this.model = model;
    }

    public ManageUserController(AdminPanelUsersView adminPanelUserView, DefaultTableModel model) {
        this.model = model;
        this.adminPanelUserView = adminPanelUserView;
        
        adminPanelUserView.getTblUsersDetail().addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                int rowNo = adminPanelUserView.getTblUsersDetail().getSelectedRow();
                TableModel model = adminPanelUserView.getTblUsersDetail().getModel();
                
                adminPanelUserView.getLblId().setText(model.getValueAt(rowNo, 0).toString());
                adminPanelUserView.getTxtName().setText(model.getValueAt(rowNo, 1).toString());
                adminPanelUserView.getTxtPassword().setText(model.getValueAt(rowNo, 2).toString());
                adminPanelUserView.getTxtEmail().setText(model.getValueAt(rowNo, 3).toString());
                adminPanelUserView.getTxtPhone().setText(model.getValueAt(rowNo, 4).toString());
                adminPanelUserView.getCbxRole().setSelectedItem(model.getValueAt(rowNo, 5).toString());
                
            }
        });
        
        adminPanelUserView.getBtnAdd().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                String name = adminPanelUserView.getTxtName().getText();
                String password = adminPanelUserView.getTxtPassword().getText();
                String email = adminPanelUserView.getTxtEmail().getText();
                String phone = adminPanelUserView.getTxtPhone().getText();
                String role = (String)adminPanelUserView.getCbxRole().getSelectedItem();

                if(name.equals("") || password.equals("") || email.equals("") || phone.equals("")){
                    JOptionPane.showMessageDialog(null, "Please Enter fill You'r form !!", "Message", JOptionPane.ERROR_MESSAGE);
                }else if(!userModel.isValidName(name)){
                    JOptionPane.showMessageDialog(null, "Use another name !!", "Message", JOptionPane.ERROR_MESSAGE);
                }else if(!userModel.isValidEmail(email)){
                    JOptionPane.showMessageDialog(null, "Please Input a valid email address !!", "Message", JOptionPane.ERROR_MESSAGE);
                }else if(!userModel.isValidPassword(password)){
                    JOptionPane.showMessageDialog(null, "Your password must meet the following criteria : \n Must have at least one numeric character \n Must have at least one lowercase character \n Must have at least one uppercase character \n Must have at least one special symbol among @#$% \n Password length should be between 8 and 20", "Message", JOptionPane.ERROR_MESSAGE);
                }else if(!userModel.isValidPhone(phone)){
                    JOptionPane.showMessageDialog(null, "Please Input a valid phone nuber !!", "Message", JOptionPane.ERROR_MESSAGE);
                }else{
                    userModel.registerUser(name, password, email, phone, role);
                    JOptionPane.showMessageDialog(null, "Succes Adding new account !!");
                    clearUserTable();
                    setUserDetailToTable();
                }
            }
        });  
        
        adminPanelUserView.getBtnUpdate().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                String name = adminPanelUserView.getTxtName().getText();
                String password = adminPanelUserView.getTxtPassword().getText();
                String email = adminPanelUserView.getTxtEmail().getText();
                String phone = adminPanelUserView.getTxtPhone().getText();
                String role = (String)adminPanelUserView.getCbxRole().getSelectedItem();
                
                int id  = Integer.parseInt(adminPanelUserView.getLblId().getText());
                System.out.println(id);

                if(name.equals("") || password.equals("") || email.equals("") || phone.equals("")){
                    JOptionPane.showMessageDialog(null, "Please Enter fill You'r form !!", "Message", JOptionPane.ERROR_MESSAGE);
                }else if(!userModel.isValidName(name)){
                    JOptionPane.showMessageDialog(null, "Use another name !!", "Message", JOptionPane.ERROR_MESSAGE);
                }else if(!userModel.isValidEmail(email)){
                    JOptionPane.showMessageDialog(null, "Please Input a valid email address !!", "Message", JOptionPane.ERROR_MESSAGE);
                }else if(!userModel.isValidPassword(password)){
                    JOptionPane.showMessageDialog(null, "Your password must meet the following criteria : \n Must have at least one numeric character \n Must have at least one lowercase character \n Must have at least one uppercase character \n Must have at least one special symbol among @#$% \n Password length should be between 8 and 20", "Message", JOptionPane.ERROR_MESSAGE);
                }else if(!userModel.isValidPhone(phone)){
                    JOptionPane.showMessageDialog(null, "Please Input a valid phone nuber !!", "Message", JOptionPane.ERROR_MESSAGE);
                }else{
                    System.out.println(id);
                    userModel.updateUser(name, password, email, phone, role, id);
                    JOptionPane.showMessageDialog(null, "Succes Update new account !!");
                    clearUserTable();
                    setUserDetailToTable();
                }
            }
        });  
        
        adminPanelUserView.getBtnDelete().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {        
                int id  = Integer.parseInt(adminPanelUserView.getLblId().getText());
                userModel.deleteUser(id);
                JOptionPane.showMessageDialog(null, "Succes Delete account !!");
                clearUserTable();
                setUserDetailToTable();
            }
        });  
        
        adminPanelUserView.getBtnSearch().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {        
                String name = adminPanelUserView.getTxtSearch().getText();
                UserModel user = userModel.searchUsersByName(name);
                clearUserTable();
                
                final DefaultTableModel model = (DefaultTableModel) adminPanelUserView.getTblUsersDetail().getModel();
                Object[] obj = {user.getId(), user.getName(), user.getPass(), user.getEmail(), user.getPhone(), user.getRole()};
                setModel(model);
                model.addRow(obj);
            }
        });  
        
        adminPanelUserView.getTxtSearch().addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (adminPanelUserView.getTxtSearch().getText().equals("Search ...")) {
                    adminPanelUserView.getTxtSearch().setText("");
                    adminPanelUserView.getTxtSearch().setForeground(Color.BLACK);
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                if (adminPanelUserView.getTxtSearch().getText().isEmpty()) {
                    adminPanelUserView.getTxtSearch().setForeground(Color.GRAY);
                    adminPanelUserView.getTxtSearch().setText("Search ...");
                }
            }
        });
        
    }
    
   public void setUserDetailToTable(){
        UserModel userModel = new UserModel(0, "", "", "", "", "", "", "");
        UserModel[] users = userModel.putAllData();
        int i=0, id=0;
        String name, password, email, phone, role;
        while(i < users.length){
            id = users[i].getId();
            name = users[i].getName();
            password = users[i].getPass();
            email = users[i].getEmail();
            phone = users[i].getPhone();
            role = users[i].getRole();
            Object[] obj = {id, name, password, email, phone, role};
            model = (DefaultTableModel)adminPanelUserView.getTblUsersDetail().getModel();
            model.addRow(obj);
            i++;
        }
    }
  
   public void clearUserTable(){
       DefaultTableModel model = (DefaultTableModel)adminPanelUserView.getTblUsersDetail().getModel(); 
       model.setRowCount(0);
   }
   
}
