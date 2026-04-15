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

         }

        // Ejercicio 69
        public static void main (String[]args){

            PedidoCafe pedido1 = new PedidoCafe("Tinto", "Pequeño", 10.50);
            PedidoCafe pedido2 = new PedidoCafe("Latte", "Grande", 40.50);
            PedidoCafe pedido3 = new PedidoCafe("Capuchino", "Mediano", 30.80);
            PedidoCafe pedido4 = new PedidoCafe("Mocaccino", "Grande", 50.00);
            PedidoCafe pedido5 = new PedidoCafe("Americano", "Pequeño", 20.00);

            System.out.println("Lista de Pedidos del Día");
            pedido1.entregarPedido();
            pedido2.entregarPedido();
            pedido3.entregarPedido();
            pedido4.entregarPedido();
            pedido5.entregarPedido();

            PedidoCafe Orden = new PedidoCafe("Capuchino", "Extragrande", 40.0);
            Orden.prepararPedido();
            Orden.entregarPedido();
            System.out.println("¡Gracias por su compra!");
        }
    }

