package treino;

public class Calculadora {
    public static void main(String[] args) {
        int v1 = 10;
        int v2 = 2;
        char op = 'a';
        switch (op){
            case 'a':
                System.out.format("Soma: %d%n", v1 + v2);
                break;
            case 's':
                System.out.format("Subtracao: %d%n", v1 - v2);
                break;
            case 'm':
                System.out.format("Multiplicacao: %d%n", v1 * v2);
                break;
            case 'd':
                if (v2 != 0) {
                    System.out.format("Divisao: %d%n", v1 / v2);
                } else {
                    System.out.println("Divisão por zero é impossível");
                }
                break;
            default:
                System.out.println("Operacao invalida");
        }
    }
}
