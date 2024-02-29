package estruturas;

import java.util.Scanner;

public class ExerEstruturaRepeticao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//
//        // https://docentes.ifrn.edu.br/nickersonferreira/disciplinas/programacao-estruturada-e-orientada-a-objetos
//
////
////        //    1) Escreva um algoritmo que exiba 20 vezes a mensagem “Eu gosto de estudar
//////    Algoritmos!”.
////        int i;
////        for (i = 0; i <= 15; i++) {
////            System.out.println("Eu gosto de estudar Algoritmos!");
////        }nt i = 0; i <= 15; i++) {
////            sum += i;
////
////        2) Escreva um algoritmo que calcule a soma dos números de 1 a 15.
////        int sum = 0;
////        for (i
////        }
////        System.out.println(sum);
//
//////        3) Leia o nome do usuário e escreva o nome dele na tela 10 vezes.
////        System.out.println("Digite seu nome: ");
////        String nome = scan.next();
////        for (int i = 0; i < 10; i++){
////            System.out.println(nome);
////        }
//
////        4) Leia o nome um número do usuário um número N e escreva o nome dele na tela N
////        vezes.
////        System.out.println("Digite um nome: ");
////        String nome = scan.next();
////        System.out.println("Digite um número: ");
////        int numero = scan.nextInt();
////        for (int i = 0; i < numero; i++) {
////            System.out.println(nome);
////        }
//
////        5) Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses
////        números.
////        int soma = 0;
////        for (int i = 1; i <= 10; i++) {
////            int numero;
////            System.out.println(i + ". Digite um número : ");
////            numero = scan.nextInt();
////            soma += numero;
////
////        }
////        System.out.println("A soma dos números é: "+soma);
//
//
//////        6) Leia a idade de 20 pessoas e exiba a soma das idades.
////        int somaIdade = 0;
////        int sum = 0;
////        for(int i = 0; i < 20; i++){
////            System.out.println("Digite sua idade: ");
////            somaIdade = scan.nextInt();
////            sum += somaIdade;
////
////        }
////        System.out.println(sum);
//
////        // 7) Leia a idade de 20 pessoas e exiba a média das idades.
////        int somaIdade = 0;
////        int idade;
////        int mediaIdade = 0;
////        for (int i = 1; i <= 20; i++) {
////            System.out.println(i + ".Digite sua idade: ");
////            idade = scan.nextInt();
////            somaIdade += idade;
////
////            mediaIdade = somaIdade / 20;
////
////
////        }
////        System.out.println("A média das idades é: " + mediaIdade);
//
////        8) Leia a idade de 20 pessoas e exiba quantas pessoas são maiores de idade
////        int idade;
////        int idadeMaior = 0;
////
////        for (int i = 1; i <= 20; i++) {
////            System.out.println(i + ".Digite sua idade: ");
////            idade = scan.nextInt();
////            if (idade >= 18) {
////                idadeMaior +=1;
////            }
////        }
////        System.out.println("A quantidade de maiores de idade é: " + idadeMaior);
//
//        // 9) Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova
////        int idadeMaisNovo = Integer.MAX_VALUE;
////        String nomeNovo = "";
////        for (int i = 1; i < 10; i++) {
////            System.out.println("Digite seu nome: ");
////            String nome = scan.nextLine();
////            System.out.println("Digite sua idade: ");
////            int idade = scan.nextInt();
////            scan.nextLine(); // Limpar buffer para o próximo input
////
////            if (idade < idadeMaisNovo) {
////                idadeMaisNovo = idade;
////                nomeNovo = nome;
////            }
////
////        }
////        System.out.println("A pessoa mais nova é " + nomeNovo + " com " + idadeMaisNovo + " anos.");
//
////        10) Crie um algoritmo leia um número do usuário e exiba a sua tabuada de
////        multiplicação.
////        int numero;
////        System.out.println("Digite um número: ");
////        numero = scan.nextInt();
////        for (int i = 1; i <= 10; i++) {
////            int multi = numero * i;
////
////            System.out.format(numero + " x " + i + " = %d%n", multi);
////        }
//        ;
//////        11) Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são
//////        maiores do que 8.
////        int numero = 0;
////        int numeroMaior = 0;
////        for (int i = 1; i <= 20; i++) {
////            System.out.println(i + ".Digite um número: ");
////            numero = scan.nextInt();
////            if (numero > 8) {
////                numeroMaior += 1;
////            }
////        }
////        System.out.println("A quantidade de numeros maiores que 8 é: " + numeroMaior);
//
////        12) Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são
////        pares
////        int numPar = 0;
////        int numero = 0;
////        for (int i = 1; i <= 20; i++) {
////            System.out.println(i + ".Digite um numero: ");
////            numero = scan.nextInt();
////
////            if (numero % 2 == 0) {
////                numPar += 1;
////            }
////        }
////        System.out.println("A quantidade de números pares é: " + numPar);
//
//       13) Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e
//      100.
//        int numeros = 0;
//        int numEntre = 0;
//
//        for (int i = 1; i <= 20; i++) {
//            System.out.println(i + ".Digite um número: ");
//            numeros = scan.nextInt();
//
//            if (numeros > 0 && numeros < 100) {
//                numEntre += 1;
//            }
//        }
//        System.out.println("A quantidade de números entre 0 e 100 é: " + numEntre);
//
//        14) Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e
//        100, quantos estão entre 101 e 200 e quantos são maiores de 200.
//        int numeros;
//        int quantNum = 0;
//        int quantNum2 = 0;
//        int quantNum3 = 0;
//        for (int i = 1; i <= 20; i++) {
//            System.out.println(i + ".Digite um número: ");
//            numeros = scan.nextInt();
//
//            if (numeros > 0 && numeros < 100) {
//                quantNum += 1;
//            }
//            if (numeros >= 101 && numeros <= 200) {
//                quantNum2 += 1;
//            }
//
//            if (numeros > 200) {
//                quantNum3 += 1;
//            }
//
//        }
//        System.out.println("A quantidade de números entre 0 e 100  é: " + quantNum);
//        System.out.println("A quantidade de números entre 101 e 200 é: " + quantNum2);
//        System.out.println("A quantidade de números maior que 200 é: " + quantNum3);

//15) Escreva um algoritmo que leia uma sequência de números do usuário e realize a
//        soma desses números. Encerre a execução quando um número negativo for digitado.


        System.out.println("Digite a quantidade de numeros da sua sequencia: ");
        int seqNumero = scan.nextInt();

        if (seqNumero <= 0) {
            System.out.println("Valor inválido, tente novamente!");
            System.exit(1);
        }


        int somatorio = 0;

        for (int i = 1; i <= seqNumero; i++) {
            System.out.println(i + ".Digite um numero: ");
            int numero = scan.nextInt();
            if (numero < 0) {
                System.out.println("Valor inválido. Tent novamente!");
                break;
            } else {
                somatorio += numero;
            }
        }
        System.out.println("A soma atual dos números é: " + somatorio);

    }
}