package bloqueC;

import bloqueB.CuentaBancariab;

public class Ejercicio13 {
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
     public void consignar(double valor)
     {
         saldo = saldo + valor;
     }
     }
class MainEjercicio13 {
    public static void main(String[]args){
        // cuenta de Camila
        Ejercicio13 c1 = new Ejercicio13();
        c1.titular = "Camila Lopez";
        c1.numero = "987-3334-234";
        c1.saldo = 250000;

        // Cuenta de Miguel
        Ejercicio13 c2 = new Ejercicio13();
        c2.titular = "Miguel Mestra";
        c2.numero = "129-8057-011";
        c2.saldo = 345000;
        // aqui se ve como todos conservan sus valores
        System.out.println("Datos de la primera cuenta");
        c1.mostrarCuenta();

        System.out.println ("Datos de la segunda cuenta");
        c2.mostrarCuenta();
        //prueba
        c1.consignar(50000);
        c1.mostrarCuenta();
        c2.consignar(90000);
        c2.mostrarCuenta();
    }

}

