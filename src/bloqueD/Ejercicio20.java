package bloqueD;

public class Ejercicio20 {
        String titulo;
        String autor;
    }
    class MainEjercicio20 {
        public static void main(String[] args) {
            // objeto 1
            Ejercicio20 libro1 = new Ejercicio20();
            libro1.titulo = "La divina comedia";
            libro1.autor = "Dante Alighieri";

            // objeto2
            Ejercicio20 libro2 = new Ejercicio20();
            libro2.titulo = "La teogonía";
            libro2.autor = "Hesíodo";

            // objeto 3
            Ejercicio20 libro3 = new Ejercicio20();
            libro3.titulo = "La odisea";
            libro3.autor = "Homero";

            /* Los tres objetos comparten la misma clase, los tres se rigen por los atributos de
            esta, lo que significa que todos tienen un espacio para un titulo y un autor.
            Se diferencian en que cada uno está en un lugar diferente de la memoria del computador
            y en su contenido. Cada objeto es independiente del otro aunque tengan la misma clase y
            atributos  */

        }


}

