package meena;
import java.io.*;
import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/busserv")
public class busserv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public busserv() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doGet(request, response);
		int s1=40,s2=40,s3=40,s4=40,c1=400,c2=500,c3=700,c4=600,c,se,co,ci,cos,no;
		 String source = request.getParameter("from");
		 String dest = request.getParameter("to");
		 String name = request.getParameter("namep");
		 String age = request.getParameter("age");
		 String phone = request.getParameter("phone");
		 String busno = request.getParameter("busno");
		 String seat = request.getParameter("seats");
		 String book = request.getParameter("b");
		 String can = request.getParameter("ca");
                 HttpSession session=request.getSession(true);
                 session.setAttribute("book",b);
                 session.setMaxInactiveInterval(30);//30 seconds
                 response.setRedirect("welcome.html");
                 session.setAttribute("cancellation",b);
                 session.setMaxInactiveInterval(30);//30 seconds
                 response.setRedirect("welcome.html");

    
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
sql = "insert into passenger values('"+name+"','"+age+"','"+busno+"','"+phone+"','"+seat+"')";
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
		 String htmlRespone = null;
		 PrintWriter writer = response.getWriter();
		 no= Integer.parseInt(busno);
		 se=Integer.parseInt(seat);
		 if(book!=null)
		 { 
		 	 
		 if(no==12380)
		 {	s1=s1-se;
		  c=c1*se;
		 if(s1>0)
	        {	
	        htmlRespone = "<html><form>";
	        htmlRespone += "<h2>Hi " + name + "<br/>";  
	        htmlRespone += "<h2>Total cost is  " +c + "<br/>";  
	        htmlRespone += "Your "+seat+" seats have been booked successfully in busno "+ busno + "</h2>";    
	        htmlRespone += "</form></html>";
	        }
	        else
	        {
	        	 htmlRespone = "<html>";
	        htmlRespone += "<h2>Hi " + name + "<br/>";      
	        htmlRespone += "Sorry "+seat+" seats not available!!" + "</h2>";    
	        htmlRespone += "</html>";
	        }
		 c=0;
		 }
		 else if(no==45871)
		 {	s2=s2-se;
		  co=c2*se;
		 if(s2>0)
	        {	
	        htmlRespone = "<html>";
	        htmlRespone += "<h2>Hi " + name + "<br/>";      
	        htmlRespone += "<h2>Total cost is  " +co + "<br/>";  
	        htmlRespone += "Your "+seat+" seats have been booked successfully in busno "+ busno + "</h2>";  
	        htmlRespone += "</html>";
	        }
	        else
	        {
	        	 htmlRespone = "<html>";
	        htmlRespone += "<h2>Hi " + name + "<br/>";      
	        htmlRespone += "Sorry seats not available!!" + "</h2>";    
	        htmlRespone += "</html>";
	        } 
		 co=0;
		 }
		 else if(no==147521)
				{s3=s3-se;
				 ci=c2*se;
	        if(s3>0)
	        {	
	        htmlRespone = "<html>";
	        htmlRespone += "<h2>Hi " + name + "<br/>";      
	        htmlRespone += "<h2>Total cost is  " +ci + "<br/>";  
	        htmlRespone += "Your "+seat+" seats have been booked successfully in busno "+ busno + "</h2>";      
	        htmlRespone += "</html>";
	        }
	        else
	        {
	        	 htmlRespone = "<html>";
	        htmlRespone += "<h2>Hi " + name + "<br/>";      
	        htmlRespone += "Sorry seats not available!!" + "</h2>";    
	        htmlRespone += "</html>";
	        }
	        ci=0;
				 }
	        else if(no==12574)
				{s4=s4-se;
				 cos=c2*se;
	        if(s4>0)
	        {	
	        htmlRespone = "<html>";
	        htmlRespone += "<h2>Hi " + name + "<br/>"; 
	        htmlRespone += "<h2>Total cost is  " +cos + "<br/>";  
	        htmlRespone += "Your "+seat+" seats have been booked successfully in busno "+ busno + "</h2>";    
	        htmlRespone += "</html>";
	        }
	        else
	        {
	        	 htmlRespone = "<html>";
	        htmlRespone += "<h2>Hi " + name + "<br/>";      
	        htmlRespone += "Sorry seats not available!!" + "</h2>";    
	        htmlRespone += "</html>";
	        }
	        cos=0;
				 }
		 }
	 
		 else if(can!=null)
		 { if(no==12380)
		 {	s1=s1+se;
		 c=c1*se;
		  			        htmlRespone = "<html><form>";
	        htmlRespone += "<h2>Hi " + name + "<br/>";  
	        htmlRespone += "<h2>Money refunded  " +c + "<br/>";  
	        htmlRespone += "Your "+seat+" seats have been canceled successfully in busno "+ busno + "</h2>";    
	        htmlRespone += "</form></html>";
	        c=0;
		 }
		 else if(no==45871)
		 {	s2=s2+se;
		 co=c2*se;
		  			        htmlRespone = "<html><form>";
	        htmlRespone += "<h2>Hi " + name + "<br/>";  
	        htmlRespone += "<h2>Money refunded  " +co + "<br/>";  
	        htmlRespone += "Your "+seat+" seats have been canceled successfully in busno "+ busno + "</h2>";    
	        htmlRespone += "</form></html>";
	        co=0;
		 }
		 else if(no==147521)
		 {	s3=s3+se;
		 ci=c3*se;
		  			        htmlRespone = "<html><form>";
	        htmlRespone += "<h2>Hi " + name + "<br/>";  
	        htmlRespone += "<h2>Money refunded  " +ci + "<br/>";  
	        htmlRespone += "Your "+seat+" seats have been canceled successfully in busno "+ busno + "</h2>";    
	        htmlRespone += "</form></html>";
	        ci=0;
		 }
		 else if(no==12574)
		 {	s4=s4+se;
		 cos=c3*se;
		  			        htmlRespone = "<html><form>";
	        htmlRespone += "<h2>Hi " + name + "<br/>";  
	        htmlRespone += "<h2>Money refunded  " +cos + "<br/>";  
	        htmlRespone += "Your "+seat+" seats have been canceled successfully in busno "+ busno + "</h2>";    
	        htmlRespone += "</form></html>";
	        cos=0;
		 }
		 
		 }
		 	        writer.println(htmlRespone);
	        }
}
	        
	        	

		
	


