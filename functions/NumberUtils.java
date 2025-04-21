package functions;

public class NumberUtils {

    public static void main(String[] args) {

        int numero = 4;
        int numero1 = 3;
        int numero2 = -7;
        int numero3 = 0;

        System.out.println("¿El numero " + numero + " es par?: " + esPar(numero));
        System.out.println("¿El numero " + numero1 + " es par?: " + esPar(numero1));
        System.out.println("¿El numero " + numero2 + " es par?: " + esPar(numero2));
        System.out.println("¿El numero " + numero3 + " es par?: " + esPar(numero3));
    }

    public static boolean esPar(int numero){
        return numero % 2 == 0;
    }
}