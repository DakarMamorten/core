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
 */
@WebServlet(urlPatterns = "/customer/find")
public class CustomerFindByIdServlet extends HttpServlet {
	public static final CustomerHibernateDAO customerHibernateDAO = new CustomerHibernateDAO();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("customer",new CustomerDTO());
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/customer/find.jsp");
		try {
			dispatcher.forward(req, resp);
		}
		catch (ServletException | IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
		Long customerId = Long.parseLong((req.getParameter("customerId")));
		CustomerDTO customerDTO  = customerHibernateDAO.findById(customerId);
		req.setAttribute("customer",customerDTO);
		try{
			RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/customer/find.jsp");
			dispatcher.forward(req,resp);
		}
		catch (IOException | ServletException e) {
			e.printStackTrace();
		}
	}
}
