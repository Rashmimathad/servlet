package com.xworkz.weaponapp.servlets;

import com.xworkz.weaponapp.dto.SearchByTypeDTO;
import com.xworkz.weaponapp.dto.WeaponDTO;
import com.xworkz.weaponapp.service.WeaponService;
import com.xworkz.weaponapp.service.impl.WeaponServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/searchByType",loadOnStartup = 1)
public class SearchByTypeServlet extends HttpServlet {

    private WeaponService weaponService = new WeaponServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String submitType = req.getParameter("submitType");
        if ("Clear".equalsIgnoreCase(submitType)) {
            System.out.println("Data Cleared");
            req.setAttribute("dto", null);
        } else {
            String weaponType = req.getParameter("weaponType");
            if (weaponType != null && !weaponType.isEmpty()) {
                List<WeaponDTO> searchDetails = weaponService.validateWeaponType(new SearchByTypeDTO(weaponType));
                if (searchDetails.iterator().hasNext()) {
                    req.setAttribute("searchList", searchDetails);
                    System.out.println("Weapons found : " + searchDetails.size() + " for weapon type : " + weaponType);
                    req.setAttribute("successMessage", "Weapon Details found!!");
                } else if (searchDetails.isEmpty()){
                    System.err.println("Weapon not found");
                    req.setAttribute("errorMessage", "Weapon Details not found!!");
                }
            }else if (weaponType==""){
                System.err.println("Weapon not found");
                req.setAttribute("errorMessage", "Weapon Details not found!!");
            }
        }
        req.getRequestDispatcher("SearchByType.jsp").forward(req, resp);
    }
}
