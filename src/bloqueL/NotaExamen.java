package bloqueL;

public class NotaExamen {
        String estudiante;
        double nota;
        String materia;

        public NotaExamen(String estudiante, double nota, String materia) {
            this.estudiante = estudiante;
            this.nota = nota;
            this.materia = materia;
        }

        public void verResultado() {
            if (nota >= 3.0) {
                System.out.println(estudiante + " aprobó " + materia + " con " + nota);
            } else {
                System.out.println(estudiante + " debe recuperar " + materia);
            }
        }

        public void darPuntosExtra(double extra) {
            this.nota = nota + extra;
            System.out.println("Se sumaron puntos. Nueva nota: " + nota);
        }

        public static void main(String[] args) {

            NotaExamen Nota = new NotaExamen("Juan", 3.8, "Matemáticas");
            Nota.verResultado();
            Nota.darPuntosExtra(0.5);
            Nota.verResultado();
        }
    }

