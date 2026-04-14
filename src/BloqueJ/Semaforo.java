package BloqueJ;

public class Semaforo {
        String colorActual;

        // Constructor
        public Semaforo(String colorInicial) {
            this.colorActual = colorInicial;
        }

        public void cambiarColor(String nuevoColor) {
            this.colorActual = nuevoColor;
            System.out.println("El semáforo ahora está en: " + colorActual);
        }
    }

      class MainSemaforo {
        public static void main(String[] args) {

            Semaforo semaforo = new Semaforo("Rojo");
            semaforo.cambiarColor("Verde");
            semaforo.cambiarColor("Amarillo");
            semaforo.cambiarColor("Rojo");
        }
    }

