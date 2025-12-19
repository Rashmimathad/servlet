package com.xworkz.iplbiddingapp.servlet;

import com.xworkz.iplbiddingapp.dto.PlayerDTO;
import com.xworkz.iplbiddingapp.dto.SearchDTO;
import com.xworkz.iplbiddingapp.service.BiddingService;
import com.xworkz.iplbiddingapp.service.impl.BiddingServiceImpl;
import com.xworkz.iplbiddingapp.utility.NumberValidation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/playerSearch",loadOnStartup = 1)
public class PlayerSearchServlet extends HttpServlet {
    private BiddingService biddingService = new BiddingServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

       String playerType =  req.getParameter("playerType");
       double battingAvg = NumberValidation.parseDoubleSafe(req.getParameter("battingAvg"));
       double bowlerAvg =  NumberValidation.parseDoubleSafe(req.getParameter("bowlerAvg"));
       int noOfStumps = NumberValidation.parseIntSafe(req.getParameter("noOfStumps"));

        try{
            SearchDTO searchDTO = new SearchDTO(playerType,battingAvg,bowlerAvg,noOfStumps);
            List<PlayerDTO> searchList = biddingService.validateAndSearch(searchDTO);
            if (searchList.iterator().hasNext()){
                req.setAttribute("searchList",searchList);
                req.setAttribute("selectedPlayerType", searchDTO.getPlayerType());
                System.out.println("No Of player found : "+searchList.size()+" based on the search");
            }else {
                req.setAttribute("errorMsg","Players not found for the given requirement!!!");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        req.getRequestDispatcher("PlayerSearchPage.jsp").forward(req,resp);
    }
}
