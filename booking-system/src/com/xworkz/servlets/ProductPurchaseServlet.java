package com.xworkz.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/productPurchase",loadOnStartup = 1)
public class ProductPurchaseServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("User Name : " + req.getParameter("inputUserName"));
        System.out.println("Contact Number : " + req.getParameter("inputContactNumber"));
        System.out.println("Product Name : " + req.getParameter("inputProductName"));
        System.out.println("Quantity : " + req.getParameter("inputQuantity"));
        System.out.println("Shipping Address : " + req.getParameter("shippingAddress"));
        System.out.println("Is Billing Address same as Shipping Address? : " + req.getParameter("billingAddress"));
        System.out.println("---------------------------------------------------");
        resp.setContentType("text/html");
        resp.getWriter().println("<html> <head> <title>Movie Ticket Form </title> </head> <body><h1 style='color : green;'>Order Placed!!!</h1>" +
                "<pre>User Name : " + req.getParameter("inputUserName")+
                "\nContact Number : " + req.getParameter("inputContactNumber") +
                "\nProduct Name : " + req.getParameter("inputProductName")+
                "\nQuantity : " + req.getParameter("inputQuantity") +
                "\nShipping Address : " + req.getParameter("shippingAddress") +
                "\nIs Billing Address same as Shipping Address? : " + req.getParameter("billingAddress") +
                "<pre>" + " <a href='ProductPurchase.html'>Buy Other Products</a></body> </html>");
    }
}
