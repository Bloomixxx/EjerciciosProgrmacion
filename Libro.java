import javax.swing.JOptionPane;
import java.util.*;
public class Libro {
    private static String titulo;
    private static String autores;
    private static double precio;
    
    public static void main (String[] args) {
    }
    
     public Libro(String titulo, String autores) {
        this.titulo = titulo;
        this.autores = autores;
     
    }
    
    public static void imprimeLibro() {
        System.out.println("Titulo: " + Libro.titulo);
        System.out.println("Autor(es): " + Libro.autores); 
    }

    public static void imprimePrecioLibro() {
        Libro.imprimeLibro();
        System.out.println("Precio: " + Libro.precio);
    }

    public static void ventanaLibro(){
        JOptionPane.showMessageDialog(null,"Titulo: "+ Libro.titulo +", Autor: "+ Libro.autores +", Precio: "+ Libro.precio);
    }
   
    public static String getTitulo() {
        return titulo;
    }
    public static String getAutores() {
        return autores;
    }
   public static double getPrecio() {
        return precio;
   }
    public static void setPrecio(double nuevo_precio) {
        precio = nuevo_precio;
    }


    static class Corrida{
        public static void main(String[] args) {
            Scanner scanner = new Scanner (System.in);
             System.out.println("Ingresa titulo: ");
            Libro.titulo = scanner.nextLine();

        System.out.println("Ingresa autor: ");
        Libro.autores = scanner.nextLine();

        System.out.println("---------------------------");
       System.out.println("DATOS LIBRO");
       imprimeLibro();
             // ventanaLibro();
         }

     }
}