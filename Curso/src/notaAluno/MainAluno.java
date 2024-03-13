package notaAluno;

import java.util.Scanner;

public class MainAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalcN notas = new CalcN();

        System.out.println("Digite o nome do aluno: ");
        notas.nome = sc.nextLine();

        System.out.println("Digite as 3 notas: ");
        notas.nota1 = sc.nextDouble();
        notas.nota2 = sc.nextDouble();
        notas.nota3 = sc.nextDouble();

        System.out.printf("Resultado Final: %.2f%n", notas.calculoNotas());

        if (notas.calculoNotas() < 60.0) {
            System.out.println("Reprovado");
            System.out.printf("Pontos necessários: %.2f%n", notas.notaNecessaria());
        } else {
            System.out.println("Passou!");

        }

    }
}
