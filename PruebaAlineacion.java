
/**
* @author: Josue Sanchéz 
* @author: Rodrigo Florian
* @author: Colvert Gomez
* @author: Carlos Pérez Vásquez
* @author: Eliseo Martinez Aguirre
* @version: 26/05/2016/A
**/

public class PruebaAlineacion {

/**
*Esta clase contien el metodo prisipal donde se  haran varias pruebas
*se desplegara un menu  donde  se podra ver la iformacion
*de la alineacion completa y  acciones   de persona 
*/
	public static void main(String args[]){
   /**
   *Atributos i  es un contador, op y opc  son auxiliares  que se maejara el los switch case
   */
		long ti,tf,t;
		int i,opc,opcion;
		Menu menu = new Menu();
		ti=System.currentTimeMillis();
		System.out.println("**********************************************");
	    System.out.println("Bienvenido al Sistema de Emulacion de un Club de Futbol");
		System.out.println("La alineacion a respetar sera 1-4-2-3-1 es decir:"
				+ "\n4 jugadores en la defensa"
				+ "\n\tPosicion 0: defensa lateral-izquierdo\tPosicion 1: defensa central-izquierdo\tPosicion 2: defensa central-derecho\tPosicion 4: defensa lateral-derecho"
				+ "\n2 jugadores medio centros "
				+ "\n\tPosicion 4: medio centro izquierdo\tPosicion 5: medio centro derecho"
				+ "\n3 jugadores medio ofensivos"
				+ "\n\tPosicion 6: medio ofensivo izquierdo\tPosicion 7: medio ofensivo central\tPosicion 8: medio ofensivo derecho"
				+ "\n1 jugador delantero"
				+ "\n\tPosicion 9: Delantero"
				+ "\n1 portero"
				+ "\n\tPosicion 10: Portero");
            /**
            *se crean objetos de  las otras clases para el uso de sus metodos  asi como la 
            *obtencion de sus atributos
            */
		JugadorPortero portero=new JugadorPortero();
		portero.JugadorPortero(InformacionPortero());
		JugadorCampo[] jugador=new JugadorCampo[10];
		for(i=0;i<10;i++){
			jugador[i]=new JugadorCampo();
			jugador[i].JugadorCampo(InformacionJugador(i));
		}
		do{
      /**
      *Se crea un menu para que se pueda elejir  la informacion que se desea conocer
      */
			opcion = menu.ListaMenu("Las opciones son:\n1)Imprimir informacion de la alineacion completa.\n2)Imprimir informacion de jugador.\n3)Acciones de persona.\n4)Acciones de futbolista.\n5)Acciones de jugador.\n6)Salir.\nOpcion:",6);
			switch(opcion){
			case 1:
				for(i=0;i<10;i++){
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
			case 3:
				i=Menu.ListaMenu("Introduce la posicion del jugador: ", 10);
				if(i<=9){
					do{
						opc=Menu.ListaMenu("Las opciones son:\n1)Crecer.\n2)Graduarse.\n3)Casarse.\n4)Morir.n5)Salir.\nOpcion:",5);
						switch(opc){
						case 1:
							jugador[i].Crecer(jugador[i].edad);
							break;
						case 2:
							jugador[i].Graduarse();
							break;
						case 3:
							jugador[i].Trabajar();
							break;
						case 4:
							jugador[i].Morir();
							break;
						}
					}while(opc!=5);
				}
				else{
					do{
						opc=Menu.ListaMenu("Las opciones son:\n1)Crecer.\n2)Graduarse.\n3)Trabajar\n4)Morir.n5)Salir.\nOpcion:",5);
						switch(opc){
						case 1:
							portero.Crecer(portero.edad);
							break;
						case 2:
							portero.Graduarse();
							break;
						case 3:
							portero.Trabajar();
							break;
						case 4:
							portero.Morir();
						}
					}while(opc!=5);
				}
				break;
			case 4:
				i=Menu.ListaMenu("Introduce la posicion del jugador: ", 10);
				if(i<=9){
					do{
						opc=Menu.ListaMenu("Las opciones son:\n1)Modificar años de contrato.\n2)Modificar sueldo.\n3)Modificar lesiones.\n4)Salir.\nOpcion:",4);
						switch(opc){
						case 1:
							jugador[i].SetContrato(Teclado.LeeEntero("Años de contrato: "));
							break;
						case 2:
							jugador[i].SetSueldo(Teclado.LeeFloat("Sueldo: "));
							break;
						case 3:
							jugador[i].SetLesiones(Teclado.LeeCadena("Lesiones: "));
							break;
						case 4:
							break;
						}
					}while(opc!=4);
				}
				else{
					do{
						opc=Menu.ListaMenu("Las opciones son:\n1)Modificar años de contrato.\n2)Modificar sueldo.\n3)Modificar lesiones.\n4)Salir.\nOpcion:",4);
						switch(opc){
						case 1:
							portero.SetContrato(Teclado.LeeEntero("Años de contrato: "));
							break;
						case 2:
							portero.SetSueldo(Teclado.LeeFloat("Sueldo: "));
							break;
						case 3:
							portero.SetLesiones(Teclado.LeeCadena("Lesiones: "));
							break;
						}
					}while(opc!=4);
				}
				break;
			case 5:
				i=Menu.ListaMenu("Introduce la posicion del jugador: ", 10);
				if(i<=9){
					jugador[i].MetodoPorPosicion();
				}
				else{
					do{
						opc=Menu.ListaMenu("Las opciones son:\n1)Saque de meta.\n2)Penal.\n3)Salir.\nOpcion:",3);
						switch(opc){
						case 1:
							portero.SaqueMeta();
							break;
						case 2:
							portero.Penal();
							break;
						}
					}while(opc!=3);
				}
				break;
			}
		}while(opcion != 6);
		tf=System.currentTimeMillis();
		t=tf-ti;
		System.out.println("Tiempo de ejecucion del programa en milisegundos: "+t);
	}
/**
* metodo que guarda la informacion del portero en un arreglo
*para despues  ser utilizado en otros metodos
*el metodo regresa  un arreglo de tipo String
*/
	public static String[] InformacionPortero(){
		String[] datos=new String[24];
		datos[0]="Miguel Alejandro Palacios Redorta";	datos[1]="Sin informacion";
		datos[2]="35";	datos[3]="Masculino";
		datos[4]="Sin informacion";	datos[5]="Mexicana";
		datos[6]="68";	datos[7]="1.83";
		datos[8]="Primera";	datos[9]="Si";
		datos[10]="4";	datos[11]="2";
		datos[12]="300000.40";	datos[13]="1";
		datos[14]="Portero";	datos[15]="Ninguna";
		datos[16]="8";	datos[17]="9";
		datos[18]="8";	datos[19]="8";
		datos[20]="9";	datos[21]="1.15";
		datos[22]="18";	datos[23]="9";
		return datos;
	}
  /**
* metodo que guarda la informacion de los cuatro  jugadores en un arreglo
*para despues  ser utilizado en otros metodos
*el metodo regresa  un arreglo de tipo String y recibe como parametrs un entero i que indica el numero de jugador
*/ 
	public static String[] InformacionJugador(int i){
		String[] datos=new String[23];
		if(i==0){
			datos[0]="Jose Carlos Van Rankin Galland";	datos[1]="Sin informacion";
			datos[2]="23";	datos[3]="Masculino";
			datos[4]="Soltero";	datos[5]="Mexicano";
			datos[6]="70.6";	datos[7]="1.79";
			datos[8]="Primera";	datos[9]="Si";
			datos[10]="5";	datos[11]="3";
			datos[12]="503743.10";	datos[13]="2";
			datos[14]="Defensa";	datos[15]="1";
			datos[16]="Ninguna";	datos[17]="10";
			datos[18]="8";	datos[19]="10";
			datos[20]="8";	datos[21]="8";
			datos[22]="9";
		}
		if(i==1){
			datos[0]="Gerardo Alcoba Rebollo";	datos[1]="Sin informacion";
			datos[2]="31";	datos[3]="Masculino";
			datos[4]="Soltero";	datos[5]="Uruguayo";
			datos[6]="80";	datos[7]="1.83";
			datos[8]="Primera";	datos[9]="Si";
			datos[10]="8";	datos[11]="1";
			datos[12]="498177.89";	datos[13]="3";
			datos[14]="Defensa";	datos[15]="2";
			datos[16]="Ninguna";	datos[17]="10";
			datos[18]="9";	datos[19]="10";
			datos[20]="7";	datos[21]="7";
			datos[22]="8";
		}
		if(i==2){
			datos[0]="Dario Anastacio Veron Maldonado";	datos[1]="Sin informacion";
			datos[2]="36";	datos[3]="Masculino";
			datos[4]="Casado";	datos[5]="Mexicano";
			datos[6]="84";	datos[7]="1.80";
			datos[8]="Primera";	datos[9]="Si";
			datos[10]="9";	datos[11]="2";
			datos[12]="301450.23";	datos[13]="4";
			datos[14]="Defensa";	datos[15]="3";
			datos[16]="Ninguna";	datos[17]="8";
			datos[18]="8";	datos[19]="10";
			datos[20]="9";	datos[21]="9";
			datos[22]="9";
		}
		if(i==3){
			datos[0]="Luis Fernando Fuentes Vargas";	datos[1]="Sin informacion";
			datos[2]="29";	datos[3]="Masculino";
			datos[4]="Soltero";	datos[5]="Mexicano";
			datos[6]="64";	datos[7]="1.72";
			datos[8]="Primera";	datos[9]="Si";
			datos[10]="7";	datos[11]="2";
			datos[12]="422931.16";	datos[13]="5";
			datos[14]="Defensa";	datos[15]="4";
			datos[16]="Ninguna";	datos[17]="10";
			datos[18]="9";	datos[19]="10";
			datos[20]="8";	datos[21]="8";
			datos[22]="10";
		}
		if(i==4){
			datos[0]="Javier Cortes Granados";	datos[1]="Sin informacion";
			datos[2]="26";	datos[3]="Masculino";
			datos[4]="Soltero";	datos[5]="Mexicano";
			datos[6]="75.4";	datos[7]="1.70";
			datos[8]="Primera";	datos[9]="Si";
			datos[10]="6";	datos[11]="2";
			datos[12]="276700.45";	datos[13]="7";
			datos[14]="Medio";	datos[15]="5";
			datos[16]="8";	datos[17]="9";
			datos[18]="10";	datos[19]="10";
			datos[20]="8";	datos[21]="8";
			datos[22]="7";
		}
		if(i==5){
			datos[0]="David Cabrera Pujol";	datos[1]="Sin informacion";
			datos[2]="26";	datos[3]="Masculino";
			datos[4]="Casado";	datos[5]="Mexicano";
			datos[6]="74.65";	datos[7]="1.79";
			datos[8]="Primera";	datos[9]="Si";
			datos[10]="6";	datos[11]="3";
			datos[12]="344960.37";	datos[13]="8";
			datos[14]="Medio";	datos[15]="6";
			datos[16]="6";	datos[17]="7";
			datos[18]="7";	datos[19]="9";
			datos[20]="10";	datos[21]="10";
			datos[22]="9";
		}
		if(i==6){
			datos[0]="Daniel Emanuel Ludueña";	datos[1]="Sin informacion";
			datos[2]="33";	datos[3]="Masculino";
			datos[4]="Casado";	datos[5]="Mexicano";
			datos[6]="83.97";	datos[7]="1.74";
			datos[8]="Primera";	datos[9]="Si";
			datos[10]="12";	datos[11]="2";
			datos[12]="420560.21";	datos[13]="4";
			datos[14]="Medio";	datos[15]="7";
			datos[16]="Raspado de la rodilla";	datos[17]="7";
			datos[18]="8";	datos[19]="8";
			datos[20]="9";	datos[21]="9";
			datos[22]="10";
		}
		if(i==7){
			datos[0]="Fidel Francisco Martinez Tenorio";	datos[1]="Sin informacion";
			datos[2]="26";	datos[3]="Masculino";
			datos[4]="Soltero";	datos[5]="Mexicano";
			datos[6]="77.84";	datos[7]="1.80";
			datos[8]="Primera";	datos[9]="Si";
			datos[10]="7";	datos[11]="2";
			datos[12]="299100";	datos[13]="11";
			datos[14]="Medio";	datos[15]="8";
			datos[16]="Dolor de garganta";	datos[17]="10";
			datos[18]="9";	datos[19]="9";
			datos[20]="9";	datos[21]="9";
			datos[22]="8";
		}
		if(i==8){
			datos[0]="Alejandro Castro Flores";	datos[1]="Sin informacion";
			datos[2]="29";	datos[3]="Masculino";
			datos[4]="Casado";	datos[5]="Mexicano";
			datos[6]="76";	datos[7]="1.77";
			datos[8]="Primera";	datos[9]="Si";
			datos[10]="11";	datos[11]="3";
			datos[12]="320145.87";	datos[13]="21";
			datos[14]="Medio";	datos[15]="9";
			datos[16]="Talon inflamado";	datos[17]="9";
			datos[18]="9";	datos[19]="8";
			datos[20]="8";	datos[21]="8";
			datos[22]="10";
		}
		if(i==9){
			datos[0]="Dante Rafael Lopez Fariña";	datos[1]="Sin informacion";
			datos[2]="32";	datos[3]="Masculino";
			datos[4]="Casado";	datos[5]="Mexicano";
			datos[6]="86";	datos[7]="1.85";
			datos[8]="Primera";	datos[9]="Si";
			datos[10]="14";	datos[11]="4";
			datos[12]="480130.30";	datos[13]="9";
			datos[14]="Delantero";	datos[15]="10";
			datos[16]="Ninguna";	datos[17]="10";
			datos[18]="9";	datos[19]="8";
			datos[20]="10";	datos[21]="10";
			datos[22]="10";
		}
		return datos;
	}
}