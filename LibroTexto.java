public class LibroTexto extends Libro {
        private String curso;
       
       
       public static void main (String[] args) {
	   }
        public LibroTexto(String titulo, String autores, String curso) {
            super(titulo, autores);
            this.curso = curso;
        }
Libro libro;

        public void imprimeDatosLibroTexto() {
           imprimeLibro();
            System.out.println("Curso: " + curso);
        }


        public String getCurso() {
            return curso;
        }

        public void setCurso(String curso) {
            this.curso = curso;
        }
    }