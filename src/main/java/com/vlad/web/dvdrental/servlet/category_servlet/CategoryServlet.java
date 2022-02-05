package com.vlad.web.dvdrental.servlet.category_servlet;

import com.vlad.web.dvdrental.dao.category.CategoryHibernateDAO;
import com.vlad.web.dvdrental.dto.CategoryDTO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CategoryServlet", urlPatterns = "/category")
public class CategoryServlet extends HttpServlet {
	private static final CategoryHibernateDAO categoryHibernateDAO = new CategoryHibernateDAO();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
		req.setAttribute("category", categoryHibernateDAO.findAll());
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/category.jsp");
		try {
			dispatcher.forward(req, resp);
		}
		catch (ServletException | IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp){
		String categoryName = req.getParameter("categoryName");
		CategoryDTO categoryDTO = new CategoryDTO(categoryName);
		categoryHibernateDAO.save(categoryDTO);
        try{
            resp.sendRedirect("/dvd-rental/category");
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
