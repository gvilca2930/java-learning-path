package basics;
public class Operadores {

    public static void main(String[] args) {
        double a = 10;
        double b = 9.9;
        boolean tieneTrabajo = false;
        boolean esEstudiante = true;

        double suma = a + b;
        double resta = a - b;
        double multiplicacion = a * b;
        double division = a / b;
        double modulo = a % b;
        boolean igualdad = a==b;
        boolean mayor = a > b;
        boolean menor = a < b;

        System.out.println("La suma de los valores es: "+suma);
        System.out.println("La resta de los valores es: "+resta);
        System.out.println("La multiplicacion de los valores es: "+multiplicacion);
        System.out.println("La division de los valores es: "+division);
        System.out.println("El modulo de los valores es: "+modulo);

        System.out.println("¿El valor de a es igual al valor de b?: "+igualdad);
        System.out.println("¿El valor de a es mayor al valor de b?: "+mayor);
        System.out.println("¿El valor de a es menor al valor de b?: "+menor);
        
        System.out.println("¿Trabaja y estudia? : " + (tieneTrabajo && esEstudiante));
        System.out.println("¿Trabaja o estudia? : " + (tieneTrabajo || esEstudiante));
        System.out.println("¿No estudia? : "+ (!esEstudiante));
    }
}