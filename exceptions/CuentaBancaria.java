package exceptions;


public class CuentaBancaria {
    private double saldo;

    //Constructor
    public CuentaBancaria(double saldoInicial){
        this.saldo = saldoInicial;
    }

    //Metodo para realizar deposito

    public void depositar(double monto) throws MontoNegativoException {
        if (monto < 0) {
            throw new MontoNegativoException("El monto a despositar no puede ser negativo.");
        }
        saldo += monto;
        System.out.println("Deposito realizado: " + monto);
    }

    public void retirar(double monto) throws SaldoInsuficienteException {
        if (monto > saldo) {
            throw new SaldoInsuficienteException("No hay suficiente saldo.");
        }
        saldo -= monto;
        System.out.println("Retiro realizado: " +monto);
    }

    public void verSaldo(){
        System.out.println("Saldo actual: " + saldo);
    }

}