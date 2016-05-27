/**
*Clase menu que genera el rpototipo de menu 
*para su mejor  implemntacion  en la funcion principal
*/

public class Menu{

/**
*Metodo que valida  que el usuario ingrese una opcion valida
*de lo contrario se repetra el menu
*/

   public static int ListaMenu(String texto,int max_opc){
      int opcion;
      do{
         opcion = Teclado.LeeEntero(texto);
         if(opcion > max_opc || opcion<1){
            System.out.println("Error: Opcion invalida...");
         }
      }while(opcion > max_opc || opcion < 1);
      return opcion;
   }
}