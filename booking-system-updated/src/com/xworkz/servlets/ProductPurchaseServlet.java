package com.xworkz.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/productPurchase",loadOnStartup = 1)
public class ProductPurchaseServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[]  cookies=req.getCookies();
        if (cookies==null||cookies.length<1){
            throw new IllegalArgumentException("Cookie not found!!!");
        }
        for (Cookie cookie1:cookies){
            System.out.println(cookie1.getName()+" "+cookie1.getValue());
        }

        System.out.println("User Name : " + req.getParameter("inputUserName"));
        System.out.println("Contact Number : " + req.getParameter("inputContactNumber"));
        System.out.println("Product Name : " + req.getParameter("inputProductName"));
        System.out.println("Quantity : " + req.getParameter("inputQuantity"));
        System.out.println("Shipping Address : " + req.getParameter("shippingAddress"));
        System.out.println("Is Billing Address same as Shipping Address? : " + req.getParameter("billingAddress"));
        System.out.println("---------------------------------------------------");
        resp.setContentType("text/html");
        resp.getWriter().println(
                "<html>" +
                        "<head>" +
                        "<title>Order Confirmation</title>" +
                        "<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css' rel='stylesheet'>" +
                        "</head>" +
                        "<body class='bg-light d-flex justify-content-center align-items-center vh-100'>" +

                        "<div class='card mb-5 shadow text-center' style='max-width: 640px;'>" +
                        "<div class='row g-0'>" +
                        "<div class='col-md-4 d-flex align-items-center justify-content-center'>" +
                        "<img src='images/logo.png' class='img-fluid rounded-start' alt='Order Completed' style='height: 350px width: 300px;'>" +
                        "</div>" +
                        "<div class='col-md-8'>" +
                        "<div class='card-body'>" +
                        "<h5 class='card-title text-success'><b>Order Placed Successfully!!!</b></h5>" +
                        "<p class='card-text text-start ps-3'>" +
                        "<strong>User Name:</strong> " + req.getParameter("inputUserName") + "<br>" +
                        "<strong>Contact Number:</strong> " + req.getParameter("inputContactNumber") + "<br>" +
                        "<strong>Product Name:</strong> " + req.getParameter("inputProductName") + "<br>" +
                        "<strong>Quantity:</strong> " + req.getParameter("inputQuantity") + "<br>" +
                        "<strong>Shipping Address :</strong> " + req.getParameter("shippingAddress")+"<br>"+
                        "<strong>Billing  Address same as Shipping Address?</strong> " + req.getParameter("billingAddress") +
                        "</p>" +
                        "<a href='ProductPurchase.html' class='btn btn-primary mt-2'>Place Another Order</a>" +
                        "</div>" +
                        "</div>" +
                        "</div>" +
                        "</div>" +

                        "<script src='https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js'></script>" +
                        "</body>" +
                        "</html>"
        );
    }
}
