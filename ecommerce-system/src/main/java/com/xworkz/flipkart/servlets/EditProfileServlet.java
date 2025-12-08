package com.xworkz.flipkart.servlets;

import com.xworkz.flipkart.dto.FlipkartUserDTO;
import com.xworkz.flipkart.dto.SearchDTO;
import com.xworkz.flipkart.service.FlipkartService;
import com.xworkz.flipkart.service.impl.FlipkartServiceImpl;
import com.xworkz.flipkart.utility.NumberValidation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@WebServlet(urlPatterns = "/editProfile",loadOnStartup = 1)
public class EditProfileServlet extends HttpServlet {
    private final FlipkartService flipkartService = new FlipkartServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      String contactNo =  req.getParameter("contactNo");
        if (contactNo != null && !contactNo.isEmpty()) {
            long contactNumber = NumberValidation.parseLongSafe(contactNo);
            SearchDTO searchDTO = new SearchDTO(contactNumber);
            Optional<FlipkartUserDTO> editDetails = flipkartService.validateContactNumber(searchDTO);
            if (editDetails.isPresent()) {
                System.out.println("Values pre-populated");
                req.setAttribute("editDetails", editDetails.get());
            } else {
                System.err.println("Contact number not found");
                req.setAttribute("errorMessage", "Profile Not found!!!");
            }
        }
       req.getRequestDispatcher("UpdateProfile.jsp").forward(req,resp);
    }
}
