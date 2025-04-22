package files;
import java.io.FileWriter;



public class WriterFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("files/archivo.txt");
            writer.write("Cafe - 5.50\n");
            writer.write("Pizza - 5.50\n");
            writer.write("Gaseosa - 5.50\n");
            writer.write("Te - 5.50\n");
            writer.write("Helado - 5.50");
            writer.close();
            System.out.println("Archivo escrito exitosamente.");
        } catch (Exception e) {
            System.out.println("Ocurrio un error al escribir.");
            e.printStackTrace();
        }
    }
    
}