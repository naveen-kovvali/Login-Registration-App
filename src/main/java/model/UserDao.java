
package model;
import java.sql.*;
import utility.DBConnections;
public class UserDao {       
   public boolean insert(User user){
        boolean status=false;
         Connection con=null;
          PreparedStatement ps=null;
       try{
          
           con=DBConnections.getConnection();
           String sql="INSERT INTO AccountDetails(fname,lname,email,dob,pass)VALUES(?,?,?,?,?)";
            ps=con.prepareStatement(sql);
            ps.setString(1, user.getfname());
            ps.setString(2,user.getlname());
            ps.setString(3,user.getEmail());
            ps.setString(4,user.getDob());
            ps.setString(5,user.getpass());          
           int x=ps.executeUpdate();
           if(x==1){
               status=true;
           }
                    
       }catch(Exception e){
           e.printStackTrace();
       }finally{
           DBConnections.closeConnection(con, ps);  
       }
       return status;
}
   public boolean Retriev(String email,String password){
       Connection con=null;
       PreparedStatement ps=null;
       ResultSet rs=null;
       boolean status=false;
       try{
           con=DBConnections.getConnection();
           String query="SELECT * FROM AccountDetails WHERE email=? AND pass=?";
           ps=con.prepareStatement(query);
           ps.setString(1,email);
           ps.setString(2,password);
            rs=ps.executeQuery();
           if(rs.next()){
               status=true;
           }
       }catch(Exception e){
           e.printStackTrace();
       }finally{
           try{
           if(rs!=null){
               rs.close();
           }
           }catch(Exception e){
           }
            DBConnections.closeConnection(con, ps); 
       }
       return status;
   }
}
