package oop;

public class TestTienda {

    public static void main(String[] args) {
        ProductoElectronico producto1 = new ProductoElectronico();

        producto1.setNombre("Laptop");
        producto1.setPrecio(7500);
        producto1.setMarca("ACER");

        producto1.informacionProducto();
    }
}