package com.xworkz.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/patientVisit",loadOnStartup = 47)
public class PatientVisitServlet extends GenericServlet {

    public PatientVisitServlet(){
        System.out.println("Created PatientVisit servlet");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service from PatientVisit servlet");
    }
}
