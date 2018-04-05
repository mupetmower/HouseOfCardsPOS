/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package houseofcardspos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author zacha
 */
public class HouseOfCardsPOS {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // TODO code application logic here
        String connection = "jdbc:mysql://25.7.50.219:3306/houseofcards";
        String driver = "com.mysql.jdbc.Driver";
        Class.forName(driver);
        Connection con = DriverManager.getConnection(connection, "PointOfSaleUser", "POSUSER!");
        JOptionPane.showMessageDialog(new JFrame(),"Database Connection Successful!");
        frmLogin frmLogin = new frmLogin(con);
        frmLogin.setVisible(true);
        
    }
    
}
