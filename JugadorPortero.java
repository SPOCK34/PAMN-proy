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
	public JugadorPortero(String tamañomanos, String saltos, String suerte, byte balonesdetenidos){

		this.tamañomanos=tamañomanos;
		this.saltos=saltos;
		this.suerte=suerte;
		this.balonesdetenidos= balonesdetenidos;
		
	}
	//clases: penal, saque de meta, 
	protected void SaqueMeta(String nombre){
		this.nombre= nombre

		
	}
	protected void Penal(){
		
	}
	protected void MuestraEstadisticas(){
		
	}
}
