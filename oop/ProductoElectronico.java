package oop;

public class ProductoElectronico extends Producto{
    private String marca;

    //Getters

    public String getMarca(){
        return marca;
    }

    //Setters

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void informacionProducto(){
        super.informacionProducto();
        System.out.println("Marca: " + getMarca());
    }

}