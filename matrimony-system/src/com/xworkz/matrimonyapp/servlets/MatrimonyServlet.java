package com.xworkz.matrimonyapp.servlets;

import com.xworkz.matrimonyapp.dto.MatrimonyDto;
import com.xworkz.matrimonyapp.exception.DataInvalidException;
import com.xworkz.matrimonyapp.service.MatrimonyService;
import com.xworkz.matrimonyapp.service.impl.MatrimonyServiceImpl;
import com.xworkz.matrimonyapp.utility.NumberCheckValidation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/matrimonyForm",loadOnStartup = 1)
public class MatrimonyServlet extends HttpServlet {
    private final MatrimonyService matrimonyService=new MatrimonyServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("inputEmail");
        String createProfileFor = req.getParameter("inputCreateProfileFor");
        String gender = req.getParameter("inputGender");
        String dob =req.getParameter("inputDob");
        String motherTongue =req.getParameter("inputMotherTongue");
        String religion = req.getParameter("inputReligion");
        String maritalStatus =req.getParameter("inputMaritalStatus");
        int height =NumberCheckValidation.parseIntSafe(req.getParameter("inputHeight"));
        try {
            MatrimonyDto matrimonyDto = new MatrimonyDto(email, createProfileFor, gender, dob, motherTongue, religion, maritalStatus, height);
            matrimonyService.validateAndSave(matrimonyDto);
            req.setAttribute("email",email);
            req.setAttribute("createProfileFor",createProfileFor);
            req.setAttribute("gender",gender);
            req.setAttribute("dob", req.getParameter("inputDob"));
            req.setAttribute("motherTongue", req.getParameter("inputMotherTongue"));
            req.setAttribute("religion", req.getParameter("inputReligion"));
            req.setAttribute("maritalStatus", req.getParameter("inputMaritalStatus"));
            req.setAttribute("height", NumberCheckValidation.parseDoubleSafe(req.getParameter("inputHeight")));

            req.setAttribute("successMessage", "Data Saved Successfully!!!!");
        } catch (DataInvalidException e) {
            req.setAttribute("errorMessage","Data not Saved Saved Successfully!!!!");
        }
        req.getRequestDispatcher("MatrimonyFormResult.jsp").forward(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("MatrimonyForm.jsp").forward(req,resp);
    }
}
