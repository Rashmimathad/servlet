package com.xworkz.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/bloodDonation",loadOnStartup = 94)
public class BloodDonationServlet extends GenericServlet {

    public BloodDonationServlet(){
        System.out.println("Created BloodDonation servlet");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service from BloodDonation servlet");
    }
}
