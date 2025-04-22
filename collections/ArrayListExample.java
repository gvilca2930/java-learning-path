package collections;
import java.util.ArrayList;


public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<String> productos = new ArrayList<>();

        productos.add("Gaseosas");
        productos.add("Frappes");
        productos.add("Helados");
        productos.add("Pizzas");
        productos.add("Salchipapas");

        System.out.println("Tamaño: " + productos.size());
        System.out.println("Primer elemento: " + productos.get(0));
        System.out.println("Elementos: " + productos);

        productos.remove(0);
        System.out.println("Elementos: " + productos);
        System.out.println("Primer elemento: " + productos.get(0));
    }
}