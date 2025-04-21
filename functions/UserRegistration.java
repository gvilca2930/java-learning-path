package functions;

public class UserRegistration {

    public static void main(String[] args) {
        mostrarRegistroUsuario("George", 28, false);
    }

    public static void mostrarRegistroUsuario(String nombre, int edad, boolean activo){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("¿Activo?: " + ( activo ? "Si" : "No"));

    }
}