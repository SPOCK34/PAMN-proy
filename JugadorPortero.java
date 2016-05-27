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
	//Atributos
	protected String tamañomanos,saltos,suerte;
	protected byte balonesdetenidos;
	
	//Costructor
	public JugadorPortero(String tamañomanos, String saltos, String suerte, byte balonesdetenidos, String nombre){

		this.tamañomanos=tamañomanos;
		this.saltos=saltos;
		this.suerte=suerte;
		this.balonesdetenidos= balonesdetenidos;
		this.nombre= nombre;
		
	}
	//clases: penal, saque de meta, 
	public void SaqueMeta(){
		
		System.out.println("El portero "+nombre+" hace saque  de meta");


	}
	public void Penal(){
		
	}
	public void MuestraEstadisticas(){
		
	}

}
