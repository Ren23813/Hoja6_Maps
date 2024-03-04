import java.util.Map;

public class FindMapType {
    public static <K, V> Map<K, V> createMap(String mapType) {
        switch (mapType.toLowerCase()) {
            case "hashmap":
                return new java.util.HashMap<>();
            case "treemap":
                return new java.util.TreeMap<>();
            case "linkedhashmap":
                return new java.util.LinkedHashMap<>();
            default:
                throw new IllegalArgumentException("El tipo de mapa seleccionado no es válido, " + mapType);
        }
    }
}
