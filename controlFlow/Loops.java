package controlFlow;
import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        int numero;
        int inicio = 1;
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i<11;i++){
            System.out.println("Numero: "+i);
        }

        while (inicio <= 20) {
            if ((inicio%2)==0) {
                System.out.println("Numero par: "+inicio);    
            }
            inicio++;
        }
        do {
            System.out.print("Ingresa un numero para imprimirlo, si quiere detenerlo ingresa (0): ");
            while (!sc.hasNextInt()){
                System.out.println("Entrada no válida. Intenta nuevamente:");
                sc.next();
            }
            numero = sc.nextInt();
            System.out.println("El numero ingresado es: "+numero);
        }while(numero != 0);

        sc.close();
        }
}
