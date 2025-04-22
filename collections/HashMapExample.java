package collections;
import java.util.HashMap;


public class HashMapExample {

    public static void main(String[] args) {
        
        HashMap<String, Double> productos = new HashMap<>();
        productos.put("Cafe",7.70);
        productos.put("Frappes",10.20);
        productos.put("Gaseosa",7.80);
        productos.put("Pizza",9.90);

        System.out.println(productos);
        System.out.println(productos.get("Cafe"));
        if (!productos.containsKey("Te Verde")) {
            System.out.println("El producto no existe.");
        }

        productos.remove("Cafe");
        System.out.println(productos);

        for (var entry : productos.entrySet()){
            System.out.println("Productos: " + entry.getKey() + " , Precio: S/. " + entry.getValue());
        }
    }
}