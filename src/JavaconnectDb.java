
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muzam
 */
public class JavaconnectDb {
    public static Connection ConnecrDb(){
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            Connection conn;
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","PROJECT","DBMS");
            return conn;
        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
}
