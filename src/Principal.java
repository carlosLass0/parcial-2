
import java.util.Scanner;


public class Principal {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        Automovil automovil = null;
        Sedan sedan = null;
        ChevroletSail chevroletSail = null;
        Moto moto = null;
        Sport sport = null;

        do {
            System.out.println("****** CONCESIONARIO CAUCANA DE VEHÍCULOS S.A.");
            System.out.println("******* REGISTRO DE VEHÍCULOS VENDIDOS**");
            System.out.println("1. Registro de automóviles");
            System.out.println("2. Registro de motos");
            System.out.println("3. Vendedor");
            System.out.println("4. Salir");
            System.out.print("Ingrese la opción deseada: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Registro de automóviles
                    // Implementación del registro de automóviles
                    break;
                case 2:
                    // Registro de motos
                    // Implementación del registro de motos
                    break;
                case 3:
                    // Información del vendedor
                    System.out.println("Nombre del vendedor: [Nombre y Apellido]");
                    break;
                case 4:
                    // Salir del programa
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
                    break;
            }
        } while (opcion != 4);

        scanner.close();
    }
}
   
