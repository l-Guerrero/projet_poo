package bloqueC;

import bloqueB.Vehiculob;

public class Vehiculoc {
    String marca;
    String modelo;
    int velocidadActual;

    public void mostrarEstado(){
        System.out.println("estado del vehiculo:");
        System.out.println("Marca:" + marca);
        System.out.println("Modelo:" + modelo);
        System.out.println("VelocidadActual." + velocidadActual + "km/h");
}
    // Se aumenta la velocidad en 10
public void acelerar() {
    velocidadActual = velocidadActual + 10;
  }
}
class MainVehiculoc {
    public static void main(String[] args) {
        // primer objeto
        Vehiculoc x1 = new Vehiculoc();
        x1.marca = "Toyota";
        x1.modelo = "Camry";
        x1.velocidadActual = 60;
        // segundo objeto
        Vehiculoc x2 = new Vehiculoc();
        x2.marca = "Nissan";
        x2.modelo = "Versa";
        x2.velocidadActual = 100;
        // se muestra estado
        x1.mostrarEstado();
        x2.mostrarEstado();
            System.out.println("Ejecutando Aceleración");
            x1.acelerar();
            x2.acelerar();
            System.out.println("Estado del vehículo después de acelerar:");
            x1.mostrarEstado();
            x2.mostrarEstado();
    }
}
