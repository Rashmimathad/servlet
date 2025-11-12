package com.xworkz.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/foodOrder",loadOnStartup = 1)
public class FoodOrderServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Name : " + req.getParameter("inputName"));
        System.out.println("Contact Number : " + req.getParameter("inputContactNumber"));
        System.out.println("Food Name : " + req.getParameter("inputFoodName"));
        System.out.println("Quantity : "+req.getParameter("inputQuantity"));
        System.out.println("Food Customization : "+req.getParameter("specialRequests"));

        System.out.println("---------------------------------------------------");
        resp.setContentType("text/html");
        resp.getWriter().println("<html> <head> <title>Movie Ticket Form </title> </head> <body><h1 style='color : green;'>Order Placed!!!</h1>" +
                "<pre>Name : " + req.getParameter("inputName") +
                "\nContact Number : " + req.getParameter("inputContactNumber") +
                "\nFood Name : " + req.getParameter("inputFoodName") +
                "\nQuantity : " + req.getParameter("inputQuantity")+
                "\nFood Customization : "+req.getParameter("specialRequests")+
                "<pre>" + " <a href='FoodOrder.html'>Buy Another order</a></body> </html>");
    }
}
