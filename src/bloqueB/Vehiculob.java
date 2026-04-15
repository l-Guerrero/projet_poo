package bloqueB;

public class Vehiculob {
    String marca, modelo;
    int velocidadActual;

    public Vehiculob(String marca, String modelo, int velocidadActual) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadActual = velocidadActual;
    }

    public Vehiculob(Vehiculob otro) {
        this.marca = otro.marca;
        this.modelo = otro.modelo;
        this.velocidadActual = otro.velocidadActual;
    }

    public void mostrarEstado() {
        System.out.println(marca + " " + modelo + " a " + velocidadActual + "km/h");
    }

    public static void main(String[] args) {
        Vehiculob x1 = new Vehiculob("Toyota", "Camry", 60);
        Vehiculob x2 = new Vehiculob(x1);

        x1.mostrarEstado();
        x2.mostrarEstado();
    }
}
