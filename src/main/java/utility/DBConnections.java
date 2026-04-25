package utility;
import java.sql.*;
public class DBConnections {
    static{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(Exception e){
            e.printStackTrace();            
        }
    }
    public static Connection getConnection(){
        Connection con=null;
        String url="jdbc:mysql://localhost:3307/jdbclearning";
        String user="root";
        String pass="";
        try{
          con =DriverManager.getConnection(url,user,pass);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return con;
    }
    public static void closeConnection(Connection con, PreparedStatement ps){
        try{
            con.close();
            ps.close();
    }catch(Exception e){
        e.printStackTrace();
    }
   }
}
