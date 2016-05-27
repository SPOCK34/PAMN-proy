/**
*La clase preba banca  muestra la informacion de cada uno de los usuarios de la banca 
* haciendo uso de un menu
*
* @author: Josue Sanchéz 
* @author: Rodrigo Florian
* @author: Colvert Gomez
* @author: Carlos Pérez Vásquez
* @author: Eliseo Martinez Aguirre
* @version: 26/05/2016/A
**/
public class PruebaBanca {
/**
*clase que contien un metodo main 
*/
	public static void main(String args[]){
   /**
   *Declaracion de los atributos
   *
   * i  es un contador, op y opc  son auxiliares  que se maejara el los switch case
   */
		long ti,tf,t;
		int i,opc,opcion;
		Menu menu = new Menu();
		ti=System.currentTimeMillis();
		System.out.println("**********************************************");
	    System.out.println("Bienvenido al Sistema de Emulacion de un Club de Futbol");
            /**
            *se crean objetos de  las otras clases para el uso de sus metodos  asi como la 
            *obtencion de sus atributos
            */
		JugadorPortero portero=new JugadorPortero();
		portero.JugadorPortero(InformacionPortero());
		JugadorCampo[] jugador=new JugadorCampo[4];
      /**
      *Se utilizan ciclos para crear alos jugadores
      */
		for(i=0;i<4;i++){
			jugador[i]=new JugadorCampo();
			jugador[i].JugadorCampo(InformacionJugador(i));
		}
      /**
      *Se implementa  un menu 
      */
		do{
			opcion = menu.ListaMenu("Las opciones son:\n1)Imprimir informacion de la alineacion completa.\n2)Imprimir informacion de jugador.\n3)Salir.\nOpcion:",3);
			switch(opcion){
			case 1:
				for(i=0;i<4;i++){
					System.out.println();
					jugador[i].MuestraEstadisticas();
					System.out.println();
				}
				portero.MuestraEstadisticas();
				System.out.println();
				break;
			case 2:
				i=Menu.ListaMenu("Introduce la posicion del jugador: ", 10);
				if(i<=9)
					jugador[i].MuestraEstadisticas();
				else
					portero.MuestraEstadisticas();
				break;
			}
		}while(opcion!=3);
	}
   
/**
*metodo que  guarda la informacion del protero en un arreglo y  lo retorna
*/
	public static String[] InformacionPortero(){
		String[] datos=new String[24];
		datos[0]="Rodrigo Florian Guzman";	datos[1]="Barrio";
		datos[2]="21";	datos[3]="Masculino";
		datos[4]="Soltero";	datos[5]="Mexicana";
		datos[6]="67.5";	datos[7]="1.78";
		datos[8]="Segunda";	datos[9]="No";
		datos[10]="1";	datos[11]="1";
		datos[12]="100000.50";	datos[13]="100";
		datos[14]="Portero";	datos[15]="Ninguna";
		datos[16]="7";	datos[17]="8";
		datos[18]="4";	datos[19]="4";
		datos[20]="6";	datos[21]="1.05";
		datos[22]="15";	datos[23]="8";
		return datos;
	}
  /**
  *Metodo que guarda la informacion de los jugadores
  */
	
	public static String[] InformacionJugador(int i){
		String[] datos=new String[23];
		if(i==0){
			datos[0]="Josue Eduardo Sanchez Trejo";	datos[1]="Vato Loco";
			datos[2]="20";	datos[3]="Masculino";
			datos[4]="Soltero";	datos[5]="Mexicana";
			datos[6]="68.5";	datos[7]="1.75";
			datos[8]="Segunda";	datos[9]="No";
			datos[10]="3";	datos[11]="2";
			datos[12]="100560.15";	datos[13]="10";
			datos[14]="Medio";	datos[15]="7";
			datos[16]="Dislocacion del coxis";	datos[17]="8";
			datos[18]="9";	datos[19]="7";
			datos[20]="7";	datos[21]="6";
			datos[22]="7";
		}
		if(i==1){
			datos[0]="Carlos Perez Vazquez";	datos[1]="El hijo del papa";
			datos[2]="25";	datos[3]="Masculino";
			datos[4]="Soltero";	datos[5]="Mexicana";
			datos[6]="70";	datos[7]="1.68";
			datos[8]="Segunda";	datos[9]="No";
			datos[10]="3";	datos[11]="4";
			datos[12]="110234.78";	datos[13]="11";
			datos[14]="Defensa";	datos[15]="1";
			datos[16]="Ninguna";	datos[17]="8";
			datos[18]="7";	datos[19]="9";
			datos[20]="8";	datos[21]="8";
			datos[22]="7";
		}
		if(i==2){
			datos[0]="Eliseo Martinez Aguirre";	datos[1]="Sin informacion";
			datos[2]="20";	datos[3]="Masculino";
			datos[4]="Soltero";	datos[5]="Mexicano";
			datos[6]="64.5";	datos[7]="1.73";
			datos[8]="Segunda";	datos[9]="No";
			datos[10]="3";	datos[11]="1";
			datos[12]="150460.30";	datos[13]="12";
			datos[14]="Medio";	datos[15]="8";
			datos[16]="Ninguna";	datos[17]="9";
			datos[18]="7";	datos[19]="8";
			datos[20]="9";	datos[21]="9";
			datos[22]="9";
		}
		if(i==3){
			datos[0]="Colvert Gomez Rubio";	datos[1]="Ferras";
			datos[2]="20";	datos[3]="Masculino";
			datos[4]="Soltero";	datos[5]="Mexicano";
			datos[6]="66";	datos[7]="1.76";
			datos[8]="Segunda";	datos[9]="No";
			datos[10]="2";	datos[11]="1";
			datos[12]="150899.72";	datos[13]="13";
			datos[14]="Delantero";	datos[15]="10";
			datos[16]="Ninguna";	datos[17]="8";
			datos[18]="9";	datos[19]="9";
			datos[20]="8";	datos[21]="9";
			datos[22]="10";
		}
		return datos;
	}
}	
