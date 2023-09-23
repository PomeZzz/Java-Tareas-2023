package Metodos;

import java.util.Scanner;

public class tareametodos3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el nombre del hardware: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingresa la marca del hardware: ");
        String marca = scanner.nextLine();

        System.out.print("Ingresa el precio del hardware en pesos: ");
        double precio = scanner.nextDouble();

        double precioFinal = aplicarRecargo(precio);

        System.out.println("Detalles del hardware:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Marca: " + marca);
        System.out.println("Precio Original: " + precio + " pesos");
        System.out.println("Precio Final: " + precioFinal + " pesos");

        scanner.close();
    }

    public static double aplicarRecargo(double precio) {
        if (precio > 10000) {
            precio = precio + (precio * 0.16);
        }
        return precio;
    }
}
