package com.xworkz.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/movieTicket",loadOnStartup = 1)
public class MovieTicketServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Name : "+req.getParameter("inputName"));
        System.out.println("Contact Number : "+req.getParameter("inputContactNumber"));
        System.out.println("Movie Name : "+req.getParameter("inputMovieName"));
        System.out.println("Special Requests : "+req.getParameter("specialRequests"));
        System.out.println("Ticket Type : "+req.getParameter("ticketType"));
        System.out.println("---------------------------------------------------");
        resp.setContentType("text/html");
        resp.getWriter().println("<html> <head> <title>Movie Ticket Form </title> </head> <body><h1 style='color : green;'>Movie Ticket Booked Successfully!!!</h1>"+
                "<pre>Name : "+req.getParameter("inputName")+
                "\nContact Number : "+req.getParameter("inputContactNumber")+
                "\nMovie Name : "+req.getParameter("inputMovieName")+
                "\nSpecial Requests : "+req.getParameter("specialRequests")+
                "\nTicket Type : "+req.getParameter("ticketType")+
                "<pre>"+" <a href='MovieTicket.html'>Book Another Movie Ticket</a></body> </html>");
    }
}
