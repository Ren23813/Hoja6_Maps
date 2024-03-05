import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

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

    public void showDesordenada() {
        System.out.println("\nCOLECCIÓN DE CARTAS (DESORDENADA)");
        for (Map.Entry<String, String> entry : cartaMap.entrySet()) {
            System.out.println("Nombre: " + entry.getKey() + ", Tipo: " + entry.getValue());
        }
    }

    public void showOrdenadaTipo() {
        System.out.println("\nCOLECCIÓN DE CARTAS (ORDENADA POR TIPO)");
        // las cartas por el tipo
        Map<String, Integer> tempMap = new TreeMap<>();
        // Contamos la cantidad de cada tipo de carta
        for (String tipo : cartaMap.values()) {
            tempMap.put(tipo, tempMap.getOrDefault(tipo, 0) + 1);
        }
        // cantidad
        for (Map.Entry<String, Integer> entry : tempMap.entrySet()) {
            System.out.println("Tipo: " + entry.getKey() + ", Cantidad: " + entry.getValue());
        }
    }

    public void showToditas() {
        System.out.println("\nTODAS LAS CARTAS EXISTENTES");
        for (Map.Entry<String, String> entry : cartaMap.entrySet()) {
            System.out.println("Nombre: " + entry.getKey() + ", Tipo: " + entry.getValue());
        }
    }

}
