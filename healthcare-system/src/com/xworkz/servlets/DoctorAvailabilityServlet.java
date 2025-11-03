package com.xworkz.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/doctorAvailability",loadOnStartup = 35)
public class DoctorAvailabilityServlet extends GenericServlet {

    public DoctorAvailabilityServlet(){
        System.out.println("Created DoctorAvailability servlet");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service from DoctorAvailability servlet");
    }
}
