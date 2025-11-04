package com.xworkz.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/educationDetails",loadOnStartup = 1)
public class EducationDetailsServlet extends GenericServlet {

    public EducationDetailsServlet(){
        System.out.println("Created EducationDetails servlet");
    }

    @Override
    public void service(ServletRequest req, ServletResponse resp)throws ServletException, IOException{
        System.out.println("Running service in EducationDetails servlet");
        System.out.println("SSLC Details : ");
        System.out.println("Student Name : "+req.getParameter("studentName"));
        System.out.println("Year Of PassOut :"+req.getParameter("yearOfPassOutSslc"));
        System.out.println("Percentage : "+req.getParameter("percentageSslc")+"%");
        System.out.println();
        System.out.println("PUC Details :");
        System.out.println("Student Name : "+req.getParameter("studentName"));
        System.out.println("Year Of PassOut : "+req.getParameter("yearOfPassOutPuc"));
        System.out.println("Percentage : "+req.getParameter("percentagePuc")+"%");
        System.out.println();
        System.out.println("Degree Details : ");
        System.out.println("Student Name : "+req.getParameter("studentName"));
        System.out.println("Year Of PassOut : "+req.getParameter("yearOfPassOutDegree"));
        System.out.println("Percentage : "+req.getParameter("percentageDegree")+"%");
        System.out.println("Stream : "+req.getParameter("stream"));
        System.out.println();
        System.out.println("Master Degree Details : ");
        System.out.println("Student Name : "+req.getParameter("studentName"));
        System.out.println("Year Of PassOut : "+req.getParameter("yearOfPassOutMasterDegree"));
        System.out.println("Percentage : "+req.getParameter("percentageMasterDegree")+"%");
        System.out.println("-------------------------------------------------------------------");
    }
}
