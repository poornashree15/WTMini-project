package meena;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class reg
 */
@WebServlet("/reg")
public class reg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public reg() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		PrintWriter writer = response.getWriter();
		String name = request.getParameter("nam");
		 String user = request.getParameter("usr");
		 String email= request.getParameter("em");
		 String psw = request.getParameter("psd");
		 String cpss = request.getParameter("cp");
    
final String JDBC_DRIVER="com.mysql.jdbc.Driver";       
 final String DB_URL="jdbc:mysql://localhost/test";  
final String USER = "root";    
  final String PASS = "";  
Connection conn=null; 
 Statement stmt=null;
try{	
 Class.forName(JDBC_DRIVER);  
   conn = DriverManager.getConnection(DB_URL,USER,PASS);      
  stmt = conn.createStatement();        
String sql,sql1;
sql = "insert into register values('"+name+"','"+user+"','"+email+"','"+psw+"','"+cpss+"')";
  stmt.executeUpdate(sql); 
stmt.close();
con.close();
catch(SQLException se){
         out.println(se);
      }catch(Exception e){
        out.println(e);
      }finally{        
         try{
            if(stmt!=null)
               stmt.close();
         }
    catch(SQLException se2)
            { 	out.println(se2);
         }
         try{
            if(conn!=null)
            conn.close();
		 String htmlRespone = "<html><form>";
	        htmlRespone += "<h2>Hi " + name + "<br/>";  
	        htmlRespone += "<h2>Your username is  " +user + "<br/>";  
	        htmlRespone += "You registered successfully in MPS Bus Service </h2>";    
	        htmlRespone += "</form></html>";
 	        writer.println(htmlRespone);
	}
	
}
