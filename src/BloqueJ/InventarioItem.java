package BloqueJ;

public class InventarioItem {
        String nombre;
        int cantidad;
        double precioUnitario;

        // Constructor
        public InventarioItem(String nombre, int cantidad, double precioUnitario) {
            this.nombre = nombre;
            this.cantidad = cantidad;
            this.precioUnitario = precioUnitario;
        }
        public double calcularValorTotal() {
            return cantidad * precioUnitario;
        }
    }

        class MainInventario {
        public static void main(String[] args) {

            InventarioItem producto = new InventarioItem("Mouse inalámbrico", 150, 45.0);
            double total = producto.calcularValorTotal();
            System.out.println("Producto: " + producto.nombre);
            System.out.println("Valor total en stock: $" + total);
        }
    }

