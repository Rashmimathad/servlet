package com.xworkz.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/dailySummary",loadOnStartup = 23)
public class DailySummaryServlet extends GenericServlet {

    public DailySummaryServlet(){
        System.out.println("Created DailySummary servlet");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service from DailySummary servlet");
    }
}
