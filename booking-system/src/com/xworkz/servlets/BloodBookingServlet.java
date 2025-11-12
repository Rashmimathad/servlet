package com.xworkz.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/bloodBooking",loadOnStartup = 1)
public class BloodBookingServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Name : " + req.getParameter("inputName"));
        System.out.println("Contact Number : " + req.getParameter("inputContactNumber"));
        System.out.println("Gender : " + req.getParameter("gender"));
        System.out.println("Blood Group : "+req.getParameter("bloodGroup"));
        System.out.println("Delivery Address : "+req.getParameter("deliveryAddress"));

        System.out.println("---------------------------------------------------");
        resp.setContentType("text/html");
        resp.getWriter().println("<html> <head> <title>Movie Ticket Form </title> </head> <body><h1 style='color : green;'>Order Placed!!!</h1>" +
                "<pre>Name : " + req.getParameter("inputName") +
                "\nContact Number : " + req.getParameter("inputContactNumber") +
                "\nGender : " + req.getParameter("gender") +
                "\nBlood Group : "+req.getParameter("bloodGroup")+
                "\nDelivery Address : "+req.getParameter("deliveryAddress")+
                "<pre>" + " <a href='BloodBooking.html'>Buy Another order</a></body> </html>");
    }
}
