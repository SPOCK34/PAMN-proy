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
	protected String titular,posicion,jugadormarcado;
	protected int numjugador,resistencia,rapidez,defensa,ataque,precisionpase,precisiontiro,fuerzatiro;
	protected float valoracion;
	protected boolean marcado,marcando;
	
	/**
	* Constructor
	* Este consttructor sobrecarga los objetos creados de la clase jugadorCampo
	* definiendo las caracteristicas (atributos de la clase) a traves del parametro que recibe que es un arreglo de string
   *el parametro datos  que recibe el constructor contien la informacion que se ira asignando a cada atributo
	*/
	protected JugadorCampo(){
	}
	

	protected void JugadorCampo(String[] datos){
		nombre=datos[0];
		apodo=datos[1];
		edad=Integer.parseInt(datos[2]);
		genero=datos[3];
		edocivil=datos[4];
		nacionalidad=datos[5];
		peso=Float.parseFloat(datos[6]);
		altura=Float.parseFloat(datos[7]);
		division=datos[8];
		titular=datos[9];
		experiencia=Integer.parseInt(datos[10]);
		contrato=Integer.parseInt(datos[11]);
		sueldo=Float.parseFloat(datos[12]);
		numjugador=Integer.parseInt(datos[13]);
		posicion=datos[14];
		posicionesp=Integer.parseInt(datos[15]);
		lesiones=datos[16];
		resistencia=Integer.parseInt(datos[17]);
		rapidez=Integer.parseInt(datos[18]);
		defensa=Integer.parseInt(datos[19]);
		precisionpase=Integer.parseInt(datos[20]);
		precisiontiro=Integer.parseInt(datos[21]);
		fuerzatiro=Integer.parseInt(datos[22]);
		marcado=false;
		marcando=false;
	}
    
   /**
	* Implementacionde los metodos
	*/
	
	protected void MuestraEstadisticas(){
		ValoracionJugador();
		System.out.println("\nNombre: "+nombre+"\tApodo: "+apodo+"\nEdad: "+edad+"\tGenero: "+genero+
				"\tEstado civil: "+edocivil+"\tNacionalidad: "+nacionalidad+"\nPeso: "+peso+
				"\tAltura: "+altura+"\nDivision: "+division+"\tTitular: "+titular+"\nExperiencia: "+experiencia+" años\tContrato: "
				+contrato+"años\tSueldo: "+sueldo+"\nNumero de jugador: "+numjugador+"\tPosicion: "+posicion+"\tPosicion especifica: "+posicionesp+"\tLesiones: "+lesiones+
				"\nResistencia: "+resistencia+"\tRapidez: "+rapidez+"\tDefensa: "+defensa+"\nPrecision en el pase: "+precisionpase+
				"\tPrecision en el tiro: "+precisiontiro+"\tFuerza en el tiro: "+fuerzatiro+"\nValoracion del Jugador: "+valoracion+"\n");
				
	}
   /**
	* ESte  método define la posicion de los jugadores y sus acciones respectivas
	* @param posicion define el numero de posicion del jugador
	*/
	protected void MetodoPorPosicion(){
		int opc;
		Menu menu=new Menu();
		if(posicionesp>-1 && posicionesp<4){
			do{
				opc=menu.ListaMenu("Las opciones son:\n1)Marcar.\n2)Saque de banda.\n3)Saque de Esquina.\n4)Penal.n5)Salir.\nOpcion:",5);
				switch(opc){
				case 1:
					Marcar(Teclado.LeeCadena("Jugador a marcar: "));
					break;
				case 2:
					SaqueBanda();
					break;
				case 3:
					SaqueEsquina();
					break;
				case 4:
					Penal();
					break;
				}
			}while(opc!=5);
		}
		if(posicionesp>3 && posicionesp<9){
			do{
				opc=menu.ListaMenu("Las opciones son:\n1)Marcar.\n2)Saque de banda.\n3)Saque de Esquina.\n4)Tiro libre.\n5)Tirar.\n6)Fuera de lugar.\n7)Penal.\n8)Salir.\nOpcion:",8);
				switch(opc){
				case 1:
					Marcar(Teclado.LeeCadena("Jugador a marcar: "));
					break;
				case 2:
					SaqueBanda();
					break;
				case 3:
					SaqueEsquina();
					break;
				case 4:
					TiroLibre();
					break;
				case 5:
					Tirar();
					break;
				case 6:
					FueraLugar();
					break;
				case 7:
					Penal();
					break;
				}
			}while(opc!=8);
		}
		if(posicionesp==10){
			do{	
				opc=menu.ListaMenu("Las opciones son:\n1)Saque de banda.\n2)Saque de Esquina.\n3)Tiro libre.\n4)Tirar.\n5)Fuera de lugar.\n6)Penal.\n7)Salir.\nOpcion:",7);
				switch(opc){
				case 1:
					SaqueBanda();
					break;
				case 2:
					SaqueEsquina();
					break;
				case 3:
					TiroLibre();
					break;
				case 4:
					Tirar();
					break;
				case 5:
					FueraLugar();
					break;
				case 6:
					Penal();
					break;
				}
			}while(opc!=7);
		}
	}
   /**
	* ESte  método define la accion de marcar  
	* @param quien define al jugador que marcara y a quien define al jugador aquien se marcara
	*/
	protected void Marcar(String jugadormarcado){
		this.jugadormarcado=jugadormarcado;
		marcando=true;
	}
	protected void SaqueBanda(){
		System.out.println("El jugador "+nombre+" realiza un saque de banda");
	}
	protected void SaqueEsquina(){
		System.out.println("El jugador "+nombre+" realiza un saque de esquina");
	}
	protected void TiroLibre(){
		System.out.println("El jugador "+nombre+" realiza un tiro libre pero se va al infinitooo");
	}
	protected void Tirar(){
		System.out.println("El jugador "+nombre+" recibe un pase, tira y...");
	}
	protected void FueraLugar(){
		System.out.println("El jugador "+nombre+" metio la pelota en la cancha pero al parecer fue fuera de lugar");
	}
	protected void Penal(){
		System.out.println("El jugador "+nombre+" se prepara para un penal tira y...");
	}
	protected void ValoracionJugador(){
		valoracion=(resistencia+rapidez+defensa+precisionpase+precisiontiro+fuerzatiro)/6;
	}
}
