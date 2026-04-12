package bloqueD;

public class Libro {
        String titulo;
        String autor;

    // Aqui está el constructor vacio que pide el ejercicio23
    public Libro(){
    }
    // constructor con párametros que pide el Ejercicio24
    public Libro(String tituloparametro, String autorparametro)
    {
        this.titulo = tituloparametro;
        this.autor = autorparametro;
    }
}
       class MainLibro{
        public static void main(String[]args) {

            Libro lb1 = new Libro();
            lb1.titulo = "El principito";
            lb1.autor = " Antonie de Saint-Exupéry";

            Libro lb2 = new Libro();
            lb2.titulo = "El coronel no tiene quien le escriba";
            lb2.autor = "Gabriel Garcia Marquez";

            Libro lb3 = new Libro();
            lb3.titulo= "La Maria";
            lb3.autor = "Jorge Isaacs";

            Libro lb4 = new Libro();
            lb4.titulo = "El viejo y el mar";
            lb4.autor = "Ernest Hemingway";

            // usar parametros
            // mismo autor diferente titulo
            Libro lb5 = new Libro("El amor en los tiempos del cólera", "Gabriel Garcia Marquez");
            Libro lb6 = new Libro ("Crónica de una muerte anunciada", "Gabriel Garcia Marquez");

            System.out.println("1: " + lb1.titulo + " - " + lb1.autor);
            System.out.println("2: " + lb2.titulo + " - " + lb2.autor);
            System.out.println("3: " + lb3.titulo + " - " + lb3.autor);
            System.out.println("4: " + lb4.titulo + " - " + lb4.autor);
            System.out.println("5: " + lb5.titulo + " - " + lb5.autor);
            System.out.println("6: " + lb6.titulo + " - " + lb6.autor);

        /* La clase funciona como una base o plantilla porque solo define qué datos debe tener
        cualquier libro para existir en el sistema. Los objetos son los casos reales porque son versiones
        únicas que ya tienen vida propia en la memoria. Cada uno guarda su propia imformación
        y el programa los usa para mostrarlos en pantalla o trabajar con ellos individualmente
         */


        }
    }
