package com.kce.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//HttpSession session=request.getSession();
		//String user=(String)session.getAttribute("user");
		Cookie[] c=request.getCookies();
		String user=c[0].getValue();
		response.setContentType("text/html");	
		PrintWriter out=response.getWriter();
		out.print("<html><body><b>");
		out.print("Welcome to Customer Page</b><br/>");
		out.print(user);
		out.print("<body></html>");
		out.close();
	}
}
