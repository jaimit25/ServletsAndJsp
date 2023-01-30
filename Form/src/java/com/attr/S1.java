package com.attr;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class S1 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet S1</title>");            
            out.println("</head>");
            out.println("<body>");
            
            String n1 = request.getParameter("n1");
            String n2 = request.getParameter("n2");
            
            
            //convert to integer
            int nn1 = Integer.parseInt(n1);
            int nn2 = Integer.parseInt(n2);
            
            int s = nn1+nn2;
            
            //setting the attribute which we will pass to other servlet from request object
            request.setAttribute("sum", s);
            
            //forward the request object to other servlet using requestdispatcher
            RequestDispatcher rd = request.getRequestDispatcher("s2"); // s2 is the url pattern mapping
            rd.forward(request,response);
            
            
            
            
//            out.println("<h1>Servlet S1 at " + request.getContextPath() + "</h1>");
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
