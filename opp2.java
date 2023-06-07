

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class opp2
 */
@WebServlet("opp2")
public class opp2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public opp2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		ArrayList <String> tn=new <String>ArrayList();
		ArrayList <String> tt=new <String>ArrayList();
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://LocalHost:3306/sig1","root","631997");
			PreparedStatement pr=con.prepareStatement("select * from token ");
			ResultSet rs=pr.executeQuery();
			out.println("<center>");
			out.println("<table border=2 cellpadding=10 style=center");
			
			out.println("<tr>");
			out.println("<th>token number</th>");
			out.println("<th>token timming</th>");
			out.println("</tr>");
			
			
			while(rs.next())
			{
				tn.add(rs.getString("tokens"));
				tt.add(rs.getString("tokentime"));
				
			}
			RequestDispatcher  req=request.getRequestDispatcher("home.jsp");
			req.include(request,response);
		Iterator<String> itn=tn.iterator();
		Iterator<String> itt=tt.iterator();
		for(int i=0;i<tn.size();i++)
		{
			out.println("<tr><td>"+tn.get(i)+"</td>");
			out.println("<td>"+tt.get(i)+"</td>");
		}
		out.println("</table >");
		out.println("</center>");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
				

			
	}
	
	}


