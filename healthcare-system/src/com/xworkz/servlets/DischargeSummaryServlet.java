package com.xworkz.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/dischargeSummary",loadOnStartup = 82)
public class DischargeSummaryServlet extends GenericServlet {

    public DischargeSummaryServlet(){
        System.out.println("Created DischargeSummary servlet");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service from DischargeSummary servlet");
    }
}
