import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Funcionalidades {

    private Map<String, String> cartaMap;

    public Funcionalidades(Map<String, String> cartaMap) {
        this.cartaMap = cartaMap;
    }

    public void agregarNuevaCarta(Scanner scanner, Map<String, String> datosMapa) {
        System.out.println("\nAGREGAR NUEVA CARTA");        
        System.out.print("- Ingrese el nombre de la nueva carta que desee agregar: ");
        String nombre = scanner.nextLine();
        if(cartaMap.containsKey(nombre)){
            System.out.println("Error. Ya existe una carta con ese nombre. ");
        }
        else {
            System.out.print("- Ingrese el tipo de la nueva carta: ");
            String tipo = scanner.nextLine();
            tipo = tipo.substring(0, 1).toUpperCase() + tipo.substring(1);
            if(tipo.equals("Monstruo") || tipo.equals("Hechizo") || tipo.equals("Trampa")){
                cartaMap.put(nombre, tipo);
                try (BufferedWriter bw = new BufferedWriter(new FileWriter("cards_desc.txt",true))) {
                    String linea = nombre + "|" + tipo;
                    bw.write(linea);
                    bw.newLine();
                    
                } catch (IOException e) {
                    e.printStackTrace();
                }
    
                System.out.println("La carta ha sido agregada.");
            }
            else {
                System.out.println("Error. Ingrese un tipo válido existente (monstruo, trampa, hechizo)");
            }
        }
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
            System.out.println("    Nombre: " + entry.getKey() + " - Tipo: " + entry.getValue());
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
            System.out.println("    Tipo: " + entry.getKey() + " - Cantidad: " + entry.getValue());
        }
    }

    public void showToditas() {
        System.out.println("\nTODAS LAS CARTAS EXISTENTES");
        for (Map.Entry<String, String> entry : cartaMap.entrySet()) {
            System.out.println("    Nombre: " + entry.getKey() + " - Tipo: " + entry.getValue());
        }
    }

    public void showOrdenadasToditas(){
        System.out.println("TODAS LAS CARTAS, POR TIPO");
        for (Map.Entry<String, String> entry : cartaMap.entrySet()) {
            if (entry.getValue().equals("Hechizo")) {
                System.out.println("Hechizo: " + entry.getKey());
            }
        }
        for (Map.Entry<String, String> entry : cartaMap.entrySet()) {
            if (entry.getValue().equals("Trampa")) {
                System.out.println("Trampa: " + entry.getKey());
            }
        }
        for (Map.Entry<String, String> entry : cartaMap.entrySet()) {
            if (entry.getValue().equals("Monstruo")) {
                System.out.println("Monstruo: " + entry.getKey());
            }
        }
    }
    
    }
