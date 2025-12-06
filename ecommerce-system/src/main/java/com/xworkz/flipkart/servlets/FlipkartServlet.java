package com.xworkz.flipkart.servlets;

import com.xworkz.flipkart.dto.FlipkartUserDTO;
import com.xworkz.flipkart.exceptions.ContactNumberDuplicateException;
import com.xworkz.flipkart.exceptions.DataInvalidException;
import com.xworkz.flipkart.service.FlipkartService;
import com.xworkz.flipkart.service.impl.FlipkartServiceImpl;
import com.xworkz.flipkart.utility.NumberValidation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/flipkartForm",loadOnStartup = 1)
public class FlipkartServlet extends HttpServlet {
    private final FlipkartService flipkartService = new FlipkartServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fullName = req.getParameter("inputFullName");
        long contactNumber = NumberValidation.parseLongSafe(req.getParameter("inputContactNumber"));
        String gender = req.getParameter("gender");
        int age = NumberValidation.parseIntSafe(req.getParameter("inputAge"));
        String address = req.getParameter("inputAddress");
        try{
            FlipkartUserDTO flipkartUserDTO = new FlipkartUserDTO(fullName,contactNumber,gender,age,address);
            flipkartService.validateAndSave(flipkartUserDTO);
            req.setAttribute("dto",flipkartUserDTO);
            req.setAttribute("successMessage","Data Saved Successfully!!");

        }catch (ContactNumberDuplicateException | DataInvalidException e) {
            req.setAttribute("errorMessage",e.getMessage());
            e.printStackTrace();
        }
        req.getRequestDispatcher("FlipkartUserResult.jsp").forward(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("FlipkartForm.jsp").forward(req,resp);
    }
}
