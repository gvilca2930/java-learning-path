package controlFlow;
import java.util.Scanner;


public class IfElse {

    public static void main(String[] args) {
        int edad;

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        if (sc.hasNextInt()){
            edad = sc.nextInt();

            if (edad >=18){
                System.out.println("Eres mayor de edad");
            }else if (edad >=13) {
                System.out.println("Eres un adolecente");
            }else{
                System.out.println("Eres un niño");
            }

        }else{
            System.out.println("Ingresa un numero valido.");
        }
        sc.close();

    }
}