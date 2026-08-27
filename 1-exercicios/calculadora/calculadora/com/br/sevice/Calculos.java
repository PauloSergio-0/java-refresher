package calculadora.com.br.sevice;

public class Calculos {

    public static void adicao(Number numA, Number numB){

            if(numA instanceof Integer a && numB instanceof Integer b ){
                System.out.println(a + b);
            }else {
                System.out.println(numA.doubleValue() + numA.doubleValue());
            }
    }


    public static void subtracao(Number numA, Number numB){

            if(numA instanceof Integer a && numB instanceof Integer b ){
                System.out.println(a - b);
            } else {

                System.out.println(numA.doubleValue() - numA.doubleValue());
            }
    }

    public static void mutiplicacao(Number numA, Number numB){

        if(numA instanceof Integer a && numB instanceof Integer b ){
            System.out.println(a * b);
        } else {
            System.out.println(numA.doubleValue() * numA.doubleValue());
        }
    }

    public static void divisao(Number numA, Number numB){

        if(numA instanceof Integer a && numB instanceof Integer b ){
            System.out.println( a / b);
        } else {

            System.out.println( numA.doubleValue() / numA.doubleValue());
        }
    }

    public static void raizQuadrada(Number numA){

        System.out.println(Math.sqrt(Double.parseDouble(numA.toString())));
    }

}
