/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package houseofcardspos;

/**
 *
 * @author zacha
 */
public class HouseOfCardsPOS {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String connection = "jdbc:mysql://DESKTOP-HQ3JJ0D:3306/houseofcards";
        String driver = "com.mysql.jdbc.Driver";
        frmLogin form = new frmLogin(connection, driver);
        form.setVisible(true);
    }
    
}
