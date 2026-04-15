package bloquek;
/* Atributos: nombrePaciente, especialidad, piso
   metodos: ingresarPaciente, DarAlta
   objeto: "Juana", "medicina general", "5" */

public class Hospital {
        String nombrePaciente;
        String especialidad;
        int piso;

        public Hospital(String nombrePaciente, String especialidad, int piso) {
            this.nombrePaciente = nombrePaciente;
            this.especialidad = especialidad;
            this.piso = piso;
        }

        public void ingresarPaciente() {
            System.out.println("Paciente " + nombrePaciente + " ingresado en " + especialidad + " (Piso " + piso + ")");
        }
        public void darAlta() {
            System.out.println("El paciente " + nombrePaciente + " ha recibido el alta médica.");
        }
        public static void main(String[] args) {
            Hospital paciente = new Hospital("Luis Gómez", "Pediatría", 3);

            // Ejecución de las acciones
            paciente.ingresarPaciente();
            paciente.darAlta();
        }
    }

