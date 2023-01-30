
//other way of implementing Servlet using generic servlet class

package com.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;

public class SecondServlet extends GenericServlet{
    
    //this method is still not implemented in the genericServlet class and all other 4 methods are implemented there
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("This is genericservlet service method()");
        res.setContentType("text/html");
        PrintWriter out =  res.getWriter();
        out.println("<h1>This is second servlet</h1>");
    }
    
    
}
