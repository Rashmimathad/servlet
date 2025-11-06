package com.xworkz.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/buyer",loadOnStartup = 1)
public class BuyerServlet extends GenericServlet {

    public BuyerServlet(){
        System.out.println("Created Buyer servlet");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service in Buyer servlet");
        System.out.println();
        System.out.println("Buyer Details");
        System.out.println("Buyer Name : "+ servletRequest.getParameter("buyerName"));
        System.out.println("Email : "+servletRequest.getParameter("email"));
        System.out.println("Mobile Number : "+servletRequest.getParameter("mobileNumber"));
        System.out.println("Current Address : "+servletRequest.getParameter("currentAddress"));
        System.out.println("Preferred Property Type : "+servletRequest.getParameter("propertyType"));
        System.out.println("Budget Range : "+servletRequest.getParameter("budgetRange")+"rs");
        System.out.println("Property Size Requirement : "+servletRequest.getParameter("propertySizeRequirement")+" sq.ft");
        System.out.println("Preferred Location : "+servletRequest.getParameter("preferredLocation"));
        System.out.println("Purpose of Purchase : "+servletRequest.getParameter("purposeOfPurchase"));
        System.out.println("Source Of Information : "+servletRequest.getParameter("sourceOfInformation"));
        System.out.println("------------------------------------------------------------------------------------");
    }
}
