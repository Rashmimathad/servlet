package com.xworkz.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/salarySlip",loadOnStartup = 58)
public class SalarySlipServlet extends GenericServlet {

    public SalarySlipServlet(){
        System.out.println("Created SalarySlip report");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service from SalarySlip servlet");
    }
}
