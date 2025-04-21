package functions;

public class Calculator {

    public static void main(String[] args) {
        int a = 7;
        int b = 5;

        System.out.println("Resultado de la suma: " + sumar(a, b));
        System.out.println("Resultado de la multiplicacion: " + multiplicar(a, b));
    }

    public static int sumar(int a, int b){
        return (a + b);
    }

    public static int multiplicar(int a, int b){
        return (a * b);
    }
}