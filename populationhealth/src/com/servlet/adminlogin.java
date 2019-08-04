package com.servlet;


import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.dbconnections.DbConnection;

/**
 * Servlet implementation class adminlogin
 */
@WebServlet("/adminlogin")
public class adminlogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		

	
			Connection con= DbConnection.getConnect();
			String SQL_FIND="select * from adminlogin where name=? && pass=?";
		try {
			PreparedStatement ps=con.prepareStatement(SQL_FIND);
			ps.setString(1,username);
			ps.setString(2,password);
			
			ResultSet set=ps.executeQuery();
		    	if(set.next())
		    	{
		    		RequestDispatcher rd=request.getRequestDispatcher("adminView.jsp");
		         	rd.forward(request, response);
		    	}
		    	else
		    	{			
		    		RequestDispatcher rd=request.getRequestDispatcher("adminlogin.jsp");
		         	rd.forward(request, response);
		    	}
			}
		 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
