package com.xworkz.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/revenueReport",loadOnStartup = 43)
public class RevenueReportServlet extends GenericServlet {

    public RevenueReportServlet(){
        System.out.println("Created RevenueReport servlet");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service from RevenueReport servlet");
    }
}
