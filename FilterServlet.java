package java.programs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FilterServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	 
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
 
		PrintWriter out = resp.getWriter();
		out.println("We are in FilterServlet");
		System.out.println("We are in FilterServlet");
 
	}

}
