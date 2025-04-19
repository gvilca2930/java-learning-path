package basics;
import java.util.Scanner;


public class InputScanner {

    public static void main(String[] args) {
        
        String nombre;
        int edad;
        boolean trabajoActual;
        char inicial;

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        nombre = sc.nextLine();
        System.out.print("Ingresa tu edad: ");
        edad = sc.nextInt();
        System.out.print("Si trabajas ingresa (true), caso contrario (false): ");
        trabajoActual = sc.nextBoolean();
        System.out.print("Ingresa la letra inicial de tu nombre: ");
        inicial = sc.next().charAt(0);
        
        sc.close();

        System.out.println("****** Los datos ingresados son ******");
        System.out.println("El nombre del usuario es: "+nombre);
        System.out.println("La edad del usuario es: "+edad);
        System.out.println("La situacion laboral del usuario es: "+trabajoActual);
        System.out.println("La inicial de su nombre es: "+inicial);

    }
}