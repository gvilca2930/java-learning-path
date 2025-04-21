package oop;

public class Laptop {

    String marca;
    String modelo;
    String procesador;
    String memoria;
    int precio;
    String disco;
    int stock;
    boolean disponibilidad;

    public Laptop(String marca, String modelo, String procesador, String memoria, int precio, String disco, int stock, boolean disponibilidad){
        this.marca = marca;
        this.modelo = modelo;
        this.procesador = procesador;
        this.memoria = memoria;
        this.precio = precio;
        this.disco = disco;
        this.stock = stock;
        this.disponibilidad= disponibilidad;
    }

    public void consultarDatos(){
        System.out.println("El modelo de laptop es: " + modelo);
        System.out.println("Procesador: " + procesador);
        System.out.println("Memoria del dispositivo: " + memoria);
        System.out.println("El precio del dispositivo: " + precio);
        System.out.println("El tipo de disco es: " + disco);
        System.out.println("Cantidad en stock: " + stock);
        System.out.println("Disponibilidad: " + (consultarDisponibilidad() ? "Si":"No"));
    }

    public boolean consultarDisponibilidad(){
        return stock >= 1;
    }

    public void precioPublico(){
        double precioFinal = precio + (precio * 0.18);
        System.out.println("El precio de venta es: S:/" + precioFinal);
    }

    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("ACER", "ASPIRE 315", "Core i7 10th", "20GB", 3000, "1TB SSD", 1,false);
        laptop1.consultarDatos();  
        laptop1.precioPublico();      
    }
}