
package controller;
import model.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RegistrationServlet extends HttpServlet {
    @Override
   
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           String firstName=request.getParameter("firstName");
           String lastName=request.getParameter("lastName");
           String email=request.getParameter("emailId");
           String dob=request.getParameter("dateOfBirth");
           String pass=request.getParameter("password");  
           
           //Setting the data by calling user where getter and setter mthods are there.
           User user=new User();
           user.setfName(firstName);
           user.setlName(lastName);
           user.setMail(email);
           user.setDob(dob);
           user.setpass(pass);
           
           //storing in database using dao class by calling insert method.
           UserDao dao=new UserDao();
           boolean bool=dao.insert(user);
           if(bool){
               response.sendRedirect("Success.jsp");
           }else{
               response.sendRedirect("index.html");
           }
           
           
        }
    }

    

}
