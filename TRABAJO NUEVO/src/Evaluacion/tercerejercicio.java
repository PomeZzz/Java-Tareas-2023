package Evaluacion;

import java.util.Scanner;

public class tercerejercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        String[] menu1 = {"Ravioles", "Coditos", "Sorrentinos"};
        String[] menu2 = {"Carne Vaca", "Carne Chancho", "Carne Pez"};
        String[] menu3 = {"Ensalada Cesar", "Ensalada de Zanahoria", "Ensalada de Tomate"};

        
        int numComensales;
        do {
            System.out.print("Introduce el número de comensales (entre 1 y 4): ");
            numComensales = scanner.nextInt();
        } while (numComensales < 1 || numComensales > 4);

        
        String[][] menus = new String[numComensales][3];

        
        for (int i = 0; i < numComensales; i++) {
            System.out.println("Comensal " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                System.out.println("Menú " + (j + 1) + ":");
                System.out.println("1. " + menu1[j]);
                System.out.println("2. " + menu2[j]);
                System.out.println("3. " + menu3[j]);
                System.out.print("Elija una opción (1-3): ");
                int opcion = scanner.nextInt();

                
                switch (j) {
                    case 0:
                        menus[i][j] = menu1[opcion - 1];
                        break;
                    case 1:
                        menus[i][j] = menu2[opcion - 1];
                        break;
                    case 2:
                        menus[i][j] = menu3[opcion - 1];
                        break;
                }
            }
        }

        
        System.out.println("Menús solicitados:");
        for (int i = 0; i < numComensales; i++) {
            System.out.println("Comensal " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                System.out.println("Menú " + (j + 1) + ": " + menus[i][j]);
            }
        }

        scanner.close();
    }
}
