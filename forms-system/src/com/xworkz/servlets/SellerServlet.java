package com.xworkz.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/seller",loadOnStartup = 1)
public class SellerServlet extends GenericServlet {

    public SellerServlet(){
        System.out.println("Created Seller servlet");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service in Seller servlet");
        System.out.println();
        System.out.println("Seller Details");
        System.out.println("Seller Name ; "+servletRequest.getParameter("sellerName"));
        System.out.println("Email : "+servletRequest.getParameter("email"));
        System.out.println("Mobile Number : "+servletRequest.getParameter("mobileNo"));
        System.out.println("Property Type : "+servletRequest.getParameter("propertyType"));
        System.out.println("Property Address : "+servletRequest.getParameter("propertyAddress"));
        System.out.println("Water and Electricity Availability : "+servletRequest.getParameter("waterAndElectricityAvailability"));
        System.out.println("Ownership Type : "+servletRequest.getParameter("ownershipType"));
        System.out.println("Availability Status : "+servletRequest.getParameter("availabilityStatus"));
        System.out.println("Mode Of Contact : "+servletRequest.getParameter("modeOfContact"));
        System.out.println("---------------------------------------------------------------------------------------");
    }
}
