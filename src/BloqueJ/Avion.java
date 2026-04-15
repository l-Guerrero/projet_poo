package BloqueJ;

public class Avion {
        String aerolinea;
        String destino;
        int pasajeros;

        public Avion(String aerolinea, String destino, int pasajeros) {
            this.aerolinea = aerolinea;
            this.destino = destino;
            this.pasajeros = pasajeros;
        }

        // sumar pasajeros
        public void abordar(int cantidad) {
            this.pasajeros = pasajeros + cantidad;
            System.out.println("Han subido " + cantidad + " pasajeros nuevos al vuelo de " + aerolinea);
        }
    }
         class MainAvion {
        public static void main(String[] args) {

            Avion vuelo = new Avion("Avianca", "Cartagena", 80);
            vuelo.abordar(55);
            System.out.println("Total de pasajeros hacia " + vuelo.destino + ": " + vuelo.pasajeros);
        }
    }

