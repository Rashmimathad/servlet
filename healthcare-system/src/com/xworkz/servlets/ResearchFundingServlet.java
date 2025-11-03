package com.xworkz.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/researchFunding",loadOnStartup = 92)
public class ResearchFundingServlet extends GenericServlet {

    public ResearchFundingServlet(){
        System.out.println("Created ResearchFunding servlet");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service from ResearchFunding servlet");
    }
}
