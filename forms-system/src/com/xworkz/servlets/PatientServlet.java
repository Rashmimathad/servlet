package com.xworkz.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/patient",loadOnStartup = 1)
public class PatientServlet extends GenericServlet {

    public PatientServlet(){
        System.out.println("Created Patient Servlet");
    }

    @Override
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException{
        System.out.println("Running service in Patient servlet");
        System.out.println();
        System.out.println("Patient Details : ");
        System.out.println("Patient Name : "+req.getParameter("name"));
        System.out.println("Age : "+req.getParameter("age"));
        System.out.println("Gender : "+req.getParameter("gender"));
        System.out.println("Email : "+req.getParameter("email"));
        System.out.println("Contact Number : "+req.getParameter("contactNo"));
        System.out.println("Address : "+req.getParameter("address"));
        System.out.println("Status : "+req.getParameter("status"));
        System.out.println("Blood Group : "+req.getParameter("bloodGroup"));
        System.out.println("Disease Name : "+req.getParameter("diseaseName"));
        System.out.println("Incharge Doctor Name : "+req.getParameter("inchargeDoctor"));
        System.out.println("-----------------------------------------------------------------------------");
    }
}
