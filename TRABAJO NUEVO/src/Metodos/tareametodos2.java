package Metodos;
import java.util.Scanner;

public class tareametodos2 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();

        mostrarMensajeSegunDigitos(numero);

        scanner.close();
    }

    public static void mostrarMensajeSegunDigitos(int numero) {
        if (numero >= 1 && numero <= 9) {
            System.out.println("Ha ingresado un número de un dígito.");
        } else if (numero >= 10 && numero <= 99) {
            System.out.println("Ha ingresado un número de dos dígitos.");
        } else if (numero >= 100 && numero <= 999) {
            System.out.println("Ha ingresado un número de tres dígitos.");
        } else {
            System.out.println("El número ingresado no está en el rango de 1 a 999.");
        }
    }
}

