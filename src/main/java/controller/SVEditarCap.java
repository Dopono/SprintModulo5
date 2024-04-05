package controller;

import java.io.IOException;

import dao.CapacitacionDAO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Capacitacion;

/**
 * Servlet implementation class SVEditarCap
 */
public class SVEditarCap extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SVEditarCap() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
        String nombre = request.getParameter("nombre");
        String detalle = request.getParameter("detalle");
       

        Capacitacion cap = new Capacitacion(id,nombre, detalle);
        CapacitacionDAO.modificarCap(cap);
        RequestDispatcher vista = request.getRequestDispatcher("Success.jsp?msg=Se ha modificado el registro");
		vista.forward(request, response);
        
	}

}
