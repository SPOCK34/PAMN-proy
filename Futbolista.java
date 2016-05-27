
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
	*
	*
	*
	*/
	protected String apodo,division,posicion,lesiones;
	protected byte experiencia,contrato;
	protected int posicionesp;
	protected float sueldo;
	protected boolean titularidad;
	
	protected float GetSueldo(){
		return sueldo;
	}
	protected void SetSueldo(float sueldo){
		this.sueldo=sueldo;
	}
}