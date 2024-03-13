package retangulo;

import java.util.Scanner;

public class MainRetangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        System.out.println("Digite o tamanho da altura e da base do retângulo: ");
        retangulo.altura = sc.nextDouble();
        retangulo.base = sc.nextDouble();

        System.out.printf("Área = %.2f%n", retangulo.area());
        System.out.printf("Perímetro =  %.2f%n", retangulo.perimetro());
        System.out.printf("Diagonal = %.2f%n", retangulo.diagonal());
    }
}
