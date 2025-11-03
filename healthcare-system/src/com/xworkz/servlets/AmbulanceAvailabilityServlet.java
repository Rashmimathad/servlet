package com.xworkz.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/ambulanceAvailability",loadOnStartup = 50)
public class AmbulanceAvailabilityServlet extends GenericServlet {

    public AmbulanceAvailabilityServlet(){
        System.out.println("Created AmbulanceAvailability servlet");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service from AmbulanceAvailability servlet");
    }
}
