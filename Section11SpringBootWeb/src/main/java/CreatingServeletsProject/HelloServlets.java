package CreatingServeletsProject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlets extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		System.out.println("In Service");	
		
		PrintWriter out=res.getWriter();
		
		out.println("Hello World");
	}
	

}
