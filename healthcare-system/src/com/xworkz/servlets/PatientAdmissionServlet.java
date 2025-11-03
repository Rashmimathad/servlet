package com.xworkz.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/patientAdmission",loadOnStartup = 34)
public class PatientAdmissionServlet extends GenericServlet {

    public PatientAdmissionServlet(){
        System.out.println("Created PatientAdmission servlet");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service from PatientAdmission servlet");
    }
}
