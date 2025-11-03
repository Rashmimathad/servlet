package com.xworkz.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/bedAvailability",loadOnStartup = 38)
public class BedAvailabilityServlet extends GenericServlet {

    public BedAvailabilityServlet(){
        System.out.println("Created BedAvailability servlet");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service from BedAvailability servlet");
    }
}
