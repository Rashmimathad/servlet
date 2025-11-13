package com.xworkz.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet(urlPatterns = "/movieTicket",loadOnStartup = 1)
public class MovieTicketServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[]  cookies=req.getCookies();
        if (cookies==null||cookies.length<1){
            throw new IllegalArgumentException("Cookie not found!!!");
        }
        for (Cookie cookie1:cookies){
            System.out.println(cookie1.getName()+" "+cookie1.getValue());
        }

        System.out.println("Name : "+req.getParameter("inputName"));
        System.out.println("Contact Number : "+req.getParameter("inputContactNumber"));
        System.out.println("Movie Name : "+req.getParameter("inputMovieName"));
        System.out.println("Special Requests : "+req.getParameter("specialRequests"));
        System.out.println("Ticket Type : "+req.getParameter("ticketType"));
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
                "<h5 class='card-title text-success'><b>Movie Ticket Booked Successfully!!!</b></h5>" +
                "<p class='card-text text-start ps-3'>" +
                "<strong>Name:</strong> " + req.getParameter("inputName") + "<br>" +
                "<strong>Contact Number:</strong> " + req.getParameter("inputContactNumber") + "<br>" +
                "<strong>Movie Name:</strong>" +req.getParameter("inputMovieName") + "<br>" +
                "<strong>Special Requests:</strong> "+req.getParameter("specialRequests") + "<br>" +
                "<strong>Ticket Type:</strong> "+req.getParameter("ticketType") +
                "</p>" +
                "<a href='MovieTicket.html' class='btn btn-primary mt-2'>Book Another Ticket</a>" +
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
