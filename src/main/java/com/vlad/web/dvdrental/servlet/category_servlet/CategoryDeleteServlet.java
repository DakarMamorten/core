package com.vlad.web.dvdrental.servlet.category_servlet;


import com.vlad.web.dvdrental.dao.category.CategoryHibernateDAO;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/category/delete")
public class CategoryDeleteServlet extends HttpServlet {
    private final CategoryHibernateDAO categoryHibernateDAO = new CategoryHibernateDAO();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        try {
            long categoryId = Long.parseLong(req.getParameter("categoryId"));
            categoryHibernateDAO.deleteById(categoryId);
            resp.sendRedirect("/dvd-rental/category");

        } catch (NumberFormatException | IOException e) {
            e.printStackTrace();
        }
    }
}
