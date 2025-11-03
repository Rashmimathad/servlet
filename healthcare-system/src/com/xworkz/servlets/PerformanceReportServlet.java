package com.xworkz.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/performanceReport",loadOnStartup = 63)
public class PerformanceReportServlet extends GenericServlet {

    public  PerformanceReportServlet(){
        System.out.println("Created PerformanceReport servlet");
    }


    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running ");
    }
}
