package com.yshpyluk.servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by yshpyluk on 3/15/17.
 */
public class HelloWorld extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws javax.servlet.ServletException, java.io.IOException  {
		response.getWriter().println(this.getServletName() + " Hello World!!!");
	}
}
