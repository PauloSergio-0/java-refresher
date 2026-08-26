package calculadora.com.br.sevice;

public class Calculos {

    public static void adicao(Number numA, Number numB){

            if(numA instanceof Integer a && numB instanceof Integer b ){
                System.out.println(a + b);
            }

        System.out.println(numA.doubleValue() + numA.doubleValue());
    }


    public static void subtracao(Number numA, Number numB){

            if(numA instanceof Integer a && numB instanceof Integer b ){
                System.out.println(a - b);
            }

        System.out.println(numA.doubleValue() - numA.doubleValue());
    }

    public Number mutiplicacao(Number numA, Number numB){

        if(numA instanceof Integer a && numB instanceof Integer b ){
            return a * b;
        }

        return numA.doubleValue() * numA.doubleValue();
    }

    public Number divisao(Number numA, Number numB){

        if(numA instanceof Integer a && numB instanceof Integer b ){
            return a / b;
        }

        return numA.doubleValue() / numA.doubleValue();
    }

    public double raizQuadrada(double numA){

        return Math.sqrt(numA);
    }

}
