package aplicacao;

import entidade.Pessoa;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pessoa pessoa[] = new Pessoa[5];
        pessoa[0] = new Pessoa("João", 20);
        pessoa[1] = new Pessoa("Maria", 35);
        pessoa[2] = new Pessoa("Carlos", 13);
        pessoa[3] = new Pessoa("Victor", 32);
        pessoa[4] = new Pessoa("Larissa", 16);
        int contador = 1;

        for (Pessoa vetor : pessoa) {
            System.out.println("Pessoa : " + contador + ", " + vetor);
            contador++;
        }

        System.out.println("Digite um nome: ");
        String nome = sc.next();
        contador = 0;

        for (Pessoa vetor : pessoa) {
            if (nome.equals(vetor.getNome())) {
                System.out.println("O nome : " + nome + " Foi ebcontrado no índice : " + (contador));
                System.out.println("Idade dessa pessoa : " + vetor.getIdade());

            } else {
                System.out.println("O nome " + nome + " não foi encontrado no índice : " + (contador));
                contador++;
            }
        }

    }
}
