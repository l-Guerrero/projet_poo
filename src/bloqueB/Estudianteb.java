package bloqueB;

import bloqueA.Estudiante;

public class Estudianteb {
    String nombre;
    String codigo;
    int semestre;

    public void mostrarInfo() {
        System.out.println("informacion del estudiante");
        System.out.println("Nombre:" + nombre);
        System.out.println("Codigo:" + codigo);
        System.out.println("Semestre:" + semestre);

    }
}
    class MainEstudianteb {
    public static void main(String[]args){

      Estudianteb Alumno = new Estudianteb();

      Alumno.nombre = "Yubiris Guerrero";
      Alumno.codigo = "S1991-034";
      Alumno.semestre = 5;
      Alumno.mostrarInfo();
    }
  }
