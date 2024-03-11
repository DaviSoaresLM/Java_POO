package contaBancaria;

import java.util.Scanner;

public class UserBank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o saldo inicial da sua conta: ");
        double saldoInicial = scan.nextDouble();

        // Passando o saldo inicial ao criar a instância da conta
        Conta conta = new Conta(saldoInicial);

        System.out.println("Selecione o número da opção que deseja:\n" +
                "1 - Depositar;\n" +
                "2 - Sacar;\n" +
                "3 - Consultar Saldo;\n ");

        int escolha = scan.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Digite quanto deseja depositar: ");
                double deposito = scan.nextDouble();
                conta.depositar(deposito);
                System.out.printf("Valor R$ %.2f depositado com sucesso!", deposito);
                break;

            case 2:
                System.out.println("Digite quanto deseja sacar: ");
                double saque = scan.nextDouble();
                String resultadoSaque = conta.sacar(saque);
                System.out.println(resultadoSaque);
                break;

            case 3:
                System.out.printf("Seu saldo atual é de: R$ %.2f", conta.consultar());
                break;

            default:
                System.out.println("Opção inválida");
        }
    }
}
