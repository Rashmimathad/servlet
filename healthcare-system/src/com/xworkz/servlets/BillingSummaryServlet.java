package com.xworkz.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/billingSummary",loadOnStartup = 84)
public class BillingSummaryServlet extends GenericServlet {

    public BillingSummaryServlet(){
        System.out.println("Created BillingSummary servlet");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service from BillingSummary servlet");
    }
}
