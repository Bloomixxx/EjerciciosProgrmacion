public class Persona {
    private String nombre, residencia;
public static void main (String[] args) {
}

    public Persona(String nombre, String residencia) {
        this.nombre = nombre;
        this.residencia = residencia;
    }
    
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void imprimePersona() { //Metodo overriding 
        System.out.println("Tu nombre es: " + nombre);
        System.out.println("Tu residencia es: " + residencia);
    }

    public String getNombre() {
        return nombre;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String nueva_residencia) {
        this.residencia = nueva_residencia;
    }
}
