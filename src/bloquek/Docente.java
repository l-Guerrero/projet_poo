package bloquek;

/* Que atributos tendrá;
pueden ser: nombre, asignatura y facultad en la que trabaja
Que métodos tendrá;
pueden ser: Calificar y revisarActividad
Que objetos pueden construirse;
: "Jhon Carlos" de "POO" en "ingienería"*/
public class Docente {
        String nombre;
        String materia;
        String facultad;

        public Docente(String nombre, String materia, String facultad) {
            this.nombre = nombre;
            this.materia = materia;
            this.facultad = facultad;
        }

        public void calificar(String estudiante, double nota) {
            System.out.println("El docente " + nombre + " calificó " + nota + " a " + estudiante + " en " + materia);
        }

        public void revisarActividad(String nombreActividad) {
            System.out.println("Revisando el avance de la actividad que es un " + nombreActividad + " en la facultad de " + facultad);
        }

        public static void main(String[] args) {
            Docente Profe = new Docente("John", "Programación orientada a objetos", "Ingeniería");

            Profe.calificar("Andrés", 4.5);
            Profe.revisarActividad("Sistema de Inventario");
        }
    }

