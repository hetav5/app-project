
package database;
import java.lang.*;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author quach
 */
public class ConnectionProvider {
    public static Connection getConnection(){
        String url = "jdbc:mysql://localhost:3306/gms";
        String username = "root";
        String password = "Hero@2002";
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connnection = DriverManager.getConnection(url,username,password);
            return connnection;
        }catch(Exception e){
            return null;
        }
    }

    
}
