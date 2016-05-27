/**
* 
* @author: Josue Sanchéz 
* @author: Rodrigo Florian
* @author: Colvert Gomez
* @author: Carlos Pérez Vásquez
* @author: Eliseo Martinez Aguirre
* @version: 26/05/2016/A
**/

import java.io.*;
import java.text.DecimalFormat;

public class JugadorPortero extends Futbolista{
	/**
	*Atributos que definen a un portero
	*dan algunas caracteristicas importantes asi como algunos datos importantes
	*/
	protected String titular;
	protected int numjugador,atencion,velocidadreaccion,agilidad,saltos,flexibilidad,presicionpase,tamanomanos,suerte;//balonesdetenidos
	protected float longitudbrazos, valoracion;
	//protected double valoracion;
	
	/**
	* Metodo constructor
	* Metodo constructor sobrecargando  todos los atributos 
	*/
	protected JugadorPortero(){
	}

	protected void JugadorPortero(String[] datos){
		nombre=datos[0];
		apodo=datos[1];
		edad=Integer.parseInt(datos[2]);
		genero=datos[3];
		edocivil=datos[4];
		nacionalidad=datos[5];
		peso=Float.parseFloat(datos[6]);
		altura=Float.parseFloat(datos[7]);
		division=datos[8];
		titular=datos[9];
		experiencia=Integer.parseInt(datos[10]);
		contrato=Integer.parseInt(datos[11]);
		sueldo=Float.parseFloat(datos[12]);
		numjugador=Integer.parseInt(datos[13]);
		posicion=datos[14];
		lesiones=datos[15];
		atencion=Integer.parseInt(datos[16]);
		velocidadreaccion=Integer.parseInt(datos[17]);
		agilidad=Integer.parseInt(datos[18]);
		flexibilidad=Integer.parseInt(datos[19]);
		presicionpase=Integer.parseInt(datos[20]);
		longitudbrazos=Float.parseFloat(datos[21]);
		tamanomanos=Integer.parseInt(datos[22]);
		suerte=Integer.parseInt(datos[23]);
	}
	/**metodos: 
	*penal, saque de meta
	*/ 


	/** metodo que muestra  la accion  de saque de meta mostrando un mensaje en en consola
	*/
	protected void SaqueMeta(){
		System.out.println("El portero "+nombre+" hace saque  de meta");
	}
   /**
   *Método  que muestra un mensaje de la accion de un penal
   */
	protected void Penal(){
		System.out.println("El portero "+nombre+"se prepara para un penal y da "+saltos+" saltos");
	}
   
   /**
   *metodo que muestra la valoracion haciendo un promedio  de los valores de sus atributos
   */
	protected void ValoracionJugador(){
		valoracion=(atencion+velocidadreaccion+agilidad+saltos+flexibilidad+presicionpase+suerte)/7;
	}
   /**
	*Este metodo muestra  todos los atributos que un jugador portero puede tener
	*y ejemplifica el uso de la herencia entre clases 
	*/
	protected void MuestraEstadisticas(){
		ValoracionJugador();
		System.out.println("\nNombre: "+nombre+"\tApodo: "+apodo+"\nEdad: "+edad+"\tGenero: "+genero+
				"\tEstado civil: "+edocivil+"\tNacionalidad: "+nacionalidad+"\nPeso: "+peso+
				"\tAltura: "+altura+"\nDivision: "+division+"\tTitular: "+titular+"\nExperiencia: "+experiencia+" años\tContrato: "
				+contrato+"años\tSueldo: "+sueldo+"\nNumero de jugador: "+numjugador+"\tPosicion: "+posicion+"\tLesiones: "+lesiones+
				"\nAtencion: "+atencion+"\tVelocidad de reaccion: "+velocidadreaccion+"\tAgilidad: "+agilidad+
				"\nFlexibilidad: "+flexibilidad+"\tPresicion de pase: "+presicionpase+"\tLongitud de los brazos: "+longitudbrazos+
				"\nTamaño de las manos: "+tamanomanos+"\tSuerte: "+suerte+"\nValoracion del Jugador: "+valoracion+"\n");
	}
}
