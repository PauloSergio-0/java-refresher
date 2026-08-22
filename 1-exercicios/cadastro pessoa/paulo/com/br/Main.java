package paulo.com.br;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    static String nome;
    static int idade;
    static double altura;



    public static void main(String[] args) {
        System.out.println("Qual o seu nome: ");
        nome = scanner.next();

        System.out.println("Qual a sua idade: ");
        idade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Qual a sua altura: ");
        altura = scanner.nextFloat();
        scanner.nextLine();


        if (idade >= 18){

            System.out.println("Seu nome é " + nome +"\nSua idade é " + idade + "\nSua Altura é " + String.format("%.2f",altura) + "\nVocê é maior de idade");
        } else {

            System.out.println("Seu nome é " + nome +"\nSua idade é " + idade + "\nSua Altura é " + String.format("%.2f",altura) + "\nVocê é menor de idade");

        }


    }
}
