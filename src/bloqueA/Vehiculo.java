package bloqueA;

public class Vehiculo {
    String marca;
     String modelo;
     int velocidadActual;

    public void mostrarEstado(){
        System.out.println ("estado del vehiculo:");
        System.out.println ("Marca:" + marca);
        System.out.println("Modelo:" + modelo);
        System.out.println("VelocidadActual:" + velocidadActual + "km/h");
    }
}
