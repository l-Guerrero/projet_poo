package bloqueD;

public class Computadora {
    String marca;
    String procesador;
    int ram;
}
class mainComputadora {
    public static void main(String[] args) {
        Computadora pc1 = new Computadora();
        pc1.marca = "Dell"; // igual
        pc1.procesador = "i5";
        pc1.ram = 8;

        // objeto 2
        Computadora pc2 = new Computadora();
        pc2.marca = "Dell"; // igual
        pc2.procesador = "i9";
        pc2.ram = 32;
        System.out.println("Computadora 1: " + pc1.marca + " con " + pc1.procesador + " y " + pc1.ram + " de ram");
        System.out.println("Computadora 2: " + pc2.marca + " con " + pc2.procesador + " y " + pc2.ram+ " de ram");
        // Tienen la misma marca pero se diferencian en los demás datos
    }
}