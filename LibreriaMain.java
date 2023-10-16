import java.util.Scanner;

public class LibreriaMain{
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);

        System.out.println("Escribe titulo (Libro 1):");
        String titulo = leer.next();

        System.out.println("Escribe autor(es) (Libro 1):");
        String autores = leer.next();

        System.out.println("Escribe curso del primer libro: ");
        String curso= leer.next();

        System.out.println("Escribe la faultad a la que pertenece el libro: ");
        String facultad= leer.next();
        LibroTextoBuap Estudiante= new LibroTextoBuap (titulo,autores,curso, facultad);

        System.out.println("-------------------------------");
        System.out.println("DATOS DEL PRIMER LIBRO: ");
        Estudiante.imprimeDatosLibroTextoBuap();
        System.out.println("-------------------------------");


         System.out.println("Escribe titulo del segundo Libro:");
            titulo = leer.next();

        System.out.println("Escribe autor(es) del segundo Libro:");
            autores = leer.next();

        System.out.println("Escribe el TEMA: ");
            String tema = leer.next();
            Novelas novela = new Novelas (titulo, autores, tema);

            System.out.println("---------------------------------------");           
            System.out.println("DATOS DEL SEGUNDO LIBRO: ");
            novela.imprimeDatosNovela();
            System.out.println("---------------------------------------");


            System.out.println("Inserta precio (libro 1):");
            double precio = leer.nextDouble();
            Estudiante.setPrecio(precio);
            System.out.println("---------------------------------------");
            System.out.println("DATOS ACTUALIZADOS PRIMER LIBRO: ");
            Estudiante.imprimePrecioLibro();
            System.out.println("---------------------------------------");
        
        leer.close();

    } 
}
