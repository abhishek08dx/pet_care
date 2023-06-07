

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class booked
 */
@WebServlet("/booked")
public class booked extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public booked() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String t1=request.getParameter("token");
		String t2=request.getParameter("tnam");
		PrintWriter out=response.getWriter();
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://LocalHost:3306/sig1","root","631997");
			PreparedStatement pr=con.prepareStatement("update student set  token='"+t1+"' where  name='"+t2+"'");
			int bk=pr.executeUpdate();
			if(bk==1)
			{
				//response.sendRedirect("home.jsp");
				
				out.println("<center>");
				out.println("<h3>successfully token booked</h3>");
				out.println("<h3> your token number='"+t1+"'</h3>");
				out.println("</center>");
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


