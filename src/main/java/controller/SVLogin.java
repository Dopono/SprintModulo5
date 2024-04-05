package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class SVLogin
 */
public class SVLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SVLogin() {
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
		String n = request.getParameter("username");
		String pwd = request.getParameter("password");
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html"); 
		if (n.equals("admin")&& pwd.equals("1234")) {
			HttpSession hs = request.getSession();
			hs.setAttribute("uname", n);
			RequestDispatcher rd =request.getRequestDispatcher("Inicio.jsp"); 
			rd.include(request, response);	
		}else{
			
			out.println("<font color=red size=10 face=verdana >Lo sentimos su nombre de usuario y contraseña son incorrectos, inténtelo de nuevo</font>"); 
			RequestDispatcher rd =request.getRequestDispatcher("Login.jsp"); 
			rd.include(request, response);
		}
		out.close();
	}

}
