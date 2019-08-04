package com.servlet;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dbconnections.DbConnection;

/**
 * Servlet implementation class doctorupdate
 */
@WebServlet("/doctorupdate")
public class doctorupdate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
String name=request.getParameter("name");
String specilization=request.getParameter("specilization");
		
		try {
			Connection con= DbConnection.getConnect();
			String SQL_UPDATE="insert into doctorlist values(?,?)";
			PreparedStatement ps=con.prepareStatement(SQL_UPDATE);
			ps.setString(1,name);
			ps.setString(2,specilization);
			int set=ps.executeUpdate();
			System.out.println("data updated");
			if(set>0) {
				
		RequestDispatcher rd=request.getRequestDispatcher("doctorupdate.jsp");
		rd.forward(request, response);
			}
			else
			{
				RequestDispatcher rd=request.getRequestDispatcher("adminview.jsp");
				rd.forward(request, response);
			}
		
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
