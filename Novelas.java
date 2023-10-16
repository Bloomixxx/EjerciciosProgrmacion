public class Novelas extends Libro{
        private String tema;
        
        public static void main (String[] args) {
	    }
        
Libro libro;
        public Novelas(String titulo, String autores, String tema) {
            super(titulo, autores);
            this.tema = tema;
        }

        public void imprimeDatosNovela() {
            imprimeLibro();
            System.out.println("Tema: " + tema);
        }

        public String getTema() {
            return tema;
        }

        public void setTema(String tema) {
            this.tema = tema;
        }
    }

