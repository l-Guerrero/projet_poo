package bloqueL;

public class PedidoCafe {
        String tipoCafe;
        String tamaño;
        double precio;

        public PedidoCafe(String tipoCafe, String tamaño, double precio) {
            this.tipoCafe = tipoCafe;
            this.tamaño = tamaño;
            this.precio = precio;
        }

        public void prepararPedido() {
            System.out.println("Preparando un " + tipoCafe + " tamaño " + tamaño);
        }

        public void entregarPedido() {
            System.out.println("Pedido listo. El total a pagar es: $" + precio);
            System.out.println("¡Gracias por su compra!");
        }

        public static void main(String[] args) {
            PedidoCafe Orden = new PedidoCafe("Capuchino", "Extragrande", 40.0);
            Orden.prepararPedido();
            Orden.entregarPedido();
        }
    }

