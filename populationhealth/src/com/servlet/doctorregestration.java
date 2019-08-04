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
 * Servlet implementation class doctorregestration
 */
@WebServlet("/doctorregestration")
public class doctorregestration extends HttpServlet {
	private static final long serialVersionUID = 1L;
   

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id=Integer.parseInt(request.getParameter("id"));
		String field=request.getParameter("field");
		String remark=request.getParameter("remark");
		String name=request.getParameter("name");
		String address=request.getParameter("address");
		String state=request.getParameter("state");
		String district=request.getParameter("district");
		string
				
				try {
					Connection con= DbConnection.getConnect();
					String SQL_INSERT="insert into doctorlist values(?,?)";
					PreparedStatement ps=con.prepareStatement(SQL_INSERT);
					ps.setString(1,name);
			
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

}
