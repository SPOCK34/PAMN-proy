
/**
* L clase persona define los objetos que se  crearan de lla  con caracteristica s que toda persona  posee
* como por ejemplo  acciones que hacemos  y caracteristicas que  la definen.
*  @author: Josue Sanchéz 
* @author: Rodrigo Florian
* @author: Colvert Gomez
* @author: Carlos Pérez Vásquez
* @author: Eliseo Martinez Aguirre
* @version: 26/05/2016/A
**/
public class Persona {
    /**
	*Atributos que definen a una persona se 
	*dan algunas caracteristicas importantes asi como algunos datos importantes
	*/
	protected String nombre,genero,edocivil,nacionalidad;
	protected int edad;
	protected float peso,altura;
	
   /**
   *metodo que muestra  en pantalla un ejemplo del hecho de crecer 
   *recibe como parametro la edad que  pronto la persona tendra 
   */
	protected void Crecer(int edad){
		edad++;
		System.out.println("Pronto tendras "+edad+" años de edad");
	}
   
   /**
   *metodo que imprime un mensaje ell cual ejemplifica la funcion de graduarse
   */
	protected void Graduarse(){
		System.out.println("On ta mi pinshi titulo pa irme");
	}
	protected void Trabajar(){
		System.out.println("Ya nomas me faltan 2 horas, para que me falten 4 horas para salir");
	}
	protected void Morir(){
		System.out.println("Epitafio: No se entristezcan por mi me encantaba dormir");
	}
}