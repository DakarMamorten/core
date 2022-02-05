package com.vlad.web.dvdrental.servlet;


import com.vlad.web.dvdrental.service.Actor;
import com.vlad.web.dvdrental.service.ActorService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ActorServlet", urlPatterns = "/actors")
public class ActorServlet extends HttpServlet {
    ActorService actorService = new ActorService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        //Get parameter `name` from request
        if (name == null) {
            req.setAttribute("actors", ActorService.finAll());
        } else {
            req.setAttribute("actors", actorService.findByName(name));
        }
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/actors.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String name = req.getParameter("actorName");
        int age = Integer.parseInt(req.getParameter("actorAge"));

        Actor actor = new Actor(name, age);
        actorService.addActor(actor);
        resp.sendRedirect("/dvd-rental/actors");
    }
}
