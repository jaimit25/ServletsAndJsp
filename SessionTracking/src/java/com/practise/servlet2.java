
package com.practise;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.*;


public class servlet2 extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet servlet2</title>");            
            out.println("</head>");
            out.println("<body>");
            
            
            //getting all the cookie which was stored in the client device
            Cookie[] cookies = request.getCookies();
            boolean f = false;
            String nm = "";
            if(cookies == null){
                out.println("<h1>You are are new user go to home page and submit your name</h1>");
                return; 
            }
            else{
                for(Cookie c : cookies){
                    String temp = c.getName();
                    if(temp.equals("user_name")){
                        f = true;
                        nm = c.getValue();
                    }
                }
            }
            if(f){
                out.println("<h1> hello "+nm+"! welcome back to servlet (from servlet 2) </h1>");
            }
            else{
                out.println("<h1>You are are new user go to home page and submit your name</h1>");
            }
            // the problem with cookies is that is dosent allow space in the sting name ie,"Johny Deep"         
            
            //String name = request.getParameter("name");
            //out.println("<h1> hello"+name+"! welcome back to servlet (from servlet 2) </h1>");

            
            out.println("</body>");
            out.println("</html>");
        }
    }

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
