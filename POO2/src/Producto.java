public class Producto {
        String nombre;
        double precio;

        //  Constructor utilizando this
        public Producto(String nombre, double precio) {
            this.nombre = nombre;
            this.precio = precio;
        }

        public void mostrarProducto() {
            System.out.println("Producto: " + nombre + " Precio: $" + precio);
        }
    }

