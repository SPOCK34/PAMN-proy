/**
*La clase teclado nos ayuda a lalectura de varios tipos de datos como strings  enteros o reales
*inporta una clase de excepciones necesarias para  la validacion de lalectura
*/
import java.io.*;

public class Teclado
{
    static private String cadena;
    static private BufferedReader in;

    /**
    * métodos públicos 
    */
	 
    /**
    *metodos que leen  cadenas
    */
    public static String LeeCadena(String prompt) {
		  return  leerCadena(prompt);
    }

    public static String LeeCadena() {
        return leerCadena("");
    }
     /**
    *metodos que leen  bytes
    */
    public static byte LeeByte(String prompt) {
        return leerByte(prompt);
    }

    public static byte LeeByte() {
        return leerByte("");
    }
   /**
    *metodos que leen  enteros
    */
    public static int LeeEntero(String prompt) {
        return leerEntero(prompt);
    }

    public static int LeeEntero() {
        return leerEntero("");
    }
    /**
    *metodos que leen  flotantes
    */
    public static float LeeFloat(String prompt) {
        return leerFlotante(prompt);
    }

    public static float LeeFloat() {
        return leerFlotante("");
    }
   /**
    *metodos que leen  dobles
    */
    public static double LeeDouble(String prompt) {
        return leerDoble(prompt);
    }

    public static double LeeDouble() {
        return leerDoble("");
    }

    /**
    * métodos privados!
    */
    
    /**
    * metodo  que inicializa 
    */
    private static void inicializar() {
	     if (in==null)
        	in = new BufferedReader(new InputStreamReader(System.in));
    }

   /**
   *metodo que valida y lee la cadena 
   *asi como manda un mensaje de error  al presentarse la excepcion
   */
    private static String leerCadena(String prompt) {
        try {
        		inicializar();
            if (prompt.compareTo("")==0)
                System.out.print(" >");
            else
                System.out.print(prompt);
            cadena = in.readLine();
        } catch (IOException e) {
           System.out.println("Ha ocurrido un error: ");
        }
        return cadena;
    }
/**
   *metodo que valida y lee la byte
   *asi como manda un mensaje de error  al presentarse la excepcion
   */
    private static byte leerByte(String prompt) {
        byte b=0;
        boolean ok;
        try {
        		inicializar();
            do {
                if (prompt.compareTo("")==0)
                    System.out.print(" >");
                else
                    System.out.print(prompt);
                try {
                    b = Byte.parseByte(in.readLine());
                    ok = true;
                } catch (java.lang.NumberFormatException e) {
                    System.out.println("Ha ocurrido un error: "+e.toString());
                    ok = false;
                }
            }
            while (!ok);
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error: "+e.toString());
        }
        return b;
    }
    /**
   *metodo que valida y lee enteros
   *asi como manda un mensaje de error  al presentarse la excepcion
   */
    private static int leerEntero(String prompt) {
        int i=0;
        boolean ok;
        try {
        		inicializar();
            do {
                if (prompt.compareTo("")==0)
                    System.out.print(" >");
                else
                    System.out.print(prompt);
                try {
                    i = Integer.parseInt(in.readLine());
                    ok = true;
                } catch (java.lang.NumberFormatException e) {
                    System.out.println("Ha ocurrido un error: "+e.toString());
                    ok = false;
                }
            }
            while (!ok);
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error: "+e.toString());
        }
        return i;
    }
/**
   *metodo que valida y lee flotantes
   *asi como manda un mensaje de error  al presentarse la excepcion
   */
    private static float leerFlotante(String prompt) {
        float f=0.0f;
        boolean ok;
        try {
        		inicializar();
            do {
                if (prompt.compareTo("")==0)
                    System.out.print(" >");
                else
                    System.out.print(prompt);
                try {
                    f = (Float.valueOf(in.readLine())).floatValue();
                    ok = true;
                } catch (java.lang.NumberFormatException e) {
                    System.out.println("Ha ocurrido un error: "+e.toString());
                    ok = false;
                }
            }
            while (!ok);
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error: "+e.toString());
        }
        return f;
    }
    
    /**
   *metodo que valida y lee la dobles 
   *asi como manda un mensaje de error  al presentarse la excepcion
   */
    
    private static double leerDoble(String prompt) {
        double d=0.0;
        boolean ok;
        try {
        		inicializar();
            do {
                if (prompt.compareTo("")==0)
                    System.out.print(" >");
                else
                    System.out.print(prompt);
                try {
                    d = (Double.valueOf(in.readLine())).doubleValue();
                    ok = true;
                } catch (java.lang.NumberFormatException e) {
                    System.out.println("Ha ocurrido un error: "+e.toString());
                    ok = false;
                }
            }
            while (!ok);
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error: "+e.toString());
        }
        return d;
    }

}