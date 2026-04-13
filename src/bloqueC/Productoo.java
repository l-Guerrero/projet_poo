package bloqueC;

public class Productoo {
    String nombre;
    double precio;
    int stock;

    // Ejercicio 31 fábrica estático
    public static Productoo
    crearProductoBasico(String nombre, double precio) {
        Productoo nuevoProducto = new Productoo();
        nuevoProducto.nombre = nombre;
        nuevoProducto.precio = precio;
        nuevoProducto.stock = 5;
        return nuevoProducto;
    }
    public void mostrarProducto() {
        System.out.println("Detalles del producto:");
        System.out.println("Nombre:" + nombre);
        System.out.println("Precio:" + precio);
        System.out.println("Stock:" + stock);
    }
    // Ejercicio 23 y 26
    public Productoo() {
    }
    // Ejercicio 24 y 26
    public Productoo(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // metodo vender y descontar del stock
    public void vender(int cantidad) {
        if (cantidad <= stock) {
            stock = stock - cantidad;
            System.out.println("Venta exitosa: Se vendieron " + cantidad + " " + nombre + ".");
        } else {
            System.out.println(" Error: Stock insuficiente para " + nombre + ", solo hay " + stock + ".");
        }
    }

    // se suma al stock
    public void reabastecer(int cantidad) {
        stock = stock + cantidad;
        // se suma al stock actual
        System.out.println(" Ingreso de " + nombre + ": Se agregaron " + cantidad + " Unidades al inventario.");
    }
}
class MainProductoo {
    public static void main(String[] args) {

        // Objeto 1
        Productoo m1 = new Productoo();
        m1.nombre = "mesas";
        m1.precio = 350000;
        m1.stock = 25;

        // Objeto2
        Productoo c2 = new Productoo();
        c2.nombre = "cuadernos";
        c2.precio = 2500;
        c2.stock = 80;

        // Objeto3
        Productoo b3 = new Productoo();
        b3.nombre = "bicicletas";
        b3.precio = 150000;
        b3.stock = 15;

        // Ejercicio 25 y 26
            Productoo tv = new Productoo();
            tv.nombre = "Televisor 4k";
            tv.precio = 120000;
            tv.stock = 26;
            // con parametros
        Productoo tec = new Productoo("teclado", 86000, 35);

        // Ejercicio 32 con el metodo crear dos productos
        Productoo mar = Productoo.crearProductoBasico("Marcadores", 1700);
        Productoo car = Productoo.crearProductoBasico("Cartulina", 5000);

        // cambios en el inventario
        System.out.println("Movimientos en el iventario");
        b3.vender(20);
        b3.reabastecer(50);

        c2.vender(18);
        c2.reabastecer(30);

        m1.vender(50);
        m1.reabastecer(100);

        tv.vender(12);
        tv.reabastecer(30);

        tec.vender(1);
        tec.reabastecer(10);

        mar.vender(200);
        mar.reabastecer(300);

        car.vender(150);
        car.reabastecer(400);
        
        // resultado final
        System.out.println("Inventario final");
        m1.mostrarProducto();
        c2.mostrarProducto();
        b3.mostrarProducto();
        tv.mostrarProducto();
        tec.mostrarProducto();
        mar.mostrarProducto();
        car.mostrarProducto();
    }
}

