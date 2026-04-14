package bloqueG;

public class Puerta {

        String material;
        boolean abierta;

        // Constructor
        public Puerta(String material) {
            this.material = material;
            this.abierta = false; // comienza cerrada
        }

        public void abrir() {
            abierta = true;
            System.out.println("se ha abierto la puerta de " + material);

        }
        public void cerrar() {
            abierta = false;
            System.out.println("Se ha cerrado la puerta de " + material);

        }

        public void mostrarEstado() {
            if (abierta) {
                System.out.println("La puerta de " + material + " está abierta");
            } else {
                System.out.println("la puerta de " + material + " está cerrada");
            }
        }
           }
        class main{
        public static void main(String[]args) {
            Puerta door = new Puerta("Madera");
            door.mostrarEstado();
            door.abrir();
            door.mostrarEstado();
            door.cerrar();
            door.mostrarEstado();

        }
    }
