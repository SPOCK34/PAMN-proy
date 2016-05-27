/**
* 
* @author: Josue Sanchéz 
* @author: Rodrigo Florian
* @author: Colvert Gomez
* @author: Carlos Pérez Vásquez
* @author: Eliseo Martinez Aguirre
* @version: 26/05/2016/A
**/
public class JugadorPortero extends Futbolista{
	/**
	*Atributos que definen a un portero
	*dan algunas caracteristicas importantes asi como algunos datos importantes
	*/
	protected String tamañomanos,saltos,suerte;
	protected byte balonesdetenidos;
	
	/**
	* Metodo constructor
	*Metodo constructor sobrecargando  todos los atributos 
	*/
	protected JugadorPortero(String tamañomanos, String saltos, String suerte, byte balonesdetenidos, String nombre){

		this.tamañomanos=tamañomanos;
		this.saltos=saltos;
		this.suerte=suerte;
		this.balonesdetenidos= balonesdetenidos;
		this.nombre= nombre;
		
	}
	/**metodos: 
	*penal, saque de meta
	*/ 

	/** metodo que muestra  la accion  de saque de meta
	*/
	protected void SaqueMeta(){
		
		System.out.println("El portero "+nombre+" hace saque  de meta");


	}
	/**
	*Metodo  Penal
	*Muestra un mensaje donde el portero  se prepara para la accion
	*/
	protected void Penal(){

		System.out.println("El portero "+nombre+"se prepara para un penal y da "+saltos+" saltos");
		
	}

	/**
	*Este metodo muestra  todos los atributos que un jugador portero puede tener
	*y ejemplifica el uso de la herencia entre clases 
	*/
	protected void MuestraEstadisticas(){

		System.out.println("Datos del Portero: ");
		System.out.println("Nombre: "+nombre+"\nGenero: "+genero+"\nEstado civil: "+edocivil+"\nEdad: "+edad+"\nPeso: "+peso+"\nAltura: "+altura+"\nNacionalidad: "+nacionalidad);
		System.out.println("\nApodo: "+apodo+"\nDivisión:"+division+"\nPosición: "+posicion+"\nLesiones: "+lesiones+"\nExperiencia: "+experiencia);
		System.out.println("\nContrato"+contrato+"\nPosiciones que ocupa: "+posicionesp+"\nSueldo: "+sueldo);
		System.out.println("\nTitularidad: "+titularidad);
	}

}
