import java.util.Scanner;

public class Main {

    /**
     * Método principal, ejecuta el programa.
     * 
     * @param args
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Funcionalidades Funcionalidades = new Funcionalidades();

        String MapType = null;


        while(true){
            System.out.println("\n------------------------------------");
            System.out.println("\nIMPLEMENTACIÓN MAP");
            System.out.println("1. HashMap");
            System.out.println("2. TreeMap");
            System.out.println("3. LinkedHashMAp");

            System.out.print("\nIngrese la opción que desee: ");
          

            String op = scan.nextLine();

            switch(op){

                case "1":
                    //Implementación de HashMap
                    System.out.println("\nHashMap");
                    MapType = "HashMap";
                    System.out.println("Tipo de stack seleccionado: " + MapType);
                    break;
                
                case "2":
                    //Implementación de TreeMap
                    System.out.println("\nTreeMap");
                    MapType = "TreeMap";
                    System.out.println("Tipo de stack seleccionado: " + MapType);
                    break;

                case "3":
                    //Implementación de LinkedHashMap
                    System.out.println("\nLinkedHashMap");
                    MapType = "LinkedHashMap";
                    System.out.println("Tipo de stack seleccionado: " + MapType);
                    break;

                default:
                    System.out.println("\nLa opción ingresada no es válida.");
                    break;
                
                    
            }
            
        }


    }

}
