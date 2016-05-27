
/**
* @author: Josue Sanchéz 
* @author: Rodrigo Florian
* @author: Colvert Gomez
* @author: Carlos Pérez Vásquez
* @author: Eliseo Martinez Aguirre
* @version: 26/05/2016/A
**/
public class PruebaAlineacion {
	static int contadorextranjeros=0;
	static int[] arreglo=new int[10];
	//static JugadorCampo[] arreglojugadores=new JugadorCampo[10];
	public static void main(String args[]){
		System.out.println("La alineacion a respetar sera 1-4-2-3-1 es decir:"
				+ "\n1 portero"
				+ "\n4 jugadores en la defensa (lateral-izquierdo,central-izquierdo,central-derecho,lateral-derecho)"
				+ "\n2 jugadores medio centros (izquierdo y derecho)"
				+ "\n3 jugadores medio ofensivos (izquierdo, central y derecho)"
				+ "\n1 jugador delantero");
		InicializaArreglo();
		JugadorPortero Portero=new JugadorPortero();
		JugadorCampo[] arreglojugadores=new JugadorCampo[10];
		/*
		JugadorCampo[] arreglojugadores=new JugadorCampo[10];
		for(int i=0;i<10;i++){
			MensajeNacionalidad();
		}
		*/
	}
	public static void InicializaArreglo(){
		for(int i=0;i<10;i++)
			arreglo[i]=0;
	}
	public static void MensajeNacionalidad(){
		if(contadorextranjeros>=5)
			System.out.println("El numero de jugadores extranjeros ha llegado a su limite, por favor unicamente proporciona datos de jugadores nacionales");
	}
	public static boolean ValidaNacionalidad(int dato){
		if(dato==2 && contadorextranjeros<6){
			contadorextranjeros++;
			return false;
		}
		if(dato==2 && contadorextranjeros>5){
			MensajeNacionalidad();
		}
		return true;
	}
	public static boolean ValidaPosicion(int posicion){
		if(arreglo[posicion]==0){
			arreglo[posicion]=1;
			return false;
		}
		if(arreglo[posicion]==1)
			System.out.println("Esta posicion ya se encuentra ocupada, elige otra");
		return true;
	}
}
