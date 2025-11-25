package com.xworkz.matrimonyapp.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/matrimonyForm",loadOnStartup = 1)
public class MatrimonyServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("inputEmail");
        String createProfileFor = req.getParameter("inputCreateProfileFor");
        String gender = req.getParameter("inputGender");
        String groomDob = req.getParameter("inputDobGroom");
        String brideDob = req.getParameter("inputDobBride");
        String groomMotherTongue = req.getParameter("inputMotherTongueGroom");
        String brideMotherTongue = req.getParameter("inputMotherTongueBride");
        String groomReligion = req.getParameter("inputReligionGroom");
        String brideReligion = req.getParameter("inputReligionBride");
        String groomMaritalStatus = req.getParameter("inputMaritalStatusGroom");
        String brideMaritalStatus = req.getParameter("inputMaritalStatusBride");
        String groomHeight = req.getParameter("inputHeightGroom");
        String brideHeight = req.getParameter("inputHeightBride");

        req.setAttribute("email",email);
        req.setAttribute("createProfileFor",createProfileFor);
        req.setAttribute("gender",gender);
        if ("Male".equals(gender)) {
            req.setAttribute("groomDob", groomDob);
            req.setAttribute("groomMotherTongue", groomMotherTongue);
            req.setAttribute("groomReligion", groomReligion);
            req.setAttribute("groomMaritalStatus",groomMaritalStatus);
            req.setAttribute("groomHeight",groomHeight);
        }else {
            req.setAttribute("brideDob", brideDob);
            req.setAttribute("brideMotherTongue", brideMotherTongue);
            req.setAttribute("brideReligion", brideReligion);
            req.setAttribute("brideMaritalStatus", brideMaritalStatus);
            req.setAttribute("brideHeight", brideHeight);
        }
        req.getRequestDispatcher("MatrimonyFormResult.jsp").forward(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("MatrimonyForm.jsp").forward(req,resp);
    }
}
