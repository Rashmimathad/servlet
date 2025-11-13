package com.xworkz.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet(urlPatterns = "/bloodBooking",loadOnStartup = 1)
public class BloodBookingServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Cookie[]  cookies=req.getCookies();
        if (cookies==null||cookies.length<1){
            throw new IllegalArgumentException("Cookie not found!!!");
        }
        for (Cookie cookie1:cookies){
            System.out.println(cookie1.getName()+" "+cookie1.getValue());
        }

        System.out.println("Name : " + req.getParameter("inputName"));
        System.out.println("Contact Number : " + req.getParameter("inputContactNumber"));
        System.out.println("Gender : " + req.getParameter("gender"));
        System.out.println("Blood Group : "+req.getParameter("bloodGroup"));
        System.out.println("Delivery Address : "+req.getParameter("deliveryAddress"));

        System.out.println("---------------------------------------------------");
        resp.setContentType("text/html");
        resp.getWriter().println("<html>" +
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
                        "<strong>Name:</strong> " + req.getParameter("inputName") + "<br>" +
                        "<strong>Contact Number:</strong> " + req.getParameter("inputContactNumber") + "<br>" +
                        "<strong>Gender:</strong>" + req.getParameter("gender") + "<br>" +
                        "<strong>Blood Group:</strong> "+req.getParameter("bloodGroup") + "<br>" +
                        "<strong>Delivery Address:</strong> "+req.getParameter("deliveryAddress") +
                        "</p>" +
                        "<a href='BloodBooking.html' class='btn btn-primary mt-2'>Place Another Order</a>" +
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
