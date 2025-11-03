package com.xworkz.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/ambulanceTracking",loadOnStartup = 60)
public class AmbulanceTrackingServlet extends GenericServlet {

    public AmbulanceTrackingServlet(){
        System.out.println("Created AmbulanceTracking servlet");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service from AmbulanceTracking servlet");
    }
}
