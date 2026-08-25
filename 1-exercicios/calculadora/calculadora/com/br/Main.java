package calculadora.com.br;


import calculadora.com.br.sevice.Calculos;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    public static int opcao ;

    public Number adcionarNumero(String tipoOperacao ){

        if(tipoOperacao.isEmpty())

        System.out.println("");
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

                }catch (Exception e){
                    System.out.println("\nOperação não permitida\nDigitar apenas números\n");
                    continue;
                }

                if (opcao == 1){
                    Calculos.adicao();
                }



        }
    }
}
