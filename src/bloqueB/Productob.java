package bloqueB;

public class Productob {
    String nombre;
    double  precio;
    int stock;

    public void mostrarProducto(){
        System.out.println("Detalles del producto:");
        System.out.println("Nombre:" + nombre);
        System.out.println("Precio:" + precio);
        System.out.println("Stock:" + stock);
    }
}

class Mainproductob {
    public static void main(String[]args){

        // Objeto 1
        Productob m1 = new Productob();
        m1.nombre = "mesa";
        m1.precio = 350000;
        m1.stock = 25;

        // Objeto2
        Productob c2 = new Productob();
        c2.nombre = "cuaderno";
        c2.precio = 2500;
        c2.stock = 80;

        // Objeto3
        Productob b3 = new Productob();
        b3.nombre = "bicicleta";
        b3.precio = 150000;
        b3.stock = 15;

        // estado
        System.out.println("INVENTARIO");
        m1.mostrarProducto();
        c2.mostrarProducto();
        b3.mostrarProducto();

    }
}