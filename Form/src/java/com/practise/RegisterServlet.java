
package com.practise;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;


public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.print("welcome to register servlet");
        String name = req.getParameter("user_name");
        String email = req.getParameter("user_email");
        String password = req.getParameter("user_password");
        String gender = req.getParameter("user_gender");
        String course = req.getParameter("user_course");
        String condition = req.getParameter("condition");
        
        if(condition != null){
        
            out.print("<h1>"+ name+"</h1>");
            out.print("<h1>"+ email+"</h1>");
            out.print("<h1>"+ password+"</h1>");
            out.print("<h1>"+ gender+"</h1>");
            out.print("<h1>"+ course+"</h1>");
            
             RequestDispatcher rd = req.getRequestDispatcher("success"); // this is the url-patten for java class defined in web.xml file
            rd.forward(req,resp);
            
            
           
        }else{
            out.print("checkbox not ");
            //show a jsp page
            //req.getRequestDispatcher("/WEB-INF/hello.jsp").forward(req, resp);
             
            
            //show the index.html page in case user has not checked the text box
            RequestDispatcher rd = req.getRequestDispatcher("index.html");
            rd.include(req,resp);
            
        }
    }
   
}
