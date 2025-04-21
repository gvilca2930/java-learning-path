package functions;

public class Overloading {

    public static void main(String[] args) {
        mostrarProducto("Asus Vivobook X150");
        mostrarProducto("Asus Vivobook X150",7500);
        mostrarProducto("Asus Vivobook X150", 7500, 3);
    }

    public static void mostrarProducto(String nombre){
        System.out.println("Nombre del producto: "+ nombre);
    }

    public static void mostrarProducto(String nombre, double precio){
        System.out.println("Nombre del producto: " + nombre);
        System.out.println("Precio del producto: " + precio);
    }

    public static void mostrarProducto(String nombre, double precio, int stock){
        System.out.println("Nombre del producto: "+ nombre);
        System.out.println("Precio del producto: " + precio);
        System.out.println("Stock del producto: " + stock);
    }
}