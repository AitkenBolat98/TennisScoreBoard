package service;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.log4j.Log4j2;
import module.Players;
@Log4j2
public class PlayerServiceImpl implements PlayerService {
    @Override
    public void createPlayers(HttpServletRequest request, HttpServletResponse response){
        Players player1 = new Players();
        Players player2 = new Players();
        try {
            String player1Name = request.getParameter("player1-name");
            String player2Name = request.getParameter("player2-name");
            player1.setName(player1Name);
            player2.setName(player2Name);
        }catch (Exception e){

        }


    }
}
