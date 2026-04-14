package bloqueG;

public class Lampara {

        String marca;
        boolean encender;

        // Constructor
        public Lampara(String marca) {
            this.marca = marca;
            this.encender = false; // Apagada
        }

        // Encender
        public void encender() {
            encender = true;
            System.out.println("Se ha encendido la lámpara " + marca);
        }

        // Apaagar
        public void apagar() {
            encender = false;
            System.out.println("Se ha apagado la lámpara " + marca);
        }

        public void mostrarEstado() {
            if (encender) {
                System.out.println("La lámpara " + marca + " está encendida.");
            } else {
                System.out.println("La lámpara " + marca + " está  apagada.");
            }
        }
    }
    class Main {
    public static void main(String[]args) {
        Lampara lamp = new Lampara("Artemide");
        lamp.mostrarEstado();
        lamp.encender();
        lamp.mostrarEstado();
        lamp.apagar();
        lamp.mostrarEstado();
    }
    }

