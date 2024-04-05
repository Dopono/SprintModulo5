package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Capacitacion;
import model.Usuario;

import java.io.IOException;

import dao.CapacitacionDAO;
import dao.UsuarioDAO;

/**
 * Servlet implementation class SVUsuario
 */
public class SVUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SVUsuario() {
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
		Usuario user;
		user = new Usuario(request.getParameter("nombre"), 
							 request.getParameter("tipo"));
		UsuarioDAO.agregarUsuario(user);
		RequestDispatcher vista = request.getRequestDispatcher("Success.jsp?msg=Operacion realizada con exito");
		vista.forward(request, response);
	}

}
