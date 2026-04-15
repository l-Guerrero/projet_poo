package bloquek;
/*  Atributos: NombreProducto, Precio, categoria
Metodos: VenderProducto, descuento
 objeto: "monitor" "250" "tecnologia"*/

        public class Tienda {
        String nombreProducto;
        double precio;
        String categoria;

        public Tienda(String nombreProducto, double precio, String categoria) {
            this.nombreProducto = nombreProducto;
            this.precio = precio;
            this.categoria = categoria;
        }

        public void venderProducto() {
            System.out.println("Vendido: " + nombreProducto + " por un valor de $" + precio);
        }

        public void aplicarDescuento(double porcentaje) {
            double descuento = precio * (porcentaje / 100);
            precio = precio - descuento;
            System.out.println("Se aplicó un descuento del " + porcentaje + "%. Nuevo precio: $" + precio);
        }

        public static void main(String[] args) {
            // Ejemplo de un objeto real
            Tienda producto = new Tienda("Monitor", 2500.0, "Tecnología");

            // Ejecución de las acciones
            producto.venderProducto();
            producto.aplicarDescuento(50);
        }
    }

