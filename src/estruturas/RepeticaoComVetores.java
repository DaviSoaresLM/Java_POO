package estruturas;

import java.util.Scanner;

public class RepeticaoComVetores {
    public static void main(String[] args) throws InterruptedException {
        // Cálculo da média do vetor
//        int[] vetor1 = {13, 25, 43, 78, 33};
//        int somaVetor1 = 0;
//        for (int i = 0; i < vetor1.length; i++) {
//            somaVetor1 += vetor1[i];
//        }
//        System.out.println("A média do vector1 é " + (float) somaVetor1 / vetor1.length);

        // Cálculo da média do vetor2
//        int[] vetor2 = {54, 82, 26, 51, 26};
//        int somaVetor2 = 0;
//        for (int valor : vetor2) {
//            somaVetor2 += valor;
//        }
//        System.out.println("A média do vetor2 é " + (float) somaVetor2 / vetor2.length);



        //vetor1 na ordem inversa
//        int[] vetor1 = {13,25,43,78,33};
//        System.out.println("Vetor1 na ordem inversa: ");
//        for (int i = vetor1.length-1; i>= 0;i--){
//            System.out.format("%d, ", vetor1[i]);
//        }
//        System.out.println();


        // Soma de dois vetores
//        int[] vetor1 = {13,25,43,78,33};
//        int[] vetor2 = {54,82,26,51,26};
//        int[] vetorSoma = new int[5];
//        for (int i = 0; i < vetor1.length;i++){
//            vetorSoma[i] = vetor1[i] + vetor2[i];
//        }
//        for (int valor : vetorSoma) {
//            System.out.format("%d, ", valor);
//        }
//        System.out.println();

        // exibição de menu console
        int op;
        Scanner scan = new Scanner(System.in);
        do {
            clearScreen();
            System.out.println("1 - Jogar");
            System.out.println("2 - Sair");
            System.out.println("Opção desejada: ");
            op = scan.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Jogando... ");
                    Thread.sleep(2000);
                    System.out.println("Acabou o jogo!");
                    break;
                case 2:
                    System.out.println("Saindo...");
                    break;
            }
        } while (op != 2);
        scan.close();
        System.out.println("Saiu!");
    }

    private static void clearScreen() {
    }
}
