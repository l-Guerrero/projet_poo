public class Estudiante {
        String nombre;
        int edad;

        //Constructor con parámetros
        public Estudiante(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        // Constructor por defecto
        public Estudiante() {
            this("Sin nombre", 0);
        }

        public void mostrarDetalles() {
            System.out.println("Estudiante: " + nombre + "  Edad: " + edad);
        }

        public static void main(String[] args) {
            Estudiante e1 = new Estudiante("Carlos", 21);
            Estudiante e2 = new Estudiante();

            System.out.println(" Resultados Ejercicio 2");
            e1.mostrarDetalles();
            e2.mostrarDetalles();
        }
    }

