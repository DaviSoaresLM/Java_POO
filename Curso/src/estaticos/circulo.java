package estaticos;

import java.util.Scanner;

public class circulo {
    public static final double PI = 3.14;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dite o radianos: ");
        double radius = sc.nextDouble();

//        double c = cincuferencia(radius);

        double v = volume(radius);

        System.out.printf("Circunferência: ", c);
        System.out.printf("Volume: ", v);


    }
}
