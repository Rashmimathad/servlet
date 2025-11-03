package com.xworkz.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/caseSheet",loadOnStartup = 77)
public class CaseSheetServlet extends GenericServlet {

    public CaseSheetServlet(){
        System.out.println("Created CaseSheet servlet");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service from CaseSheet servlet");
    }
}
