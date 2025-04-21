package oop;

public class Person {

    String nombre;
    int edad;
    String genero;

    public Person(String nombre, int edad, String genero){
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }
    public static void main(String[] args) {
        Person p = new Person("George",33,"Masculino");
        p.presentarse();
        System.out.println("¿Es mayor de edad?: " + (p.esMayorDeEdad() ? "Si" : "No"));
    }

    public void presentarse(){
        System.out.println("Mi nombres es: " + nombre + ".");
        System.out.println("Tengo " + edad + " años de edad.");
        System.out.println("Soy del genero " + genero + ".");
    }

    public boolean esMayorDeEdad(){
        return edad >= 18;
    }

}