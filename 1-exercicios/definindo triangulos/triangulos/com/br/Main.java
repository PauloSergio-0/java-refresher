package triangulos.com.br;

import triangulos.com.br.entities.Triangulo;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        Triangulo triangulo = new Triangulo();

        System.out.println("Triangulo");

        System.out.println("lado A: ");
        double a = scanner.nextDouble();
        scanner.nextLine();
        triangulo.setLadoA(a);

        System.out.println("lado B: ");
        double b = scanner.nextDouble();
        scanner.nextLine();
        triangulo.setLadoB(b);

        System.out.println("lado C: ");
        double c = scanner.nextDouble();
        scanner.nextLine();
        triangulo.setLadoC(c);


        System.out.println(triangulo);
    }
}
