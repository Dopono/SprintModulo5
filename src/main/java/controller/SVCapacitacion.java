package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Capacitacion;

import java.io.IOException;

import dao.CapacitacionDAO;

/**
 * Servlet implementation class SVCapacitacion
 */
public class SVCapacitacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SVCapacitacion() {
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
		Capacitacion cap;
		cap = new Capacitacion(request.getParameter("nombre"), 
							 request.getParameter("detalle"));
		CapacitacionDAO.agregarCapacitacion(cap);
		RequestDispatcher vista = request.getRequestDispatcher("Success.jsp?msg=Operacion realizada con exito");
		vista.forward(request, response);
	}

}
