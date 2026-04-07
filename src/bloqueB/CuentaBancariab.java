package bloqueB;

public class CuentaBancariab {
    String numero;
    String titular;
    double saldo;

    public void mostrarCuenta(){
        System.out.println("estado de la cuenta:");
        System.out.println("Numero:" + numero);
        System.out.println("Titular:" + titular);
        System.out.println("Saldo:" + "$" + saldo);
    }
}
class MainCuentaBancariab {
    public static void main(String[]args){
        // cuenta de Camila
        CuentaBancariab c1 = new CuentaBancariab();
        c1.titular = "Camila Lopez";
        c1.numero = "987-3334-234";
        c1.saldo = 250000;

        // Cuenta de Miguel
        CuentaBancariab c2 = new CuentaBancariab();
        c2.titular = "Miguel Mestra";
        c2.numero = "129-8057-011";
        c2.saldo = 345000;
        // aqui se ve como todos conservan sus valores
        System.out.println("Datos de la primera cuenta");
        c1.mostrarCuenta();

        System.out.println ("Datos de la segunda cuenta");
        c2.mostrarCuenta();
    }

}



