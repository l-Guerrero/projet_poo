package bloqueA;

public class CuentaBancaria {
    String numero;
     String titular;
     double saldo;

   public void mostrarCuenta(){
       System.out.println("estado de la cuenta:");
       System.out.println("Numero:" + numero);
       System.out.println("Titular:" + titular);
       System.out.println("Saldo:" + saldo + "$");
}
}