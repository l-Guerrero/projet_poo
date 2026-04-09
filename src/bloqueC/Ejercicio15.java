package bloqueC;

import bloqueB.Productob;

public class Ejercicio15 {
    String nombre;
    double  precio;
    int stock;

    public void mostrarProducto() {
        System.out.println("Detalles del producto:");
        System.out.println("Nombre:" + nombre);
        System.out.println("Precio:" + precio);
        System.out.println("Stock:" + stock);
    }
  // metodo vender y descontar del stock
   public void vender(int cantidad) {
    if (cantidad <= stock){
        stock = stock - cantidad;
        System.out.println("Venta exitosa: Se vendieron "  + cantidad + " " +  nombre);
    } else {
        System.out.println(" Error: Stock insuficiente para " + nombre + ", solo hay " + stock);

    }
    }
}
class MainEjercicio15 {
    public static void main(String[] args) {

        // Objeto 1
        Ejercicio15 m1 = new Ejercicio15();
        m1.nombre = "mesas";
        m1.precio = 350000;
        m1.stock = 25;

        // Objeto2
        Ejercicio15 c2 = new Ejercicio15();
        c2.nombre = "cuadernos";
        c2.precio = 2500;
        c2.stock = 80;

        // Objeto3
        Ejercicio15 b3 = new Ejercicio15();
        b3.nombre = "bicicletas";
        b3.precio = 150000;
        b3.stock = 15;

        // pruebas de ventas
        m1.vender(20);
        c2.vender(100);
        b3.vender(15);

        // estado final
        System.out.println("INVENTARIO");
        m1.mostrarProducto();
        c2.mostrarProducto();
        b3.mostrarProducto();
    }
}
