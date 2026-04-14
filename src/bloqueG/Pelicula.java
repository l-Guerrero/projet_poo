package bloqueG;

public class Pelicula {
        // Atributos solicitados
        String nombre;
        String genero;
        int minutos;

        // Constructor
        public Pelicula(String nombre, String genero, int minutos) {
            this.nombre = nombre;
            this.genero = genero;
            this.minutos = minutos;
        }

        public void mostrarFicha() {
            System.out.println("Ficha: ");
            System.out.println("Película: " + nombre);
            System.out.println("Género: " + genero);
            System.out.println("Duración: " + minutos + " minutos");
        }
    }
    class MainPelicula {
    public static void main(String[] args) {

        Pelicula pelicula = new Pelicula("El conjuro", "Terror", 135);
        pelicula.mostrarFicha();
    }
}

