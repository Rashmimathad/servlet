package com.xworkz.weaponapp.servlets;

import com.xworkz.weaponapp.dto.WeaponDTO;
import com.xworkz.weaponapp.exceptions.DataInvalidException;
import com.xworkz.weaponapp.exceptions.DuplicateWeaponNameException;
import com.xworkz.weaponapp.service.WeaponService;
import com.xworkz.weaponapp.service.impl.WeaponServiceImpl;
import com.xworkz.weaponapp.utility.NumberValidation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/register",loadOnStartup = 1)

public class RegistrationServlet extends HttpServlet {

    private final WeaponService weaponService = new WeaponServiceImpl();

    public RegistrationServlet(){
        System.out.println("Registration servlet created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String weaponName = req.getParameter("weaponName");
        String weaponType = req.getParameter("weaponType");
        String serialNumber = req.getParameter("serialNumber");
        String specification = req.getParameter("specification");
        double price = NumberValidation.parseDoubleSafe(req.getParameter("price"));

        try{
            WeaponDTO weaponDTO = new WeaponDTO(weaponName,weaponType,serialNumber,specification,price);
            weaponService.validateAndSave(weaponDTO);
            req.setAttribute("dto",weaponDTO);
            req.setAttribute("successMessage","Data Saved Successfully!!");
        } catch (DataInvalidException | DuplicateWeaponNameException e) {
            req.setAttribute("errorMessage",e.getMessage());
            e.printStackTrace();
        }
        req.getRequestDispatcher("RegisterResponse.jsp").forward(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("RegistrationForm.jsp").forward(req,resp);
    }
}
