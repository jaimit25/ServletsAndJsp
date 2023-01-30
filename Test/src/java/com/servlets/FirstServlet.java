/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;

/**
 *
 * @author jaimitkumarpanchal
 */
public class FirstServlet implements Servlet {
    
     ServletConfig c;

    @Override
    public void init(ServletConfig config) throws ServletException {
                     this.c = config;
                     System.out.println("config: ...");
    }
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("servicing: ...");
        
        //set content type of response
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1>this is my output from servlet</h1>");
        
        
       
    }
     @Override
    public void destroy() {
         System.out.println("destroying: ...");
    }

     @Override
    public ServletConfig getServletConfig() {
        return this.c;
    }
    @Override
    public String getServletInfo() {
       return "server created by jaimit";
    }
 
   
   
    
}
