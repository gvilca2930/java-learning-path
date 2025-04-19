package controlFlow;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero del 1-7: ");
        if (sc.hasNextInt()) {
            
            numero = sc.nextInt();

            switch (numero) {
                case 1:
                    System.out.println("El dia de la semana es Lunes");
                    break;
                
                case 2:
                    System.out.println("El dia de la semana es Martes");
                    break;
                case 3:
                    System.out.println("El dia de la semana es Miercoles");
                    break;
                case 4:
                    System.out.println("El dia de la semana es Jueves");
                    break;
                case 5:
                    System.out.println("El dia de la semana es Viernes");
                    break;
                case 6:
                    System.out.println("El dia de la semana es Sabado");
                    break;
                case 7:
                    System.out.println("El dia de la semana es Domingo");
                    break;
                default:
                    System.out.println("No es un dia de la semana");
                    break;
            }

        }else{
            System.out.println("Número fuera del rango (1-7). No corresponde a un día de la semana.");
        }
        sc.close();
    }
}