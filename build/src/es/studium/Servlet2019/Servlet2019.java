package es.studium.Servlet2019;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet2019
 */
@WebServlet("/Servlet2019")
public class Servlet2019 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet2019() {
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
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	// Manuel Camacho Machuca
	public String nombres(String nombre, String apellidos) 
	{
	String nombreCompleto = nombre+ " " +apellidos ;
	for(int i=0; i<nombreCompleto.lenght;i++) {
		char letra=nombreCompleto.charAt(i);
		String resultado="";
		if (letra=='a'||letra=='o'||letra=='i'||letra=='e') {
			resultado+="u";
		}else {
			resultado+=letra;
		}
	}
	return resultado;
	}
}
