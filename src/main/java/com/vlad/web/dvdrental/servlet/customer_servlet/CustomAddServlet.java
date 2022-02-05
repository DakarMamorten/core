package com.vlad.web.dvdrental.servlet.customer_servlet;


import com.vlad.web.dvdrental.dao.customer.CustomerHibernateDAO;
import com.vlad.web.dvdrental.dto.CustomerDTO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Sergey Manko
 */@WebServlet(urlPatterns = "/dvd-rental/customer/add")
public class CustomAddServlet extends HttpServlet {
	 CustomerHibernateDAO customerHibernateDAO = new CustomerHibernateDAO();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/customer/add.jsp");
		try {
			dispatcher.forward(req, resp);
		}
		catch (ServletException | IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp){
		int storeId = Integer.parseInt(req.getParameter("storeId"));
		String firstName = req.getParameter("firstName");
		String lastName = req.getParameter("lastName");
		String email = req.getParameter("email");
		int addressId = Integer.parseInt(req.getParameter("addressId"));
		boolean activebool = Boolean.parseBoolean(req.getParameter("activebool"));
		int active = Integer.parseInt(req.getParameter("active"));
		CustomerDTO customerDTO = new CustomerDTO(storeId,firstName,lastName,email,addressId,activebool,active);
		customerHibernateDAO.save(customerDTO);

		try{
			resp.sendRedirect("/dvd-rental/customer/add");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
