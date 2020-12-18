import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Connection {
    Connection c;
    //Statement s;
    String url = "jdbc:mysql://127.0.0.1/blood bank database";
    String user = "root";
    String password = ""; 
    public Connection(){
       }
    public void makeConnection() throws ClassNotFoundException, SQLException{
            Class.forName("com.mysql.jdbc.Driver");          
            c = (Connection) DriverManager.getConnection(url,user,password);
            //s = c.createStatement();
        }
    }