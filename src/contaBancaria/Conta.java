package contaBancaria;

public class Conta {
    private double saldo;
    public double valor;

    public double Depositar(double saldo, double valor) {
        return this.saldo + this.valor;
    }

    public double getSaldo() {
        return saldo;
    }
}
