package com.xworkz.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/flightTicket",loadOnStartup =1)
public class FlightTicketServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Name : " + req.getParameter("inputName"));
        System.out.println("Contact Number : " + req.getParameter("inputContactNumber"));
        System.out.println("Age : " + Integer.parseInt(req.getParameter("inputAge")));
        System.out.println("Gender : "+req.getParameter("gender"));
        System.out.println("Source : " + req.getParameter("inputSource"));
        System.out.println("Destination : " + req.getParameter("inputDestination"));
        System.out.println("Special Requests : "+req.getParameter("specialRequests"));

        System.out.println("---------------------------------------------------");
        resp.setContentType("text/html");
        resp.getWriter().println("<html> <head> <title>Movie Ticket Form </title> </head> <body><h1 style='color : green;'>Order Placed!!!</h1>" +
                "<pre>Name : " + req.getParameter("inputName") +
                "\nContact Number : " + req.getParameter("inputContactNumber") +
                "\nAge : " + Integer.parseInt(req.getParameter("inputAge")) +
                "\nGender : "+req.getParameter("gender") +
                "\nSource : " + req.getParameter("inputSource") +
                "\nDestination : " + req.getParameter("inputDestination")+
                "\nSpecial Requests : "+req.getParameter("specialRequests")+
                "<pre>" + " <a href='FlightTicket.html'>Book Another Flight Ticket</a></body> </html>");
    }
}
