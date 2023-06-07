

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class validate03
 */
@WebServlet("/validate03")
public class validate03 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String n =request.getParameter("e");
		String p=request.getParameter("f");
		PrintWriter out=response.getWriter();
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://LocalHost:3306/sig1","root","631997");
			PreparedStatement pr=con.prepareStatement("update student set password='"+p+"' where name='"+n+"'" );
			int aa=pr.executeUpdate();
			if(aa==1)
			{
				//response.sendRedirect("home.jsp");
				out.println("successfully changed");
				RequestDispatcher  req=request.getRequestDispatcher("home.jsp");
				req.include(request,response);
			}
			else
			{
				response.sendRedirect("sign1.jsp");
			}
		con.close();
		}
		catch(SQLException | ClassNotFoundException e)
		{
			System.out.println(e);
		}

	}
	}
	