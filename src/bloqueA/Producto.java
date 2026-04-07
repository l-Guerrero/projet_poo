package bloqueA;

public class Producto {
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

