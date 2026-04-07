package bloqueB;

public class Vehiculob {
    String marca;
    String modelo;
    int velocidadActual;

    public void mostrarEstado(){
      System.out.println("estado del vehiculo:");
      System.out.println("Marca:" + marca);
      System.out.println("Modelo:" + modelo);
      System.out.println("VelocidadActual." + velocidadActual + "km/h");

    }
}
 class Main{
    public static void main(String[]args){
        // primer objeto
        Vehiculob x1 = new Vehiculob();
        x1. marca = "Toyota";
        x1.modelo = "Camry";
        x1.velocidadActual = 60;
        // segundo objeto
        Vehiculob x2 = new  Vehiculob();
        x2.marca = "Nissan";
        x2.modelo = "Versa";
        x2.velocidadActual = 100;
         // se muestra estado
        x1.mostrarEstado();
        x2.mostrarEstado();

    }

}
