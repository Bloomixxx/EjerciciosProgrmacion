public class LibroTextoBuap extends LibroTexto {
        private String facultad;

        public LibroTextoBuap (String titulo, String autores, String curso, String facultad) {
            super(titulo, autores, curso);
            this.facultad = facultad;
        }

        public void imprimeDatosLibroTextoBuap() {
            imprimeDatosLibroTexto();
            System.out.println("Facultad: " + facultad);
        }

        public String getFacultad() {
            return facultad;
        }

        public void setFacultad(String facultad) {
            this.facultad = facultad;
        }

    }
