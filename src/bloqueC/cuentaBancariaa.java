package bloqueC;

public class cuentaBancariaa {
    String numero;
    String titular;
    double saldo;
    //ejercicio 27
      public cuentaBancariaa(){
      }
    public cuentaBancariaa(String numero, String titular, double saldoInicial){
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void mostrarCuenta() {
        System.out.println("estado de la cuenta:");
        System.out.println("Numero:" + numero);
        System.out.println("Titular:" + titular);
        System.out.println("Saldo:" + "$" + saldo);
    }
    // consignar
    public void consignar(double valor) {
        saldo = saldo + valor;
        }
        // valida si hay saldo disponible y retira
        public void retirar(double valor) {
            if (valor<= saldo){
                saldo = saldo - valor;
                System.out.println("Retiro exitoso:$" + valor);
            } else {
                System.out.println("Saldo insuficiente para hacer el retiro: $" + valor);
             }
    }
}
  class MaincuentaBancariaa {
    public static void main(String[]args) {

            // cuenta de Camila
            cuentaBancariaa c1 = new cuentaBancariaa();
            c1.titular = "Camila Lopez";
            c1.numero = "987-3334-234";
            c1.saldo = 250000;

            // Cuenta de Miguel
            cuentaBancariaa c2 = new cuentaBancariaa();
            c2.titular = "Miguel Mestra";
            c2.numero = "129-8057-011";
            c2.saldo = 345000;

        // ejercicio 28 crear tres cuentas usando el constructor
        cuentaBancariaa c3 = new cuentaBancariaa("111-222-333", "Mariana Perez", 437000);
        cuentaBancariaa c4 = new cuentaBancariaa("345-986-025", "Mario Cardenas", 1309000);
        cuentaBancariaa c5 = new cuentaBancariaa("933-277-223", "Victor Cruz", 890000);


        // prueba
        System.out.println("saldo inicial cuenta de Camila: $" + c1.saldo);
        c1.retirar(50000);
        System.out.println("saldo inicial cuenta Miguel: $" + c2.saldo);
        c2.retirar(400000);
        System.out.println("saldo inicial cuenta Mariana:  $" + c3.saldo );
        System.out.println("Saldo inicial cuenta Mario: $" + c4.saldo);
        System.out.println("Saldo inicial cuenta Victor: $" + c5.saldo);
        c1.mostrarCuenta();
        c2.mostrarCuenta();
        c3.mostrarCuenta();
        c4.mostrarCuenta();
        c5.mostrarCuenta();
    }
    }

