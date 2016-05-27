public class Menu{

//Metodo//

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