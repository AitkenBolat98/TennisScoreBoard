package service;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface PlayerService {
    void createPlayers(HttpServletRequest request, HttpServletResponse response);
}
