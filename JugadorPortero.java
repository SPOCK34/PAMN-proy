/**
* 
* @author: Josue Sanch�z 
* @author: Rodrigo Florian
* @author: Colvert Gomez
* @author: Carlos P�rez V�squez
* @author: Eliseo Martinez Aguirre
* @version: 26/05/2016/A
**/
public class JugadorPortero extends Futbolista{
	//Atributos
	protected String tama�omanos,saltos,suerte;
	protected byte balonesdetenidos;
	
	//Costructor
	protected JugadorPortero(String tama�omanos, String saltos, String suerte, byte balonesdetenidos, String nombre){

		this.tama�omanos=tama�omanos;
		this.saltos=saltos;
		this.suerte=suerte;
		this.balonesdetenidos= balonesdetenidos;
		this.nombre= nombre;
		
	}
	//metodos: penal, saque de meta, 
	protected void SaqueMeta(){
		
		System.out.println("El portero "+nombre+" hace saque  de meta");


	}
	protected void Penal(){

		System.out.println("El portero "+nombre+"se prepara para un penal y da "+saltos+" saltos");
		
	}
	protected void MuestraEstadisticas(){

		System.out.println("Datos del Portero: ");
		System.out.println("Nombre: "+nombre+"\nGenero: "+genero+"\nEstado civil: "+edocivil+"\nEdad: "+edad+"\nPeso: "+peso+"\nAltura: "+altura+"\nNacionalidad: "+nacionalidad);
		System.out.println("\nApodo: "+apodo+"\nDivisi�n:"+division+"\nPosici�n:");

	}

}
