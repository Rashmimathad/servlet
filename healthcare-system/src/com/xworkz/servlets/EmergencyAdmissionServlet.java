package com.xworkz.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/emergencyAdmission",loadOnStartup = 71)
public class EmergencyAdmissionServlet extends GenericServlet {

    public EmergencyAdmissionServlet(){
        System.out.println("Created EmergencyAdmission servlet");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service from EmergencyAdmission servlet");
    }
}
