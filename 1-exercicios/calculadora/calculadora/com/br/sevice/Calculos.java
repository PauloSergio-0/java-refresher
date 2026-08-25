package calculadora.com.br.sevice;

public class Calculos {

    public static Number adicao(Number numA, Number numB){

            if(numA instanceof Integer a && numB instanceof Integer b ){
                return a + b;
            }

        return numA.doubleValue() + numA.doubleValue();
    }


    public Number subtracao(Number numA, Number numB){

            if(numA instanceof Integer a && numB instanceof Integer b ){
                return a - b;
            }

        return numA.doubleValue() - numA.doubleValue();
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
