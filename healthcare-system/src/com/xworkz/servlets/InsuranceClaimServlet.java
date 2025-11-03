package com.xworkz.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/insuranceClaim",loadOnStartup = 25)
public class InsuranceClaimServlet extends GenericServlet {

    public InsuranceClaimServlet(){
        System.out.println("Created InsuranceClaim servlet");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service from InsuranceClaim servlet");
    }
}
