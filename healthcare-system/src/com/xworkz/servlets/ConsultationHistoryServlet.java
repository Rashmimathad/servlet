package com.xworkz.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/consultationHistory",loadOnStartup = 81)
public class ConsultationHistoryServlet extends GenericServlet {

    public ConsultationHistoryServlet(){
        System.out.println("Created ConsultationHistory servlet");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service from Consultation history servlet");
    }
}
