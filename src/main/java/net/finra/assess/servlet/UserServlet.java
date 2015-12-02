package net.finra.assess.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;

//@SuppressWarnings("serial")
public class UserServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7239710708046358567L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		UserService userService = UserServiceFactory.getUserService();
		
		String thisURL = request.getRequestURI();
		System.out.println(thisURL);
		
		response.setContentType("text/html");
		
		if(request.getUserPrincipal() != null){
			response.getWriter().println("Hello, " + 
					request.getUserPrincipal().getName() + 
					"! You can <a href=\"" +
					userService.createLogoutURL(thisURL) + 
					"\">Sign Out</a>.");
		}else{
			response.getWriter().println("Please <a href=\"" +
					userService.createLoginURL(thisURL) + 
					"\">Sign In</a>.");
		}
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("pages/home.jsp");
		
		requestDispatcher.forward(request, response);

	}
	
}
