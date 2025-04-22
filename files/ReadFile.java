package files;
import java.io.BufferedReader;
import java.io.FileReader;


public class ReadFile {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("files/archivo.txt"));
            String linea;
            while ((linea = reader.readLine()) !=null) {
                System.out.println(linea);                
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("Error al leer el archivo.");
            e.printStackTrace();
        }
    }
}