package com.xworkz.weaponapp.servlets;

import com.xworkz.weaponapp.dto.SearchDTO;
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
import java.util.Optional;

@WebServlet(urlPatterns = "/editProfile",loadOnStartup = 1)
public class UpdateServlet extends HttpServlet {
    private final WeaponService weaponService = new WeaponServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String weaponName = req.getParameter("weaponName");
       String weaponType =  req.getParameter("weaponType");
       String serialNumber = req.getParameter("serialNumber");
       String specifications = req.getParameter("specification");
       double price = NumberValidation.parseDoubleSafe(req.getParameter("price"));

        try{
            WeaponDTO weaponDTO = new WeaponDTO(weaponName,weaponType,serialNumber,specifications,price);
            weaponService.validateAndUpdate(weaponDTO);
            req.setAttribute("dto",weaponDTO);
            req.setAttribute("successMessage","Data Updated Successfully!!");
        } catch (DataInvalidException | DuplicateWeaponNameException e) {
            req.setAttribute("errorMessage",e.getMessage());
            e.printStackTrace();
        }

        req.getRequestDispatcher("UpdateResponse.jsp").forward(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String weaponName = req.getParameter("weaponName");
        if (weaponName != null && !weaponName.isEmpty()) {
            Optional<WeaponDTO> editDetails = weaponService.validateName(new SearchDTO(weaponName));
            if (editDetails.isPresent()) {
                req.setAttribute("details", editDetails.get());

                req.setAttribute("successMessage", "Weapon Data found!!");
            } else {
                System.err.println("Weapon not found");
                req.setAttribute("errorMessage", "Weapon not found!!");
            }
        }
        req.getRequestDispatcher("UpdateProfile.jsp").forward(req,resp);
    }
}
