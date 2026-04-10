package bloqueC;

public class Ejercicio16 {
    String nombre;
    double precio;
    int stock;

    public void mostrarProducto() {
        System.out.println("Detalles del producto:");
        System.out.println("Nombre:" + nombre);
        System.out.println("Precio:" + precio);
        System.out.println("Stock:" + stock);
    }

    // metodo vender y descontar del stock
    public void vender(int cantidad) {
        if (cantidad <= stock) {
            stock = stock - cantidad;
            System.out.println("Venta exitosa: Se vendieron " + cantidad + " " + nombre + ".");
        } else {
            System.out.println(" Error: Stock insuficiente para " + nombre + ", solo hay " + stock);
        }
    }

    // se suma al stock
    public void reabastecer(int cantidad) {
        stock = stock + cantidad;
        // se suma al stock actual
        System.out.println(" Ingreso de " + nombre + ": Se agregaron " + cantidad + " Unidades al inventario.");
    }
}
class MainEjercicio16 {
    public static void main(String[] args) {

        // Objeto 1
        Ejercicio16 m1 = new Ejercicio16();
        m1.nombre = "mesas";
        m1.precio = 350000;
        m1.stock = 25;

        // Objeto2
        Ejercicio16 c2 = new Ejercicio16();
        c2.nombre = "cuadernos";
        c2.precio = 2500;
        c2.stock = 80;

        // Objeto3
        Ejercicio16 b3 = new Ejercicio16();
        b3.nombre = "bicicletas";
        b3.precio = 150000;
        b3.stock = 15;

        // cambios en el inventario
        System.out.println("Movimientos en el iventario");
        b3.vender(20);
        b3.reabastecer(50);
        b3.vender(20);

        // resultado final
        System.out.println("Inventario final");
        m1.mostrarProducto();
        c2.mostrarProducto();
        b3.mostrarProducto();
    }
}

