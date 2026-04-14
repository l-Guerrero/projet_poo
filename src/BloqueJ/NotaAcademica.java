package BloqueJ;

public class NotaAcademica {
        String asignatura;
        double nota1;
        double nota2;
        double nota3;

        // Constructor
        public NotaAcademica(String asignatura, double nota1, double nota2, double nota3) {
            this.asignatura = asignatura;
            this.nota1 = nota1;
            this.nota2 = nota2;
            this.nota3 = nota3;
        }

        public double calcularDefinitiva() {
            return (nota1 + nota2 + nota3) / 3;

        }
    }

          class MainNotas {
        public static void main(String[] args) {

            NotaAcademica clase = new NotaAcademica("Algoritmos y programación", 4.5, 2.8, 4.0);
            double finalMateria = clase.calcularDefinitiva();
            System.out.println("En la asignatura " + clase.asignatura + " la nota definitiva es: " + finalMateria);
        }
    }

