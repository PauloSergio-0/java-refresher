package calculadora.com.br;


import calculadora.com.br.sevice.Calculos;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    public static int opcao;

    public static Number adcionarNumero(String tipoOperacao ) {
        while (true){
            try {

                if (tipoOperacao.isEmpty()) {

                    System.out.println("digite numero: ");
                    String numero = scanner.nextLine();

                    if (numero.contains(".")) {
                        double numeroReturn = Double.parseDouble(numero);
                        return numeroReturn;
                    } else {
                        int numeroReturn = Integer.parseInt(numero);
                        return numeroReturn;
                    }

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
                    int opcao = scanner.nextInt();
                    scanner.next();

                }catch (Exception e){
                    System.out.println("\nOperação não permitida\nDigitar apenas números\n");
                    continue;
                }

                if (opcao == 1){
                    Calculos.adicao(adcionarNumero(": "), adcionarNumero(": "));

                } else if (opcao == 0) {
                    System.out.println("Saindo...");
                    break;
                } else {
                    System.out.println("Operação não encontrada");
                }



        }
    }
}
