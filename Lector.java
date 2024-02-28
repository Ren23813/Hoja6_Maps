import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Lector {

    String archivo = "cards_desc.txt";

    public String[] leerDatosArchivo(String archivo) {

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String line;

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;

    }

}
