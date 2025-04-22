package exceptions;

import java.util.Scanner;

public class AplicacionTemperatura {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int registroTemp;
        int cont = 0;

        RegistroTemperatura apptemp = new RegistroTemperatura();

        while (cont < 7) {
            System.out.print("Ingresa la temperatura #" + (cont + 1) + ": ");
            try {
                registroTemp = sc.nextInt();
                apptemp.registarTemperatura(registroTemp);
                apptemp.verTemperatura();
                cont += 1;
            } catch (TemperaturaInvalidaException e) {
                System.out.println("⚠️ Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("⚠️ Entrada no válida. Intenta de nuevo.");
                sc.nextLine();
            }
        }

        sc.close();
    }
}
