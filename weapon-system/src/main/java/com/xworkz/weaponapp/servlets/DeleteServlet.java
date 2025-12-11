package com.xworkz.weaponapp.servlets;

import com.xworkz.weaponapp.dto.DeleteDTO;
import com.xworkz.weaponapp.exceptions.DataInvalidException;
import com.xworkz.weaponapp.service.WeaponService;
import com.xworkz.weaponapp.service.impl.WeaponServiceImpl;
import com.xworkz.weaponapp.utility.NumberValidation;
import lombok.SneakyThrows;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/delete",loadOnStartup = 1)
public class DeleteServlet  extends HttpServlet {

    private WeaponService weaponService = new WeaponServiceImpl();

    @Override
    @SneakyThrows
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

       int weaponId =  NumberValidation.parseIntSafe(req.getParameter("weaponId"));
       try{
           weaponService.validateAndDelete(new DeleteDTO(weaponId));
           System.out.println("Data Validated and deleted");
           req.setAttribute("successMessage","Weapon Id "+weaponId+" Deleted");
       } catch (DataInvalidException e) {
           req.setAttribute("errorMessage",e.getMessage());
       }
       req.getRequestDispatcher("DeleteResponse.jsp").forward(req,resp);
    }
}
