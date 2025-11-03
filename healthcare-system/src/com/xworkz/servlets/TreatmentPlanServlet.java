package com.xworkz.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/treatmentPlan",loadOnStartup = 88)
public class TreatmentPlanServlet extends GenericServlet {

    public TreatmentPlanServlet(){
        System.out.println("Created TreatmentPlan servlet");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service from TreatmentPlan servlet");
    }
}
