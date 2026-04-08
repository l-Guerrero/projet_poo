package bloqueC;

public class Vehiculof {
    String marca;
    String modelo;
    int velocidadActual;

    public void mostrarEstado() {
        System.out.println("estado del vehiculo:");
        System.out.println("Marca:" + marca);
        System.out.println("Modelo:" + modelo);
        System.out.println("VelocidadActual." + velocidadActual + "km/h");
    }

    // Se aumenta la velocidad en 10
    public void acelerar() {
        velocidadActual = velocidadActual + 10;
}
// frenar sin que sea negativa
    public void frenar(){
    velocidadActual = velocidadActual - 10;
    if (velocidadActual < 0) {
        velocidadActual = 0;
    }
    }
}
class MainVehiculof {
    public static void main(String[] args) {
        // primer objeto
        Vehiculof x1 = new Vehiculof();
        x1.marca = "Toyota";
        x1.modelo = "Camry";
        x1.velocidadActual = 60;
        // segundo objeto
        Vehiculof x2 = new Vehiculof();
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
        // frenar
        System.out.println("Frenado");
        x1.frenar();
        System.out.println(" Estado despues de frenar x1");
        x1.mostrarEstado();
        x1.velocidadActual = 6;
        System.out.println("Frenado desde 6 km/h:");
        x1.frenar();
        x1.mostrarEstado();
    }

    }