package Evaluacion;

import java.util.ArrayList;
import java.util.Scanner;

public class quintoejercicio {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int opcion = 0;

        while (opcion != 7) {
            System.out.println("\n--- MENÚ FERRETERIA ---");
            System.out.println("1. Ingresar datos");
            System.out.println("2. Localizar una herramienta");
            System.out.println("3. Modificar una herramienta");
            System.out.println("4. Saber el Stock de la lista");
            System.out.println("5. Remover un producto de la lista");
            System.out.println("6. Verificar si la lista contiene algúna herramienta");
            System.out.println("7. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un dato: ");
                    String dato = scanner.next();
                    lista.add(dato);
                    System.out.println("Dato agregado correctamente.");
                    break;
                case 2:
                    System.out.print("Ingrese el dato a buscar: ");
                    String datoBuscado = scanner.next();
                    int indice = lista.indexOf(datoBuscado);
                    if (indice != -1) {
                        System.out.println("La Herramienta se encuentra en el índice: " + indice);
                    } else {
                        System.out.println("El dato no se encuentra en la lista.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el índice del dato a modificar: ");
                    int indiceModificar = scanner.nextInt();
                    if (indiceModificar >= 0 && indiceModificar < lista.size()) {
                        System.out.print("Ingrese el nuevo dato: ");
                        String nuevoDato = scanner.next();
                        lista.set(indiceModificar, nuevoDato);
                        System.out.println("Dato modificado correctamente.");
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;
                case 4:
                    System.out.println("El tamaño de la lista es: " + lista.size());
                    break;
                case 5:
                    System.out.print("Ingrese el dato a remover: ");
                    String datoRemover = scanner.next();
                    boolean removido = lista.remove(datoRemover);
                    if (removido) {
                        System.out.println("Dato removido correctamente.");
                    } else {
                        System.out.println("El dato no se encuentra en la lista.");
                    }
                    break;
                case 6:
                    System.out.print("Ingrese el dato a verificar: ");
                    String datoVerificar = scanner.next();
                    boolean contieneDato = lista.contains(datoVerificar);
                    System.out.println("La lista " + (contieneDato ? "contiene" : "no contiene") + " el dato.");
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        }

        scanner.close();
    }
}

