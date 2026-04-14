package bloqueG;

public class Ventilador {


    String marca;
    int velocidad;
    boolean encendido;

    // Constructor
    public Ventilador(String marca) {
        this.marca = marca;
        this.velocidad = 0;
        this.encendido = false;
    }

    // encender
    public void encender() {
        encendido = true;
        velocidad = 1;
        System.out.println("El ventilador " + marca + " se ha encendido.");
        System.out.println("El ventilador " + marca + " está en el nivel: " + velocidad);
    }

    // apagar
    public void apagar() {
        encendido = false;
        velocidad = 0;
        System.out.println("El ventilador " + marca + " se ha apagado");
    }

    // subir velocidad
    public void subirVelocidad() {
        if (encendido) {
            velocidad++;
            System.out.println("Se aumentó la velocidad. El ventilador " + marca + " está en el nivel " + velocidad);
        } else {
            System.out.println("No se puede subir la velocidad, el ventilador está apagado");
        }
    }
}
       class MainVentilador {
           public static void main(String[] args) {
               Ventilador ventilador = new Ventilador("Samurai");
               ventilador.encender();
               ventilador.subirVelocidad();
               ventilador.subirVelocidad();
               ventilador.apagar();
           }
       }


