package com.rohit;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DemoServlet extends HttpServlet
{
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException
	{
		String color=request.getParameter("color");
		response.setContentType("text/html");
		try (PrintWriter out = response.getWriter()) 
		{
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet Program</title>");
			out.println("</head>");
			out.println("<body bgcolor="+color+">");
			out.println("<b>Hello from Post method</b><br><br>");
			out.println("You have selected" + " " + color + " " + "color");
			out.println("</body></html>");
		}
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException
	{
		response.setContentType("text/html");
		try (PrintWriter out = response.getWriter())
		{
			out.println("<b>Hello from Get method</b>");
			out.println("<h1>Welcome to JSPM</h1>");
		}
	}
}
