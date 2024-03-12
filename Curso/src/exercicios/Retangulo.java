package exercicios;

public class Retangulo {
    public double base;
    public double altura;

    public double area() {
        return altura * base;

    }
    public double perimetro() {
        return 2 * (altura + base);
    }

    public double diagonal() {
        return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));

    }
}

