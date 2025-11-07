package com.xworkz.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/drivingLicense",loadOnStartup = 1)
public class DrivingLicenseServlet extends GenericServlet {
    public DrivingLicenseServlet(){
        System.out.println("Created Driving License servlet");
    }

    @Override
    public void service(ServletRequest req, ServletResponse resp)throws ServletException, IOException{
        System.out.println("Running service in Driving License servlet");
        System.out.println();
        System.out.println("Driving License Form Details : ");
        System.out.println("First Name : "+req.getParameter("firstName"));
        System.out.println("Last Name : "+req.getParameter("lastName"));
        System.out.println("Age : "+req.getParameter("age"));
        System.out.println("Gender : "+req.getParameter("gender"));
        System.out.println("Date Of Birth : "+req.getParameter("dob"));
        System.out.println("Email : "+req.getParameter("email"));
        System.out.println("Mobile No : "+req.getParameter("mobileNo"));
        System.out.println("Alternate Mobile No : "+req.getParameter("alternateMobileNo"));
        System.out.println("Nationality : "+req.getParameter("nationality"));
        System.out.println("Occupation : "+req.getParameter("occupation"));
        System.out.println("Residential Address : "+req.getParameter("residentialAddress"));
        System.out.println("Permanent Address : "+req.getParameter("permanentAddress"));
        System.out.println("Marital Status : "+req.getParameter("maritalStatus"));
        System.out.println("Type Of License : "+req.getParameter("typeOfLicense"));
        System.out.println("International Driving Permit Required? "+req.getParameter("internationalDrivingPermitRequired"));
        System.out.println("-------------------------------------------------------------------------------");
        resp.setContentType("text/html");
        resp.getWriter().println("Data Saved Successfully........."+"\n{\nFirst Name : "+req.getParameter("firstName")+"\nLast Name : "+req.getParameter("lastName")+
"\nAge : "+req.getParameter("age")+"\nGender : "+req.getParameter("gender")+"\nDate Of Birth : "+req.getParameter("dob")+"\nEmail : "+req.getParameter("email")+
     "\nMobile No : "+req.getParameter("mobileNo")+"\nAlternate Mobile No : "+req.getParameter("alternateMobileNo")+"\nNationality : "+req.getParameter("nationality")+
       "\nOccupation : "+req.getParameter("occupation")+"\nResidential Address : "+req.getParameter("residentialAddress")+"\nPermanent Address : "+req.getParameter("permanentAddress")+
        "\nMarital Status : "+req.getParameter("maritalStatus")+"\nType Of License : "+req.getParameter("typeOfLicense")+"\nInternational Driving Permit Required? "+req.getParameter("internationalDrivingPermitRequired")+"\n}");

    }
}
