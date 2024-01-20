package service;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import module.Matches;
import module.Players;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import service.Config;
@RequiredArgsConstructor
public class PlayerServiceImpl implements PlayerService {
    private final Config configuraiton;
    @Override
    public void createPlayers(HttpServletRequest request, HttpServletResponse response){
        Configuration configurationPlayer = configuraiton.getConfiguration();
        Players player1 = Players.builder()
                .name(request.getParameter("player1Name"))
                .build();
        Players player2 = Players.builder()
                .name(request.getParameter("player2Name"))
                .build();
        try {
            SessionFactory sessionFactory = configurationPlayer.buildSessionFactory();
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(player1);
            session.save(player2);
            session.getTransaction().commit();

        }catch (Exception e){
            System.out.println("Player creation exception");
        }
    }
}
