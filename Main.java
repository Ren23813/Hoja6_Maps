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
            System.out.println("\n Bienvenido al programa de registro de cartas. Por favor, seleccione cómo quiere implementar los Maps.");
            System.out.println("1. HashMap");
            System.out.println("2. TreeMap");
            System.out.println("3. LinkedHashMAp");
            System.out.println("4. Acciones adicionales");
            System.out.println("5. Salir");

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
                case "4":
                    //Segunda parte
                    if (MapType == null){
                        System.out.println("Por favor, seleccione previamente el tipo de implementación que desea.");
                    }
                    else{
                        System.out.println("Indique lo que desea hacer: ");
                        System.out.println("1. Agregar una nueva carta. ");
                        System.out.println("2. Buscar el tipo de una carta específica. ");
                        System.out.println("3. Mostrar nombre, tipo y cantidad de todas las cartas de su colección (desordenado)");
                        System.out.println("4. Mostrar nombre, tipo y cantidad de todas las cartas de su colección, ordenadas según su tipo");
                        System.out.println("5. Mostrar todas las cartas existentes del juego. ");
                        System.out.println("6. Mostrar todas las cartas existentes del juego, ordenadas según su tipo. \n");

                        String op2 = scan.nextLine();
                        switch (op2) {
                            case "1":
                                System.out.println("Usted seleccionó la opción de agregar una nueva carta para su colección. ");
                                System.out.println("Indique los datos que se le solicitan: ");

                                break;
                            case "2":
                                System.out.println("Usted seleccionó la opción de búsqueda de tipo por carta");
                                System.out.println("Indique los datos que se le solicitan: ");

                                break;
                            case "3":
                                System.out.println("Usted seleccionó la opción de mostrar su colección (desordenada)");

                                break;
                            case "4":
                                System.out.println("Usted seleccionó la opción de mostrar su colección, según tipo");
                                System.out.println("Indique los datos que se le solicitan: ");

                                break;
                            case "5":
                                System.out.println("Usted seleccionó la opción de mostrar todas las cartas existentes (desordenada). ");
                            
                                break;
                            case "6":
                                System.out.println("Usted seleccionó la opción demostrar todas las cartas del juego, ordenadas según tipo.");

                                break;

                            default:
                                System.out.println("Opción no válida.");;
                                break;
                        }
                    }
                    break;
                case "5":
                    System.out.println("Saliendo... ");
                    System.exit(0);
                default:
                    System.out.println("\nLa opción ingresada no es válida.");
                    break;
                
                    
            }
            
        }


    }

}
