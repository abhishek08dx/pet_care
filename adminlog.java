

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class adminlog
 */
@WebServlet("/adminlog")
public class adminlog extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public adminlog() {
        super();
 
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String n =request.getParameter("g");
		String p=request.getParameter("h");
		PrintWriter out=response.getWriter();
	ArrayList <String> obj=new ArrayList <String>();
	ArrayList <String> obj1=new ArrayList <String>();
	ArrayList <Integer> obj2=new ArrayList <Integer>();
	Bean b=new Bean();
	try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://LocalHost:3306/sig1","root","631997");
			PreparedStatement pr=con.prepareStatement("select * from student where name='"+n+"' and password='"+p+"'");
			ResultSet rs=pr.executeQuery();
			
			
			if(rs.next())
			{
				RequestDispatcher  req=request.getRequestDispatcher("home.jsp");
				req.include(request,response);
			}
			else
			{
				response.sendRedirect("sign1.jsp");
			}
			Statement pr1=con.createStatement();
			ResultSet rs1= pr1.executeQuery("select * from student");
			while(rs1.next()) {
				b.setname(rs1.getString(1));
				obj.add(b.getname());
				b.setpassword(rs1.getString(1));
				//obj1.add(b.getpassword());
			}
			
		con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class Bean
{
	private  String name;
	private String password;
	private Integer token;
	public void setname( String name) {
		this.name=name;
	}
	public void setpassword(String password) {
		this.password=password;
	}
	public void settoken(Integer token) {
		this.token=token;
	}
	public String getname() {
	return name;
	}
	public String password() {
		return password;
	}
	public Integer token() {
		return token;
	}
}




