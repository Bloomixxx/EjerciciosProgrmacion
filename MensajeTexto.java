 import java.util.*;
public class MensajeTexto {
    public static void main(String[] args) {
        
    }

    private static String codigo;
    private static String mensajeTexto;

    public MensajeTexto(String codigo, String mensajeTexto) {
        this.codigo = codigo;
        this.mensajeTexto = mensajeTexto;
    }

    public static String getCodigo() {
        return codigo;
    }

   public static String getMensajeTexto() {
        return mensajeTexto;
    }


    public static void MensajeTexto (){
        System.out.println("----------------------------------------");
        System.out.println("------------MENSAJE--------------");
        System.out.println("Mensaje: " + MensajeTexto.mensajeTexto);
        System.out.println("Codigo:" + MensajeTexto.codigo);
         System.out.println("----------------------------------------");

         }


static class corrida{
public static void main(String[] args) {
     Scanner scanner= new Scanner (System.in);
     System.out.println("Ingre el mensaje de la siguiente forma: ");
        System.out.println("Primera palabra: ");
        String men1 = scanner.nextLine(); 
        System.out.println("Segunda palabra: ");
        String men2= scanner.nextLine();
        System.out.println("Tercera palabra:");
        String men3=scanner.nextLine(); 
    
        System.out.println("----------------------------------------");
    
        System.out.println("MENSAJE:" );
        String mensaje =men1 + ("") + men2 + ("") + men3;
        System.out.println(mensaje);
    
        System.out.println("----------------------------------------");
        System.out.println("TU CODIGO ES: ");
        String codigo= mensaje.substring(0,1) + men2.substring(0,1) + men3.substring(0,1);
        System.out.println(codigo);
        MensajeTexto mensajeTexto= new MensajeTexto(codigo, mensaje);

        MensajeTexto();
    
        }

    }
 }
