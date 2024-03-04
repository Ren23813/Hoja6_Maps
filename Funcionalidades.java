import java.util.Map;
import java.util.Scanner;

public class Funcionalidades {

    private Map<String, String> cartaMap;

    public Funcionalidades(Map<String, String> cartaMap) {
        this.cartaMap = cartaMap;
    }

    public void agregarNuevaCarta(Scanner scanner, Map<String, String> datosMapa) {
        System.out.println("\nAGREGAR NUEVA CARTAA");
        System.out.print("- Ingrese el nombre de la nueva carta que desee agregar: ");
        String nombre = scanner.nextLine();
        System.out.print("- Ingrese el tipo de la nueva carta: ");
        String tipo = scanner.nextLine();
        cartaMap.put(nombre, tipo);
        System.out.println("La carta ha sido agregada.");
    }

    public void buscarTipoCarta(Scanner scanner, Map<String, String> datosMapa) {
        System.out.println("\nBUSCAR CARTA");
        System.out.print("- Ingrese el nombre de la carta que desea buscar: ");
        String nombre = scanner.nextLine();
        String tipo = cartaMap.get(nombre);
        if (tipo != null) {
            System.out.println("\nEl tipo de la carta '" + nombre + "' es: " + tipo);
        } else {
            System.out.println("\nLa carta '" + nombre + "' no se ha encontrado.");
        }
    }
}
