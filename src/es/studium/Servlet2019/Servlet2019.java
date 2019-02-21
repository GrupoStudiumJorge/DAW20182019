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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		// doGet(request, response);
		
	}
	
	public int sumaFecha(String fecha)
	{
		String[] nums = fecha.split("/");
		int dia = Integer.parseInt(nums[0]);
		int mes = Integer.parseInt(nums[1]);
		int anio = Integer.parseInt(nums[2]);
		
		return (dia + mes + anio);
	}	

<<<<<<< HEAD
	public String cambiarNombre(String cadena)
	{
		if(cadena != "")
		{
			cadena = "El Pera";
		}
		return cadena;
=======
	public int sacarVocales (String cadena)
	{
		 String vocales="aeiou";
		 int resultadoContador = 0;
        int contadorLetras[]={0,0,0,0,0};
 
        // recorremos la cadena recibida letra a letra
        for(int i=0;i<cadena.length();i++)
        {
            // recorremos las vocales para comparar con cada una de las letras
            for(int j=0;j<vocales.length();j++)
            {
                if(cadena.charAt(i)==vocales.charAt(j))
                {
                    // aumentamos el contador para la vocal encontrada
                	contadorLetras[j]++;
                }
            }
        }
		
        for(int a=0;a<vocales.length();a++)
        {
        	resultadoContador += contadorLetras[a];
        }
		return resultadoContador;
>>>>>>> 5681e099d76e9bf37477c7ed249bed8bbbe10612
	}
}
