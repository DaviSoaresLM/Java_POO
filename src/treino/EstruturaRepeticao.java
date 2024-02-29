package treino;

public class EstruturaRepeticao {
    public static void main(String[] args) {
//        int valor = 10;
//        int fatorial = 1;
//        while (valor > 1) {
//            fatorial *= valor;
//            valor --;
//
//        }
//        System.out.println(fatorial);

//        int numero = 8;
//        int limite = 10;
//        int i = 1;
//        System.out.println("Tabuada de " + numero);
//
//        do {
//            System.out.format("%d x %d = %d%n", numero, i, (numero * i));
//            i++;
//        } while (i <= limite);

//        int numero = 8;
//        int limite = 10;
//        System.out.println("Tabuada de " + numero);
//
//        for (int i = 1; i <= limite; i++) {
//            System.out.format("%d x %d = %d%n", numero, i, (numero * i));
//        }


//        int[] vetor1;
//        int[] vetor2 = new int[3];
//        int[] vetor3 = {10, 20, 30};
//
//        vetor1[0] = 1;
//        vetor2[0] = 1;
//        vetor3[0] = 1;
//
//        int soma = 0;
//        for (int i = 0; i < vetor3.length; i++) {
//            soma += vetor3[i];
//        }
//        System.out.println(soma);

//        int[] vetor = {10, 20, 30, 40, 50};
//        int soma = 0;
//        // for-each : para cada
//        for (int elemento : vetor) {
//            soma += elemento;
//        }
//        System.out.println(soma);

        System.out.println("break");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.format("%d, ", i);
        }
        System.out.println("\ncontinue");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.format("%d, ", i);
        }

    }
}
