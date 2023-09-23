package metodos_arrays;
import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero;
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int sumaTotal = 0;
        int sumaPositivos = 0;
        int sumaNegativos = 0;
        
        System.out.println("Introduce números (ingresa -1 para terminar):");
        
        while (true) {
            numero = scanner.nextInt();
            
            if (numero == -1) {
                break;
            }
            
            // Verificar si el número es mayor o menor
            if (numero > mayor) {
                mayor = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
            
            // Sumar al total
            sumaTotal += numero;
            
            // Sumar a la suma de positivos o negativos
            if (numero >= 0) {
                sumaPositivos += numero;
            } else {
                sumaNegativos += numero;
            }
        }
        
        System.out.println("El mayor número introducido es: " + mayor);
        System.out.println("El menor número introducido es: " + menor);
        System.out.println("La suma de todos los números es: " + sumaTotal);
        System.out.println("La suma de los números positivos es: " + sumaPositivos);
        System.out.println("La suma de los números negativos es: " + sumaNegativos);
    }
}
