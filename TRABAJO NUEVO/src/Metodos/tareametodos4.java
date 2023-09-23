package Metodos;
import java.util.Scanner;

public class tareametodos4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numeroAlumnos = numeroAlumnos(scanner);
        double[] alturas = leerAlturas(scanner, numeroAlumnos);
        double media = calcularMedia(alturas);
        
        mostrarResultados(alturas, media);
        
        scanner.close();
    }
    
    public static int numeroAlumnos(Scanner scanner) {
        System.out.print("Ingresa el número de alumnos: ");
        return scanner.nextInt();
    }
    
    public static double[] leerAlturas(Scanner scanner, int numAlumnos) {
        double[] alturas = new double[numAlumnos];
        for (int i = 0; i < numAlumnos; i++) {
            System.out.print("Ingresa la altura del alumno " + (i + 1) + " en centímetros: ");
            alturas[i] = scanner.nextDouble();
        }
        return alturas;
    }
    
    public static double calcularMedia(double[] alturas) {
        double suma = 0.0;
        for (double altura : alturas) {
            suma += altura;
        }
        return suma / alturas.length;
    }
    
    public static void mostrarResultados(double[] alturas, double media) {
        int masAltos = 0;
        int masBajos = 0;
        
        System.out.println("Alturas de los alumnos:");
        for (int i = 0; i < alturas.length; i++) {
            System.out.println("Alumno " + (i + 1) + ": " + alturas[i] + " cm");
            if (alturas[i] > media) {
                masAltos++;
            } else if (alturas[i] < media) {
                masBajos++;
            }
        }
        
        System.out.println("Altura media de la clase: " + media + " cm");
        System.out.println("Alumnos más altos que la media: " + masAltos);
        System.out.println("Alumnos más bajos que la media: " + masBajos);
    }
}
