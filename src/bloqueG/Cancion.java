package bloqueG;

public class Cancion {

    String titulo;
    String artista;
    String duracion;

    // Constructor
    public Cancion(String titulo, String artista, String duracion) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
    }

    public void mostrarInfo() {
        System.out.println("Información de la Canción");
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Duración: " + duracion);
    }
}
    class MainCancion {
        public static void main(String[] args) {

            Cancion cancion = new Cancion("Confieso", "Kany García", "3:48 minutos");

            cancion.mostrarInfo();
        }
    }


