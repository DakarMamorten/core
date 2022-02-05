package com.vlad.web.dvdrental.servlet.address_servlet;


import com.vlad.web.dvdrental.dao.address.AddressHibernateDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddressServlet", urlPatterns = "/address")
public class AddressServlet extends HttpServlet {
	AddressHibernateDAO addressHibernateDAO = new AddressHibernateDAO();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
		req.setAttribute("address", addressHibernateDAO.findAll());
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/address/list.jsp");
		int pages = addressHibernateDAO.countPages();
		req.setAttribute("pages", pages);
		try {
			dispatcher.forward(req, resp);
		}
		catch (ServletException | IOException e) {
			e.printStackTrace();
		}
	}
}

