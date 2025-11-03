package com.xworkz.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/medicalReport",loadOnStartup = 11)
public class MedicalReportServlet extends GenericServlet {

    public MedicalReportServlet(){
        System.out.println("Created MedicalReport servlet");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service from MedicalReport servlet");
    }
}
