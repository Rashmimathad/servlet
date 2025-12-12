package com.xworkz.weaponapp.servlets;

import com.xworkz.weaponapp.dto.SearchDTO;
import com.xworkz.weaponapp.dto.WeaponDTO;
import com.xworkz.weaponapp.exceptions.DataInvalidException;
import com.xworkz.weaponapp.exceptions.DuplicateWeaponNameException;
import com.xworkz.weaponapp.service.WeaponService;
import com.xworkz.weaponapp.service.impl.WeaponServiceImpl;
import lombok.SneakyThrows;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;


@WebServlet(urlPatterns = "/search",loadOnStartup = 1)

public class SearchServlet extends HttpServlet {

    private final WeaponService weaponService = new WeaponServiceImpl();

    @Override
    @SneakyThrows
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

       String submitType = req.getParameter("submitType");
       if ("Clear".equalsIgnoreCase(submitType)){
           System.out.println("Data Cleared");
           req.setAttribute("dto",null);
       }else {
           String weaponName = req.getParameter("weaponName");
           if (weaponName != null && !weaponName.isEmpty()) {
               SearchDTO searchDTO=new SearchDTO(weaponName);
               Optional<WeaponDTO> searchDetails = weaponService.validateName(searchDTO);
               if (searchDetails.isPresent()) {
                   req.setAttribute("dto", searchDetails.get());
                   req.setAttribute("successMessage", "Weapon Data found!!");
               } else {
                   System.err.println("Weapon not found");
                   req.setAttribute("errorMessage", "Weapon not found!!");
               }
           }
       }
        req.getRequestDispatcher("SearchPage.jsp").forward(req,resp);
    }

}
