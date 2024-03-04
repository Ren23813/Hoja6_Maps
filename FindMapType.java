import java.util.Map;

public class FindMapType {
    public static <K, V> Map<K, V> createMap(String mapType) {
        switch (mapType.toLowerCase()) {
            case "HashMap":
                return new java.util.HashMap<>();
            case "TreeMap":
                return new java.util.TreeMap<>();
            case "LinkedHashMap":
                return new java.util.LinkedHashMap<>();
            default:
                throw new IllegalArgumentException("El tipo de mapa seleccionado no es válido, " + mapType);
        }
    }
}
