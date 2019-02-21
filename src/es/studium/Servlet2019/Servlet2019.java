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

	private String cadena;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet2019() {
        super();
        // TODO Auto-generated constructor stub
    }


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
	
	//Victor Roibas Diaz
	public String mayusculas(String cadena)
	{
		String salida = null;
		salida = cadena.toUpperCase();
		return (salida);
	}

}


		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
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

	//Luciano
	public static String CambiarVocalesi(String cadena) {

		char[] cadenaCharArray= cadena.toCharArray();
		System.out.println("Antes : " + cadena);
		for(int i = 0 ; i < cadena.length() ; i++) {
			if(Character.toString(cadenaCharArray[i]).matches("[aeiou]")) {
				// cadenaCharArray[i] = Character.toUpperCase(cadenaCharArray[i]);
				cadenaCharArray[i] = 'i';
			}
		}
		cadena = String.valueOf(cadenaCharArray);
		return "Despues : " + cadena;
	}


	// doGet(request, response);

	public String cambioSexo(String sexo) {
		if(sexo.equals("hombre")) {
			sexo = "mujer";
		}else {
			sexo = "hombre";			
		}
		return sexo;
		
	}

	public int sumaFecha(String fecha)
	{
		String[] nums = fecha.split("/");
		int dia = Integer.parseInt(nums[0]);
		int mes = Integer.parseInt(nums[1]);
		int anio = Integer.parseInt(nums[2]);

		return (dia + mes + anio);
	}	



	public String cambiarNombre(String cadena)
	{
		if(cadena != "")
		{
			cadena = "El Pera";
		}
		return cadena;
	}

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

	}

public static String mayusculaOminuscula (String cadena ){
    
	if (cadena == null || cadena.isEmpty()) {
        return cadena;
    } else {       
        return  cadena.toUpperCase().charAt(0) + cadena.substring(1, cadena.length()).toLowerCase();
    }
}

	public String mostrarFechaActual() {

		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		return dateFormat.format(new Date());
	}
}

