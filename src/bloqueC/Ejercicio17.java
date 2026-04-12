package bloqueC;

import bloqueB.Estudianteb;

public class Ejercicio17 {
    String nombre;
    String codigo;
    int semestre;

    public void mostrarInfo() {
        System.out.println("informacion del estudiante");
        System.out.println("Nombre:" + nombre);
        System.out.println("Codigo:" + codigo);
        System.out.println("Semestre:" + semestre);
    }
    // Aqui el metodo para cambiar semestre
     public void cambiarSemestre(int nuevoSemestre) {
         semestre = nuevoSemestre;
         System.out.println("Actualización de datos");
        System.out.println ( nombre + " " + "Ha pasado al semestre" +" " + semestre);
     }
}
    class MainEjercicio17 {
        public static void main(String[] args) {

            Ejercicio17 Alumno = new Ejercicio17();
            Alumno.nombre = "Yubiris Guerrero";
            Alumno.codigo = "S1991-034";
            Alumno.semestre = 5;
            Alumno.mostrarInfo();

            // Se hace el cambio de semestre
            Alumno.cambiarSemestre(6);
            Alumno.mostrarInfo();
        }
    }
    // Ejercicio 19
   /* Estudiante es una clase porque es la definición de los datos que todos
   los estudiantes comparten, es decir, son solo instrucciones estáticas que el programa
   solo lee y no puede cambiar y est1 es un objeto porque es un alumno específico con nombre propio
    que el programa puede manejar, hacer cambios o mostrar sus datos en pantalla */




