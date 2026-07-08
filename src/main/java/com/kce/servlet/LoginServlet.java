package com.kce.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user=request.getParameter("user");
		String pass=request.getParameter("pass");
		if(user.equalsIgnoreCase("administrator@kce.ac.in")){
				RequestDispatcher rd=request.getRequestDispatcher("AdminServlet");
				rd.forward(request,response);
		}
		else {
			//HttpSession session=request.getSession();
			
			String[] userdata=user.split("@");
			//session.setAttribute("user", userdata[0]);
			
			Cookie c=new Cookie("user",userdata[0]);
			response.addCookie(c);

            request.setAttribute("user", userdata[0]);
			RequestDispatcher rd=request.getRequestDispatcher("UserServlet");
				rd.forward(request, response);
		}
	}
}
