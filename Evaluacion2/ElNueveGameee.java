package Evaluacion2;

import java.util.Random;
import java.util.Scanner;

class Jugador {
    private String nombre;
    private int sumaCartas;

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public void tomarCartas() {
        Random rand = new Random();
        int carta1 = rand.nextInt(10) + 1;
        int carta2 = rand.nextInt(10) + 1;
        sumaCartas = carta1 + carta2;
    }

    public void tomarCartaAdicional() {
        Random rand = new Random();
        int cartaAdicional = rand.nextInt(10) + 1;
        sumaCartas -= cartaAdicional;
    }

    public int getSumaCartas() {    
        return sumaCartas;
    }

    public String getNombre() {
        return nombre;
    }
}

public class ElNueveGameee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Jugador jugador1 = new Jugador("Jugador 1");
        Jugador jugador2 = new Jugador("Jugador 2");

        jugador1.tomarCartas();
        jugador2.tomarCartas();

        System.out.println(jugador1.getNombre() + ": " + jugador1.getSumaCartas());
        System.out.println(jugador2.getNombre() + ": " + jugador2.getSumaCartas());

        boolean jugador1TomarCarta = true;
        boolean jugador2TomarCarta = true;

        while (jugador1TomarCarta || jugador2TomarCarta) {
            if (jugador1TomarCarta) {
                System.out.print(jugador1.getNombre() + ", ¿deseas tomar una carta adicional? (S/N): ");
                String respuesta = scanner.next();
                if (respuesta.equalsIgnoreCase("s")) {
                    jugador1.tomarCartaAdicional();
                    System.out.println(jugador1.getNombre() + ": " + jugador1.getSumaCartas());
                } else {
                    jugador1TomarCarta = false;
                }
            }

            if (jugador2TomarCarta) {
                System.out.print(jugador2.getNombre() + ", ¿deseas tomar una carta adicional? (S/N): ");
                String respuesta = scanner.next();
                if (respuesta.equalsIgnoreCase("s")) {
                    jugador2.tomarCartaAdicional();
                    System.out.println(jugador2.getNombre() + ": " + jugador2.getSumaCartas());
                } else {
                    jugador2TomarCarta = false;
                }
            }
        }

        if (Math.abs(jugador1.getSumaCartas() - 9) < Math.abs(jugador2.getSumaCartas() - 9)) {
            System.out.println(jugador1.getNombre() + " gana!");
        } else if (Math.abs(jugador1.getSumaCartas() - 9) > Math.abs(jugador2.getSumaCartas() - 9)) {
            System.out.println(jugador2.getNombre() + " gana!");
        } else {
            System.out.println("Empate!");
        }

        scanner.close();
    }
}

