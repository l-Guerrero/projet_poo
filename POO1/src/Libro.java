public class Libro {
        String titulo;
        String autor;
        int numeroPaginas;

        public Libro() {
            this.titulo = "Sin titulo";
            this.autor = "Desconocido";
            this.numeroPaginas = 0;
        }

        public Libro(String titulo, String autor, int numeroPaginas) {
            this.titulo = titulo;
            this.autor = autor;
            this.numeroPaginas = numeroPaginas;
        }

        public void mostrarDetalles() {
            System.out.println("Libro: " + titulo + " Autor: " + autor + "  Paginas: " + numeroPaginas);
        }

        public static void main(String[] args) {
            Libro libro1 = new Libro();
            Libro libro2 = new Libro("Cien años de soledad", "Gabriel Garcia Marquez", 550);

            libro1.mostrarDetalles();
            libro2.mostrarDetalles();
        }
    }

