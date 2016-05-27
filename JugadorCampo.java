
/**
 * Esta clase define objetos que representan a un jugador de campo en general que hereda caracteristicas de la clase futbolista
 * @author: Josue Sanchéz 
 * @author: Rodrigo Florian
 * @author: Colvert Gomez
 * @author: Carlos Pérez Vásquez
 * @author: Eliseo Martinez Aguirre
 * @version: 26/05/2016/A
 */

public class JugadorCampo extends Futbolista{
	
	/**
	*Atributos globales de la clase
	*definen las principales caracteristicas con las que cuenta un jugador de campo
	*/
	protected String posicion;
	protected byte numjugador;
	protected int resistencia,rapidez,defensa,ataque,presicionpase,presiciontiro;
	protected boolean marcado,marcando;
	
	
	/**
	* Constructor
	* Este consttructor sobrecarga los objetos creados de la clase jugadorCampo
	* definiendo las caracteristicas (atributos de la clase)
	*/
	protected JugadorCampo(){
		PruebaAlineacion.MensajeNacionalidad();
		System.out.println("Acompleta con los datos del futbolista");
		nombre=Teclado.LeeCadena("Nombre: ");
		apodo=Teclado.LeeCadena("Cadena: ");
		do{
			nacionalidad=Menu.ListaMenu("Nacionalidad (1 para mexicano, 2 para extranjero): ",2);
		}while(PruebaAlineacion.ValidaNacionalidad(nacionalidad));
		genero=Teclado.LeeCadena("Genero (Masculino ó Femenino): ");
		edocivil=Teclado.LeeCadena("Estado civil: ");
		edad=Teclado.LeeByte("Edad: ");
		peso=Teclado.LeeFloat("Peso (Kg): ");
		altura=Teclado.LeeFloat("Altura (Metros)");
		experiencia=Teclado.LeeByte("Experiencia (Años): ");
		contrato=Teclado.LeeByte("Duracion del contrato (Meses): ");
		sueldo=Teclado.LeeFloat("Sueldo: ");
		numjugador=Teclado.LeeByte("Numero de jugador: ");
		do{
			posicionesp=Menu.ListaMenu("Posicion: ",10);
		}while(PruebaAlineacion.ValidaPosicion(posicionesp));
		System.out.println("Introduce en una escala del 1 al 10 el nivel de cada habilidad: ");
		resistencia=Menu.ListaMenu("Resistencia: ",10);
		rapidez=Menu.ListaMenu("Rapidez: ",10);
		defensa=Menu.ListaMenu("Defensa: ",10);
		presicionpase=Menu.ListaMenu("Presicion de pase: ",10);
		presiciontiro=Menu.ListaMenu("Presicion de tiro: ",10);
	}
	
	/**
	* ESte  método define la posicion de los jugadores y sus acciones respectivas
	* @param posicion define el numero de posicion del jugador
	*/

	protected void MetodoPorPosicion(int posicion){
		if(posicion>0 && posicion<5){
			
		}
		if(posicion>4 && posicion<7){
			
		}
		if(posicion>6 && posicion<10){
			
		}
		if(posicion==10){
			
		}
	}
	/**
	* ESte  método define la accion de marcar  
	* @param quien define al jugador que marcara y a quien define al jugador aquien se marcara
	*/
	protected void Marcar(String Quien,String AQuien){
		
	}
	protected void Marcado(){
		
	}
	protected void EdoMarcacion(){
		
	}
	protected void SaqueBanda(){
		
	}
	protected void SaqueEsquina(){
		
	}
	protected void TiroLibre(){
		
	}
	protected void FueraLugar(){
		
	}
	protected void Penal(){
		
	}
	protected void MuestraEstadisticas(){
		
	}
}
