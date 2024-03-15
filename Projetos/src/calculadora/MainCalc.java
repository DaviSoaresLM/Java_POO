package calculadora;

import java.util.Scanner;

public class MainCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        int a = calc.a;
        int b = calc.b;


        System.out.println("Olá! Escolha a opção que deseja: ");
        System.out.println("1 - Adição\n" + "2 - Subtração\n" + "3 - Multiplicação\n" + "4 - Divisão");
        int escolha = scan.nextInt();
        System.out.println("Digite os valores que deseja realizar a operação: ");
        a = scan.nextInt();
        b = scan.nextInt();


        switch (escolha) {
            case 1:
                System.out.println(calc.adicao(a, b));
                break;

            case 2:
                System.out.println(calc.subtracao(a, b));
                break;

            case 3:
                System.out.println(calc.multiplicacao(a, b));
                break;
            case 4:

                System.out.println(calc.divisao(a, b));
                break;
        }
    }
}

