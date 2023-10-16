public class Estudiante extends Persona {
    private String facultad;
    private float pagoInscripcion;

    public Estudiante(String nombre, String residencia, String facultad, float pagoInscripcion) {
        super(nombre, residencia);
        this.facultad = facultad;
        this.pagoInscripcion = pagoInscripcion;
    }

    public void imprimePersona () {  //REDEFINICION DE METODO - OVERRIDING
       System.out.println("Escribe nombre: " + this.getNombre());
       System.out.println("Escribe residencia " + this.getResidencia());
        System.out.println("Facultad: " + facultad);
        System.out.println("Cuota que paga por el Seguro social: " + pagoCuotaSS(pagoInscripcion));
    }


    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {  
        this.facultad = facultad;
    } 

    public float getPagoInscripcion() {
        return pagoInscripcion;
    }

   /*  public void setPagoInscripcion(float pagoInscripcion) {
        this.pagoInscripcion = pagoInscripcion;
    }  */
  
    public float pagoCuotaSS(float pagoInscripcion) {  
        return pagoInscripcion / 10;
    }


}
