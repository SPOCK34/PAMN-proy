
/**
*La clase futbolista hereda propiedades de la clase persona 
* @author: Josue Sanchéz 
* @author: Rodrigo Florian
* @author: Colvert Gomez
* @author: Carlos Pérez Vásquez
* @author: Eliseo Martinez Aguirre
* @version: 26/05/2016/A
**/

public class Futbolista extends Persona{
/**
	*Declaración de variables
	* Representan algunas  caracteristicas que posee un
	* futbolista
	*/
	protected String apodo,division,posicion,lesiones;
	protected int experiencia,contrato,posicionesp;
	protected float sueldo;
   
   /**
	* Implementacionde los metodos
	*/

	/**
	* Metodos set y get de cada uno de los atributos 
	*metodos necesarios para extraer la informacion devido a que 
	*dichos atributos son protected
	*/
	
	protected int GetContrato(){
		return contrato;
	}
	protected void SetContrato(int contrato){
		this.contrato=contrato;
	}
	protected float GetSueldo(){
		return sueldo;
	}
	protected void SetSueldo(float sueldo){
		this.sueldo=sueldo;
	}
	protected void SetLesiones(String lesiones){
		this.lesiones=lesiones;
	}
}