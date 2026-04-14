package BloqueJ;

public class Reloj {
        int hora;
        int minuto;
        int segundo;

        public Reloj(int hora, int minuto, int segundo) {
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        }

        public void mostrarHora() {
            System.out.println("Hora actual: " + hora + ":" + minuto + ":" + segundo);
        }
    }

        class MainReloj {
        public static void main(String[] args) {

            Reloj reloj = new Reloj(12, 40, 15);
            reloj.mostrarHora();
        }
    }

