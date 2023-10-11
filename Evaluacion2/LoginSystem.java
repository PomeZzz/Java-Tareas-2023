package Evaluacion2;


import java.util.HashMap;
import java.util.Scanner;

public class LoginSystem {
    private static HashMap<String, String> users = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Opciones:");
            System.out.println("1. Ingresar");
            System.out.println("2. Registro");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                    login();
                    break;
                case 2:
                    register();
                    break;
                case 3:
                    System.out.println("Saliendo del programa.");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        }
    }

    public static void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre de usuario: ");
        String username = scanner.nextLine();
        System.out.print("Ingrese su contraseña: ");
        String password = scanner.nextLine();

        if (users.containsKey(username) && users.get(username).equals(password)) {
            System.out.println("Inicio de sesión exitoso. ¡Bienvenido, " + username + "!");
        } else {
            System.out.println("Nombre de usuario o contraseña incorrectos.");
        }
    }

    public static void register() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un nombre de usuario: ");
        String username = scanner.nextLine();

        if (users.containsKey(username)) {
            System.out.println("Error: El usuario ya existe.");
        } else {
            System.out.print("Ingrese una contraseña (mínimo 8 caracteres): ");
            String password = scanner.nextLine();

            if (password.length() < 8) {
                System.out.println("Error: La contraseña debe tener al menos 8 caracteres.");
            } else {
                users.put(username, password);
                System.out.println("Registro exitoso. Ahora puede iniciar sesión.");
            }
        }
    }
}