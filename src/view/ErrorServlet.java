package view;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ErrorServlet extends HttpServlet{
public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
{
	res.setContentType("text/html");
	PrintWriter out=res.getWriter();
	out.println("<h1>Check your id and password</h1>");
}
}
