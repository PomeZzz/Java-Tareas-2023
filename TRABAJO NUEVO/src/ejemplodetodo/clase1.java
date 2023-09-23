package ejemplodetodo;

import java.util.Scanner;

public class clase1 {
    public void codigo1() {
        Scanner scanner = new Scanner(System.in);
        String nombre;

        System.out.println("Ingrese nombres (ingrese '/1' para salir):");

        while (true) {
            nombre = scanner.nextLine();
            if (nombre.equals("/1")) {
                break;
            }
            System.out.println("Nombre ingresado: " + nombre);
        }

        System.out.println("Fin del programa.");
    }
}

