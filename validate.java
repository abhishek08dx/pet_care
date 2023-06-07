

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("validate")
public class validate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public validate() {
        super();
 
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String na =request.getParameter("a");
	String pa=request.getParameter("b");
	
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://LocalHost:3306/sig1","root","631997");
		PreparedStatement pr=con.prepareStatement("select * from student where name='"+na+"' and password='"+pa+"'");
		ResultSet rs=pr.executeQuery();
		if(rs.next())
		{
			RequestDispatcher  req=request.getRequestDispatcher("home.jsp");
			req.include(request,response);
		}
		else
		{
			response.sendRedirect("NewFile1.jsp");
		}
	con.close();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}

}
}
