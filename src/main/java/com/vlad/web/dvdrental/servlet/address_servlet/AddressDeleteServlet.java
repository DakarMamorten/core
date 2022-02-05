package com.vlad.web.dvdrental.servlet.address_servlet;


import com.vlad.web.dvdrental.dao.address.AddressHibernateDAO;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/address/delete")
public class AddressDeleteServlet extends HttpServlet {
    private final AddressHibernateDAO addressHibernateDAO = new AddressHibernateDAO();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        try {
            long addressId = Long.parseLong(req.getParameter("addressId"));
            addressHibernateDAO.deleteById(addressId);
            resp.sendRedirect("/dvd-rental/address");

        } catch (NumberFormatException | IOException e) {
            e.printStackTrace();
        }
    }
}

