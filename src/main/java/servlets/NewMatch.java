package servlets;


import java.io.IOException;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import service.PlayerService;


@WebServlet(urlPatterns = "/new-match")
@RequiredArgsConstructor
@Slf4j
public class NewMatch extends HttpServlet {
    private  final PlayerService playerService;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/view/new-match.jsp");
        dispatcher.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        playerService.createPlayers(request,response);
    }
}