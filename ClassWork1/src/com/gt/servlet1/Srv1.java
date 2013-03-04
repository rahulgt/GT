package com.gt.servlet1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Srv1
 

I am adding a new file and adding up the line 1
*/
//@WebServlet("/rahul")
public class Srv1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Srv1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
	response.setContentType("text/html");
	PrintWriter pwObj=response.getWriter();
	try
	{
		pwObj.println("<html>");
		pwObj.println("<head>");
		pwObj.println("<title> Rahul Nair</title>");
		pwObj.println("</head>");
		pwObj.println("<body>");
		pwObj.println("<p>Rahul Dhyaan lagayo</p></body>");
		pwObj.println("<html>");
		
	}// a random line
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
