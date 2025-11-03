package com.xworkz.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/treatmentFeedback",loadOnStartup = 76)
public class TreatmentFeedbackServlet extends GenericServlet {

    public TreatmentFeedbackServlet(){
        System.out.println("Created TreatmentFeedback servlet");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service from TreatmentFeedback servlet");
    }
}
