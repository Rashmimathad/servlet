package com.xworkz.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/patientDashboard",loadOnStartup = 33)
public class PatientDashboardServlet extends GenericServlet {

    public PatientDashboardServlet(){
        System.out.println("Created PatientDashboard servlet");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service from PatientDischarge servlet ");
    }
}
