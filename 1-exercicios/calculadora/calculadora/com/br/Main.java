package calculadora.com.br;


import calculadora.com.br.sevice.Calculos;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    public static int opcao;

    public static Number adcionarNumero(String tipoOperacao) {
        while (true){
            try {

                System.out.println("digite numero" + tipoOperacao);
                String numero = scanner.nextLine();

                if (numero.contains(".")) {
                    return Double.parseDouble(numero);
                } else {
                    return Integer.parseInt(numero);
                }

            } catch (Exception e) {
                System.out.println("Apenas números");

            }
        }
    }

    public static void main(String[] args) {
        while (true){
            System.out.println("==Calculadora==");
            System.out.println("""
                    1. Adição
                    2. Subtração
                    3. Multiplicação
                    4. Divisão
                    5. Raiz quadrada
                    0. Sair
                    """);
                try {
                    opcao = scanner.nextInt();
                    scanner.nextLine();
                }catch (Exception e){
                    System.out.println("\nOperação não permitida\nDigitar apenas números\n");
                    scanner.nextLine();
                    continue;
                }

                if (opcao == 1){
                    Calculos.adicao(adcionarNumero("A: "), adcionarNumero("B: "));

                } else if (opcao == 2) {
                    Calculos.subtracao(adcionarNumero("A: "), adcionarNumero("B: "));
                }else if (opcao == 3) {
                    Calculos.mutiplicacao(adcionarNumero("A: "), adcionarNumero("B: "));
                }else if (opcao == 4) {
                    Calculos.divisao(adcionarNumero("A: "), adcionarNumero("B: "));
                }else if (opcao == 5) {
                    Calculos.raizQuadrada(adcionarNumero(": "));
                } else if (opcao == 0) {
                    System.out.println("Saindo...");
                    break;
                } else {
                    System.out.println("Operação não encontrada");

                }

        }
    }
}
