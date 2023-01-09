package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author User
 */
public class conek {
    private static Connection koneksi;
    public static Connection GetConnection()throws SQLException{
        if (koneksi==null){
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/loginprojek","root","");
        }
        return koneksi;
    }
}