/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package employee.payroll;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author MasterKhan
 */
public class mysql {
  
    
    Connection conn=null;
    public static Connection ConnectDB(){
        
        try{
             String driver = "com.mysql.jdbc.Driver";
    String connection = "jdbc:mysql://localhost:3306/mysql";
    String user = "root";
    String password = "Iknow";
    Class.forName(driver);
    System.out.println("test");
    Connection conn = DriverManager.getConnection(connection, user, password);
    System.out.println("CONN: "+conn);
    System.out.println("test11");
    //  Connection conn = DriverManager.getConnection(connection, user, password);
     return conn;
            
            
                    
                    
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,e);
            return null;
    }
    
    
}
}
