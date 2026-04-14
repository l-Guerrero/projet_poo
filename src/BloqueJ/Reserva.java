package BloqueJ;

public class Reserva {
        String nombreCliente;
        String fecha;
        boolean activa;

        public Reserva(String nombreCliente, String fecha) {
            this.nombreCliente = nombreCliente;
            this.fecha = fecha;
            this.activa = false;
        }

        public void confirmar() {
            activa = true;
            System.out.println("Reserva confirmada para " + nombreCliente);
        }

        public void cancelar() {
            activa = false;
            System.out.println("Reserva cancelada para " + nombreCliente);
        }
    }

     class MainReserva {
        public static void main(String[] args) {

            Reserva cita = new Reserva("Andrés Pérez", "10 de Abril");
            cita.confirmar();
            cita.cancelar();
        }
    }

