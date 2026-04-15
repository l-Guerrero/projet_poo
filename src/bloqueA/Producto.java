package bloqueA;

public class Producto {
    String nombre;
    double  precio;
    int stock;

        public Producto(String nombre, double precio, int stock) {
            this.nombre = nombre;
            this.precio = precio;
            this.stock = stock;
        }
        // Ejercicio 72
        public static Producto crearProducto(String nombre, double precio, int stock) {
            return new Producto(nombre, precio, stock);
        }
        public void mostrarProducto() {
            System.out.println("Producto: " + nombre + " Precio: $" + precio + "  Stock: " + stock);
        }

        public static void main(String[] args) {
            Producto miItem = Producto.crearProducto("Laptop", 1200.50, 10);

            miItem.mostrarProducto();
        }
    }





