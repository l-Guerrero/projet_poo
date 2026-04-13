package bloqueC;

public class Estudiantee {
    String nombre;
    String codigo;
    int semestre;


    // Ejercicio 29
    // Constructor vacio
    public Estudiantee(){
    }
    // constructor con nombre y codigo
    public Estudiantee(String nombre, String codigo){
        this.nombre = nombre;
        this.codigo = codigo;
    }
    // constructor con nombre, codigo y semestre
    public Estudiantee(String nombre, String codigo,int semestre){
        this.nombre = nombre;
        this.codigo = codigo;
        this.semestre = semestre;
    }
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
    class MainEstudiantee {
        public static void main(String[] args) {
            // constructor vacio
            Estudiantee Alumno = new Estudiantee();
            Alumno.nombre = "Yubiris Guerrero";
            Alumno.codigo = "S1991-034";
            Alumno.semestre = 5;
            Alumno.mostrarInfo();

            // constructor con nombre y codigo
            Estudiantee alumno2 = new Estudiantee("Manuel reyes", "R2026-002");
            alumno2.mostrarInfo();

            // constructor completo
            Estudiantee alumno3 = new Estudiantee("Ana Martinez", "M2007-107", 6);
            alumno3.mostrarInfo();

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




