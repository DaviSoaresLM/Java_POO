package exercicios;

import java.util.Scanner;

public class MainRetangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();
        double altura = retangulo.altura;
        double base = retangulo.base;
        double area = retangulo.area();
        double perimetro = retangulo.perimetro();
        double diagonal = retangulo.diagonal();


        System.out.println("Digite a altura e a base do retângulo: ");
        altura = sc.nextDouble();
        base = sc.nextDouble();
        retangulo.area();

        System.out.printf("Area = %.2f%n", retangulo.area());
        System.out.printf("Perímetro =  %.2f%n", retangulo.perimetro());
        System.out.printf("Diagonal = %.2f%n", retangulo.diagonal());


    }
}
