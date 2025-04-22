package exceptions;

public class AplicacionBancaria {

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(0);

        try {
            cuenta.depositar(1000);
            cuenta.verSaldo();
        } catch (MontoNegativoException e) {
            System.out.println("Error: " + e);
        }

        try {
            cuenta.retirar(100);
            cuenta.verSaldo();
        } catch (SaldoInsuficienteException e) {
            System.out.println("Error: " + e);
        }
    }
}