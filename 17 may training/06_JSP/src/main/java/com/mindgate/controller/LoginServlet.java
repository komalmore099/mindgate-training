package com.mindgate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private PrintWriter printWriter;
	private String id;
	private String password;
              
   
    public LoginServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		printWriter=response.getWriter();
		id=request.getParameter("txtname1");
		password=request.getParameter("txtname2");
		
		
		if(id.equals(password))
		{
			//response.sendRedirect("success.jsp"); OR
			RequestDispatcher dispatcher=request.getRequestDispatcher("success.jsp");
			dispatcher.forward(request, response);
		}
		else
		{
           //response.sendRedirect("failure.jsp"); OR
			RequestDispatcher dispatcher=request.getRequestDispatcher("failure.jsp");
			dispatcher.forward(request, response);
		}

	}

}
