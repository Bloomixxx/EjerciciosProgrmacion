public class Catedratico extends Persona {
    private String facultad;
    private float salario;

    public Catedratico(String nombre, String residencia, String facultad, float salario) {
        super(nombre, residencia);
        this.facultad = facultad;
        this.salario = salario;
    }

    
    public float pagoCuotaSS(float salario) {
        return (float) (salario * .15);
    }
 
                
    public void imprimePersona() {  //REDEFINICION DE METODO - OVERRIDING 
        System.out.println("Escribe nombre: " + this.getNombre());
        System.out.println("Escribe residencia " + this.getResidencia());
        System.out.println("facultad = " + this.getFacultad());
        System.out.println("Cuota que paga por el seguro social: " + pagoCuotaSS(salario));
    }

    public String getFacultad() {
        return facultad;
    }

  public void setFacultad(String facultad) {
        this.facultad = facultad;
    }  

  /* public float getSalario() {
        return salario;
    } */

  /*  public void setSalario(float salario) {
        this.salario = salario;
    }   */

    
}
