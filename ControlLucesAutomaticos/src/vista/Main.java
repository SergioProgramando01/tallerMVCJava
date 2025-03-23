package vista;

import controlador.ControlLucesAutomaticos;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ControlLucesAutomaticos sistemaLuces = new ControlLucesAutomaticos();

        while (true) {
            System.out.println("\n💡 Bienvenido al Sistema de Control de Luces Automático");
            System.out.println("🔹 Problema: El sistema controla las luces de una casa.");
            System.out.println("   - Si es de noche y hay movimiento, las luces se encienden.");
            System.out.println("   - Si es de día o no hay movimiento, las luces se apagan.");
            System.out.println("   - La simulación toma lecturas en un bucle cada 10 segundos.");
            System.out.println("1️⃣ Iniciar el control de luces");
            System.out.println("2️⃣ Elegir otro ejercicio");
            System.out.println("3️⃣ Salir");
            System.out.print("🔹 Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    sistemaLuces.ejecutarSistema();
                    break;
                case 2:
                    System.out.println("🔄 Volviendo al menú de ejercicios...");
                    return; // Se puede conectar con otro menú principal
                case 3:
                    System.out.println("🚪 Saliendo del programa...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("❌ Opción no válida. Inténtelo de nuevo.");
            }
        }
    }
}
