package org.studyeasy.servlets;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class SiteController
 */
@WebServlet("/SiteController")
public class SiteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public SiteController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		switch(action) {
		case "login":
			request.getRequestDispatcher("login.jsp").forward(request, response);
			break;
			default:
				break;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action=request.getParameter("action");
		switch(action) {
		case "loginSubmit":
			authenticate(request, response);
			break;
			default:
				break;
		}
	
	}
	
	public void authenticate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName=request.getParameter("userName");
		String password=request.getParameter("password");
		if(userName.equals("studyeasy")&&password.equals("love")) {
			request.getSession().invalidate();
			HttpSession session = request.getSession(true);
			session.setMaxInactiveInterval(300);
			/*Cookie cUsername= new Cookie("username",userName); 
			response.addCookie(cUsername);*/
			session.setAttribute("username", userName);
			String encode=response.encodeURL(request.getContextPath());
			response.sendRedirect(encode+"/MemberAreaController?action=memberArea");
		}else {
			response.sendRedirect(request.getContextPath()+"/SiteController?action=login");
		}
	}

}
