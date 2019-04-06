package controller;
import javax.servlet.*;
import javax.servlet.http.*;
import model.*;
import java.io.*;
import dao.UserDao;
public class MyController extends HttpServlet {

	public void srvice(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		String UserName=req.getParameter("Username");
		String UserPassword=req.getParameter("UserPassword");
		User user=new User();
		user.setUserName(UserName);
		user.setUserPassword(UserPassword);
		
		try {
			UserDao userDao=new UserDao();
			Boolean b=userDao.validate(user);
			if(b==true)
			{
				RequestDispatcher rd=req.getRequestDispatcher("wel");
				rd.forward(req,res);
			//res.sendRedirect("wel");
			}
	
			else
			{
				RequestDispatcher rd=req.getRequestDispatcher("err");
				rd.include(req,res);
				
				//res.sendRedirect("err");
			}
		
		}
		catch(Exception e) {
			out.println(e);
		}
			}
}
