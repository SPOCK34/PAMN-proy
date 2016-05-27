import java.io.*;

public class Teclado
{
    static private String cadena;
    static private BufferedReader in;

    // métodos públicos
	 
    public static String LeeCadena(String prompt) {
		  return  leerCadena(prompt);
    }

    public static String LeeCadena() {
        return leerCadena("");
    }
    
    public static byte LeeByte(String prompt) {
        return leerByte(prompt);
    }

    public static byte LeeByte() {
        return leerByte("");
    }

    public static int LeeEntero(String prompt) {
        return leerEntero(prompt);
    }

    public static int LeeEntero() {
        return leerEntero("");
    }
    
    public static float LeeFloat(String prompt) {
        return leerFlotante(prompt);
    }

    public static float LeeFloat() {
        return leerFlotante("");
    }

    public static double LeeDouble(String prompt) {
        return leerDoble(prompt);
    }

    public static double LeeDouble() {
        return leerDoble("");
    }

    // métodos privados!

    private static void inicializar() {
	     if (in==null)
        	in = new BufferedReader(new InputStreamReader(System.in));
    }

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