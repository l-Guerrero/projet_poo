package bloqueH;

public class Curso {
    String nombre;
    int creditos;

    public static void main(String[]args) {

        // objeto 1
        Curso curso1 = new Curso();
        curso1.nombre = "Programación orientada a objetos";
        curso1.creditos = 4;

        // objeto 2
        Curso curso2 = new Curso();
        curso2.nombre = "Cáculo integral";
        curso2.creditos = 3;

        /* Aunque curso1 y curso2 tienen nombres y créditos diferentes los dos pertenecen a
        la misma clase y comparten la misma estructura y atributos. La clase es como una plantilla
        para los objetos, ambos siguen su estructura pero con sus propios valores.
         */
    }
}
