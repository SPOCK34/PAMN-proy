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
	public JugadorPortero(String tama�omanos, String saltos, String suerte, byte balonesdetenidos){

		this.tama�omanos=tama�omanos;
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
