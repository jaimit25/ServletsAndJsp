package com.practise;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;


//HttpServlet class has implementation of all the method'ss ->  service,init ,getservletconfig ,getServletinfo and destroy.
// but httpservlet does things in a proper format of httlp protocols
public class MyServlet extends HttpServlet {
    
        // this is http get method
        public void doGet(HttpServletRequest req ,  HttpServletResponse res) throws ServletException,IOException
        {
                res.setContentType("text/html");
                PrintWriter out  = res.getWriter();
                out.print("<h1>this is Http doGet Method</h1>");
                
        }
    
    //this is http post method 
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }
    
    
    //short key (control + i) to implement all override methods
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

   
        

        
        
}
