package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
//import static model.LoginModel.DB_URL;

public class DatabaseConnector {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/vehicle_rental";
    static final String USER = "root";
    static final String PASS = "";
    
    Connection connection;
    Statement statement;

    public DatabaseConnector() {
         try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connection Success");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println("Connection Failed, Eror :" + e);
        }
    }
}
