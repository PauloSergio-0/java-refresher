package triangulos.com.br.entities;

public class Triangulo {

    private static double ladoA;
    private static double ladoB;
    private static double ladoC;

    public static void setLadoA(double ladoA) {
        Triangulo.ladoA = ladoA;
    }

    public static void setLadoB(double ladoB) {
        Triangulo.ladoB = ladoB;
    }

    public static void setLadoC(double ladoC) {
        Triangulo.ladoC = ladoC;
    }

    public static double getLadoA() {
        return ladoA;
    }

    public static double getLadoB() {
        return ladoB;
    }

    public static double getLadoC() {
        return ladoC;
    }

    @Override
    public String toString() {
        return "lado A: " + getLadoA()+"\nlado B: " + getLadoB()+"\nlado C: " + getLadoC();
    }
}
