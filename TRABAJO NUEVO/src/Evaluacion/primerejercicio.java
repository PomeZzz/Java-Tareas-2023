package Evaluacion;

import java.util.Scanner;

public class primerejercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int capacidadSala = 40;
        int totalPersonas = 0;
        int numNinosMenor4 = 0;
        int numNinosEntre4y12 = 0;
        int numAdultos = 0;
        int cajaTotal = 0;
        
        System.out.println("Bienvenido al cine");
        System.out.println("Ingrese la edad de las personas (-1 para terminar):");
        
        while (totalPersonas < capacidadSala) {
            int edad = scanner.nextInt();
            
            if (edad == -1) {
                break;
            }
            
            if (edad < 4) {
                numNinosMenor4++;
                totalPersonas++;
            } else if (edad >= 4 && edad <= 12) {
                numNinosEntre4y12++;
                totalPersonas++;
                cajaTotal += 250;
            } else {
                numAdultos++;
                totalPersonas++;
                cajaTotal += 450;
            }
        }
        
        int personasNoEntraron = totalPersonas - capacidadSala;
        
        System.out.println("Resumen del día:");
        System.out.println("Número de niños con edades inferiores a 4 años: " + numNinosMenor4);
        System.out.println("Número de niños con edad comprendida entre 4 y 12 años: " + numNinosEntre4y12);
        System.out.println("Número de adultos: " + numAdultos);
        System.out.println("Número total de personas que han entrado: " + totalPersonas);
        System.out.println("Número de personas que no pudieron entrar debido a la capacidad de la sala: " + personasNoEntraron);
        System.out.println("Caja total: " + cajaTotal + " pesos");
        
        scanner.close();
    }
}

