package com.addservice.add;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/add")
public class add extends HttpServlet {
	public void doPost (HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException 
	{
		PrintWriter out  = res.getWriter();
		int no1 = Integer.parseInt(req.getParameter("no1"));
		int no2 = Integer.parseInt(req.getParameter("no2"));
		
		int tot = no1 +no2;
		
		out.println("your total is " + tot );
	}
}