package oop;

public class Producto {

    protected String nombre;
    protected double precio;

    //Getters

    public String getNombre(){
        return nombre;
    }

    public double getPrecio(){
        return precio;
    }
    //Setters

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }
    //Metodos
    public void informacionProducto(){
        System.out.println(getNombre());
        System.out.println(getPrecio());
    }
}