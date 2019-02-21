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
	
	// Felix del Rio
	public static String contarLetrasSinVocales(String cadena) {
		String salida = null;
		char[] cadenaCharArray = cadena.toCharArray();
		int cont = 0;
		for(int i = 0 ; i < cadena.length() ; i++) {
			if(Character.toString(cadenaCharArray[i]).matches("[bcdfghjklmn�pqrstvwxyzBCDFGHJKLMN�PQRSTVWXYZ]")) {
				// cadenaCharArray[i] = Character.toUpperCase(cadenaCharArray[i]);
				cont ++;
			}
		}
		salida = "La cadena : '" + cadena + "' El nombre sin contar las vocales tiene : " + cont + " letras.";
		return (salida);
	}
	
}
