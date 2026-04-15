package bloqueL;

public class Celular {
        String marca;
        String modelo;
        int bateria;

        public Celular(String marca, String modelo, int bateria) {
            this.marca = marca;
            this.modelo = modelo;
            this.bateria = bateria;
        }

        public void usarApp(String app) {
            if (bateria > 5) {
                this.bateria -= 5;
                System.out.println("Usando " + app + " Batería restante: " + bateria + "%");
            } else {
                System.out.println("Batería muy baja para abrir " + app);
            }
        }
        public void cargarCelular() {
            this.bateria = 100;
            System.out.println("El " + modelo + " se ha cargado completamente y ya se puede usar" );
        }

        public static void main(String[] args) {

            Celular Cel = new Celular("Samsung", "A16", 3);
            Cel.usarApp("Whatsapp");
            Cel.cargarCelular();
        }
    }

