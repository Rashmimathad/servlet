package com.xworkz.weaponapp.servlets;

import com.xworkz.weaponapp.dto.SearchDTO;
import com.xworkz.weaponapp.dto.WeaponDTO;
import com.xworkz.weaponapp.service.WeaponService;
import com.xworkz.weaponapp.service.impl.WeaponServiceImpl;

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
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String weaponName = req.getParameter("weaponName");
        if (weaponName != null && !weaponName.isEmpty()) {
            Optional<WeaponDTO> editDetails = weaponService.validateName(new SearchDTO(weaponName));
            if (editDetails.isPresent()) {
                req.setAttribute("dto", editDetails.get());
                req.setAttribute("successMessage", "Weapon Data found!!");
            } else {
                System.err.println("Weapon not found");
                req.setAttribute("errorMessage", "Weapon not found!!");
            }
        }
        req.getRequestDispatcher("UpdateProfile.jsp").forward(req,resp);
    }
}
