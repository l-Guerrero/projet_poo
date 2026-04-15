public class CuentaBancaria {
        String numeroCuenta;
        double saldo;
        String tipoCuenta;

        // 1. Constructor por defecto
        public CuentaBancaria() {
            this.numeroCuenta = "0000";
            this.saldo = 0.0;
            this.tipoCuenta = "Ahorros";
        }

        // Constructor con dos parámetros
        public CuentaBancaria(String numeroCuenta, String tipoCuenta) {
            this.numeroCuenta = numeroCuenta;
            this.tipoCuenta = tipoCuenta;
            this.saldo = 0.0; //  por defecto
        }

        // Constructor sobrecargado
        public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
            this.numeroCuenta = numeroCuenta;
            this.saldo = saldo;
            this.tipoCuenta = tipoCuenta;
        }

        public void mostrarDatos() {
            System.out.println("Cuenta: " + numeroCuenta + "  Tipo: " + tipoCuenta + "  Saldo: $" + saldo);
        }

        public static void main(String[] args) {
            // Probando los tres constructores
            CuentaBancaria c1 = new CuentaBancaria();
            CuentaBancaria c2 = new CuentaBancaria("123-456", "Corriente");
            CuentaBancaria c3 = new CuentaBancaria("987-654", 500000.50, "Ahorros");

            c1.mostrarDatos();
            c2.mostrarDatos();
            c3.mostrarDatos();
        }
    }

