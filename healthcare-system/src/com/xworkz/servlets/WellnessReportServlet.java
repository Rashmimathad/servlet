package com.xworkz.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/wellnessReport",loadOnStartup = 56)
public class WellnessReportServlet extends GenericServlet {

    public WellnessReportServlet(){
        System.out.println("Created WellnessReport servlet");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service from WellnessReport servlet");
    }
}
