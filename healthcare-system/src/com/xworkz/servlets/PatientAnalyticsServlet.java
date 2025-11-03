package com.xworkz.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/patientAnalytics",loadOnStartup = 99)
public class PatientAnalyticsServlet extends GenericServlet {

    public PatientAnalyticsServlet(){
        System.out.println("Created PatientAnalytics servlet");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service from PatientAnalytics servlet");
    }
}
