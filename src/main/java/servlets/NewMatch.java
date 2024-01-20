package servlets;


import java.io.IOException;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import lombok.RequiredArgsConstructor;
import service.PlayerService;


@WebServlet(name = "servlets.NewMatch", value = "/new-match")
@RequiredArgsConstructor
public class NewMatch extends HttpServlet {
    private  final PlayerService playerService;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        playerService.createPlayers(request,response);
    }
}