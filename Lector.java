import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

public class Lector {

    String archivo = "cards_desc.txt";

    public <K, V> Map<K, V> leerDatosArchivo(Map<K, V> tipoMapa) {

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] partes = line.split("\\|");
                if (partes.length >= 2) {
                    K clave = (K) partes[0]; 
                    V valor = (V) partes[1];
                    tipoMapa.put(clave, valor);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return tipoMapa;

    }

}
