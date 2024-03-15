package calculadora;

public class Calculadora {
    public int a, b;

    public int adicao(int a, int b) {
        this.a = a;
        this.b = b;
        return a + b;

    }

    public int subtracao(int a, int b) {
        this.a = a;
        this.b = b;
        return a - b;
    }

    public int multiplicacao(int a, int b) {
        this.a = a;
        this.b = b;
        return a * b;
    }

    public int divisao(int a, int b) {
        this.a = a;
        this.b = b;
        return a / b;
    }
}
