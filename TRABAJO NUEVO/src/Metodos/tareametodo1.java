package Metodos;

import java.util.Scanner;

public class tareametodo1 {
     public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        
        System.out.print("Ingresa tu apellido: ");
        String apellido = scanner.nextLine();

        
        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();

      
        mostrarDatosUsuario(nombre, apellido, edad);

        
        scanner.close();
    }

    
    public static void mostrarDatosUsuario(String nombre, String apellido, int edad) {
        System.out.println("Datos del usuario:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
    }
}

