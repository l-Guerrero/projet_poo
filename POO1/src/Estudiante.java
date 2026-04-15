public class Estudiante {
        String nombre;
        int edad;
        String curso;

        // Constructor por defecto
        public Estudiante() {
            this.nombre = "Sin nombre";
            this.edad = 0;
            this.curso = "Ninguno";
        }

        //  Constructor nombre y edad
        public Estudiante(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
            this.curso = "Pendiente"; // Valor por defecto
        }

        //  Constructor  parámetros
        public Estudiante(String nombre, int edad, String curso) {
            this(nombre, edad); // Llama al constructor anterior
            this.curso = curso;
        }

        public void mostrarDatos() {
            System.out.println("Estudiante: " + nombre + "  Edad: " + edad + "  Curso: " + curso);
        }

        public static void main(String[] args) {

            Estudiante e1 = new Estudiante();
            Estudiante e2 = new Estudiante("Luis", 20);
            Estudiante e3 = new Estudiante("Ana", 22, "Programacion");

            e1.mostrarDatos();
            e2.mostrarDatos();
            e3.mostrarDatos();
        }
    }

