package contaBancaria;

public class Conta {
    private double saldo;

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        saldo = saldo + valor;

    }

    public String sacar(double valor) {
        if (saldo - valor >= 0) {
            saldo -= valor;
            return String.format("Saque de R$ %.2f realizado com sucesso.", valor);
        } else {
            return "Saldo insuficiente!";
        }

        public double consultar () {
            return saldo;
        }
    }
}