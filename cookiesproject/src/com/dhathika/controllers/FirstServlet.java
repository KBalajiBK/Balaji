package com.dhathika.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	// when it participates in serialization i.e when the object of this
	// class is going out of jvm/ java context to another program.

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// how to create coocies.
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		Cookie cookieUserName = new Cookie("usernameCookie", username);
		Cookie cookiePassword = new Cookie("passwordCookie", password);
		cookieUserName.setMaxAge(50);
		resp.addCookie(cookiePassword);
		resp.addCookie(cookieUserName);
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter pr = resp.getWriter();
		pr.println("<html>");
		pr.println("<head>");
		pr.println("<title> User Details Page </title>");
		pr.println("</head>");
		pr.println("<body>");
		pr.println("<form action= \"two\" method=\"post\">");
		pr.println("Enter school Name <input type=\"text\" name =\"schoolname\"><br>");
		pr.println("Enter Collage Name <input type=\"text\" name =\"collagename\"><br>");
		pr.println("<input type=\"submit\" value =\"Go\">");
		pr.println("</form>");
		pr.println("</body>");
		pr.println("</html>");

		// how to set cookies to the response or request.
	}
}
