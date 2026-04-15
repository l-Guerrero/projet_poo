package bloqueB;

import bloqueA.Estudiante;

public class Estudianteb {
    String nombre;
    String codigo;
    int semestre;

    // Ejercicio 71 constructor con parametros
    public Estudianteb(String nombre, String codigo, int semestre){
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
}
    class MainEstudianteb {
    public static void main(String[]args){

      Estudianteb alumno = new Estudianteb("Yubiris Guerrero", "S1991-034", 5);
      alumno.mostrarInfo();
    }
  }
