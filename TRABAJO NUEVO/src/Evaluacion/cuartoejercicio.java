package Evaluacion;

import java.util.Random;
import java.util.Scanner;

public class cuartoejercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int partidasGanadas = 0;
        int partidasPerdidas = 0;

        boolean jugarOtraVez = true;
        while (jugarOtraVez) {
            int A = random.nextInt(10) + 1; 
            int B = random.nextInt(10) + 1; 

            
            while (A == B) {
                A = random.nextInt(10) + 1;
                B = random.nextInt(10) + 1;
            }

            System.out.print("Que letra elejis, A o B: ");
            String apuesta = scanner.nextLine();

            System.out.println("Valor de A: " + A);
            System.out.println("Valor de B: " + B);

            if (A > B && apuesta.equalsIgnoreCase("A")) {
                System.out.println("GANASTE la apuesta, A es mayor que B.");
                partidasGanadas++;
            } else if (B > A && apuesta.equalsIgnoreCase("B")) {
                System.out.println("GANASTE la apuesta, B es mayor que A.");
                partidasGanadas++;
            } else {
                System.out.println("PERDISTE.");
                partidasPerdidas++;
            }

            System.out.println("Partidas ganadas: " + partidasGanadas);
            System.out.println("Partidas perdidas: " + partidasPerdidas);

            System.out.print("¿Quieres jugar otra vez? (s/n): ");
            String respuesta = scanner.nextLine();
            jugarOtraVez = respuesta.equalsIgnoreCase("s");
        }

        System.out.println("¡Gracias por jugar!");
    }
}
