package controller;
import model.UserDao;
import model.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class LoginServlet extends HttpServlet {
   @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
           String email=request.getParameter("emailId");
           String password=request.getParameter("password");          
           UserDao dao=new UserDao();
          boolean bool=dao.Retriev(email, password);
          if(bool){
              HttpSession session=request.getSession();
              session.setAttribute("user",email);
              response.sendRedirect("Welcome.jsp");
          }else{
              response.sendRedirect("login.html");
          }
           
       }
    

    
}
