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
	public JugadorPortero(String tama�omanos, String saltos, String suerte, byte balonesdetenidos, String nombre){

		this.tama�omanos=tama�omanos;
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
