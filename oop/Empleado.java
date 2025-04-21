package oop;

public class Empleado {

    private String nombre;
    private int edad;
    private double salario;


    //Getters
    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public double getSalario(){
        return salario;
    }

    //Setters

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setSalario(double salario){
        if (salario>=0) {
            this.salario=salario;
        }else{
            System.out.println("Ingrese un numero mayor a 0.");
        }
        
    }

    public static void main(String[] args) {
        Empleado empl1 = new Empleado();
        empl1.setNombre("George");
        empl1.setEdad(28);
        empl1.setSalario(-1);
        
        System.out.println(empl1.getNombre());;
        System.out.println(empl1.getEdad());;
        System.out.println(empl1.getSalario());;

    }
}