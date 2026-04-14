package BloqueJ;

public class FacturaSimple {
         int numero;
         String cliente;
         double valor;

        // Constructor
        public FacturaSimple(int numero, String cliente, double valor) {
            this.numero = numero;
            this.cliente = cliente;
            this.valor = valor;
        }

        // descuento
        public double aplicarDescuento() {
            return valor - (valor * 0.10);
        }

        public void mostrarFactura() {
            System.out.println("Número: " + numero);
            System.out.println("Cliente: " + cliente);
            System.out.println("Valor original: $" + valor);
            System.out.println("Valor con descuento: $" + aplicarDescuento());
        }

        public static void main(String[] args) {
            FacturaSimple factura = new FacturaSimple(101, "Juan Pérez", 500.0);
            factura.mostrarFactura();
        }
    }

