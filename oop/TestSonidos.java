package oop;
public class TestSonidos {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.hacerSonido();

        Animal joey = new Perro();
        joey.hacerSonido();
    
        Animal reese = new Gato();
        reese.hacerSonido();
    }
}