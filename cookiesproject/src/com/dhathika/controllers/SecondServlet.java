package com.dhathika.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet{

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String school = req.getParameter("schoolname");
		String collage = req.getParameter("collagename");
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter pr = resp.getWriter();
		pr.println("<html>");
		pr.println("<head>");
		pr.println("<title> All details  </title>");
		pr.println("</head>");
		pr.println("<body>");
		Cookie[] cookies = req.getCookies();
		pr.println(" UserName <p>" + cookies[1].getValue() + "</p>"  );
		pr.println(" Password <p>" + cookies[0].getValue() + "</p>"  );
		pr.println(" school <p>" + school + "</p>"  );
		pr.println(" collage <p>" + collage + "</p>"  );
		pr.println("</body>");
		pr.println("</html>");
		
	}
}
