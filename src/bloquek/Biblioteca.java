package bloquek;
/* Atributos: pueden ser los más comunes como.
 nombrelibro, autor y en que estante está
  Metodos: PrestarLibro, DevolucionLibro
   Objetos: "La Maria" "5" "Jorge Isaacs"*/

public class Biblioteca {
        String nombreLibro;
        String autor;
        String estante;

        public Biblioteca(String nombreLibro, String autor, String estante) {
            this.nombreLibro = nombreLibro;
            this.autor = autor;
            this.estante = estante;
        }
        public void prestarLibro() {
            System.out.println("El libro " + nombreLibro + " ha sido retirado del estante " + estante );
        }

        public void devolucionLibro() {
            System.out.println("Se ha devuelto el libro " + nombreLibro + ".Ubicarlo de nuevo en el estante " + estante);
        }

        public static void main(String[] args) {

            Biblioteca libro = new Biblioteca("Cien años de soledad", "Gabriel García Márquez", "A-15");
            libro.prestarLibro();
            libro.devolucionLibro();
        }
    }

