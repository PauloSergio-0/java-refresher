package armazen.revisao.com;

import armazen.revisao.com.produto.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    private static Produto produto;

    public static void main(String[] args) {
        System.out.println("--Armazén--");

        System.out.println("Qual o nome do produto?");
        String nomeProduto = scanner.next();

        System.out.println("Qual o preço do produto?");

        double precoProduto = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Qual a quantidade do produto?");
        int qtdProduto = scanner.nextInt();
        scanner.nextLine();

        produto = new Produto(nomeProduto,precoProduto,qtdProduto);

        System.out.println(produto);

    }
}
