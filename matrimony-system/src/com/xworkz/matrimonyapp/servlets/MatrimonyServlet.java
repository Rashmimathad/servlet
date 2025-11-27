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
        String dob =req.getParameter("inputDobGroom");
        String motherTongue =req.getParameter("inputMotherTongueGroom");
        String religion = req.getParameter("inputReligionGroom");
        String maritalStatus =req.getParameter("inputMaritalStatusGroom");
        int height =NumberCheckValidation.parseIntSafe(req.getParameter("inputHeightGroom"));

        req.setAttribute("email",email);
        req.setAttribute("createProfileFor",createProfileFor);
        req.setAttribute("gender",gender);
        try {

            if ("Male".equals(gender)) {
                req.setAttribute("dob", req.getParameter("inputDobGroom"));
                req.setAttribute("motherTongue", req.getParameter("inputMotherTongueGroom"));
                req.setAttribute("religion", req.getParameter("inputReligionGroom"));
                req.setAttribute("maritalStatus", req.getParameter("inputMaritalStatusGroom"));
                req.setAttribute("height", NumberCheckValidation.parseDoubleSafe(req.getParameter("inputHeightGroom")));
            } else {
                req.setAttribute("dob", req.getParameter("inputDobBride"));
                req.setAttribute("motherTongue", req.getParameter("inputMotherTongueBride"));
                req.setAttribute("religion", req.getParameter("inputReligionBride"));
                req.setAttribute("maritalStatus", req.getParameter("inputMaritalStatusBride"));
                req.setAttribute("height", NumberCheckValidation.parseIntSafe(req.getParameter("inputHeightBride")));

            }

            MatrimonyDto matrimonyDto = new MatrimonyDto(email, createProfileFor, gender, dob, motherTongue, religion, maritalStatus, height);
            matrimonyService.validateAndSave(matrimonyDto);
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
