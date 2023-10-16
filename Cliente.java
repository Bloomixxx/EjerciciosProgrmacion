import java.util.Scanner;

public class Cliente {

   public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);

    System.out.println("Ingresa telefono del remitente: ");
    String numRemitente = scanner.nextLine();

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

     System.out.println("----------------------------------------");
    System.out.println("Ingrese el numero del telefono del receptor: ");
    String numllamada= leerNumeroTelefono();

    Mensaje mensa= new Mensaje (mensajeTexto, numllamada, numRemitente);


System.out.println("-------------------------------");

System.out.println("INFORMACION DEL MENSAJE:");
    mensa.imprimirMensaje();
    
    scanner.close();
   }

        public static String leerNumeroTelefono(){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese el número de teléfono: ");
            return scanner.nextLine();  
        }
       

    }