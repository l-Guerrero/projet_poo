package bloqueC;

public class Ejercicio14 {
    String numero;
    String titular;
    double saldo;

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
  class MainEjercicio14 {
    public static void main(String[]args) {
        // cuenta de Camila
        Ejercicio14 c1 = new Ejercicio14();
        c1.titular = "Camila Lopez";
        c1.numero = "987-3334-234";
        c1.saldo = 250000;

        // Cuenta de Miguel
        Ejercicio14 c2 = new Ejercicio14();
        c2.titular = "Miguel Mestra";
        c2.numero = "129-8057-011";
        c2.saldo = 345000;

        // prueba
        System.out.println("saldo inicial cuenta de Camila: $" + c1.saldo);
        c1.retirar(50000);
        System.out.println("saldo inicial cuenta Miguel: $" + c2.saldo);
        c2.retirar(400000);
        c1.mostrarCuenta();
        c2.mostrarCuenta();
    }
    }

