package com.xworkz.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/medicineCategory",loadOnStartup = 87)
public class MedicineCategoryServlet extends GenericServlet {

    public MedicineCategoryServlet(){
        System.out.println("Created MedicineCategory servlet");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service from MedicineCategory servlet");
    }
}
