public class Mensaje {
    private String llamada;
    private String remitente;
    private MensajeTexto mensaje;

    public Mensaje(MensajeTexto mensaje, String llamada, String remitente) {
        this.mensaje = mensaje;
        this.llamada = llamada;
        this.remitente = remitente;
    }


    public Mensaje(MensajeTexto mensaje, String remitente) {
            this(mensaje,"", remitente);
          
        }

    public Mensaje (MensajeTexto mensaje){
        this (mensaje, "", "");
    }
    
        // Método para actualizar el número de llamada
        public void actualizarNumeroLlamada(String nueva_llamada) {
            this.llamada= nueva_llamada;
        }
    
        // Método para imprimir el mensaje
        public void imprimirMensaje() {
            System.out.println("Número de llamada: " + llamada);
            System.out.println("Número del remitente: " + remitente);
            System.out.println("Texto del mensaje: " + mensaje.getMensajeTexto());
            
        }
    
       
    }
    

