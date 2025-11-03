package com.xworkz.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/patientDiagnosis",loadOnStartup = 62)
public class PatientDiagnosisServlet extends GenericServlet {

    public PatientDiagnosisServlet(){
        System.out.println("Created PatientDiagnosis servlet");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service from PatientDiagnosis servlet");
    }
}
