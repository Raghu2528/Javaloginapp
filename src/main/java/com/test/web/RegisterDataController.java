package com.test.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.dao.RegisterDaonewwww;
import com.test.model.RegisterData;

/**
 * Servlet implementation class RegisterDataController
 */
@SuppressWarnings("serial")
public class RegisterDataController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String uName =request.getParameter("uname");
		
		RegisterDaonewwww rDao = new RegisterDaonewwww();
		
		RegisterData rDataa = rDao.getData(uName);
		
		RequestDispatcher rd = request.getRequestDispatcher("/showData.jsp");
		rd.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
