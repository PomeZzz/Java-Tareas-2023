package TareaDespVacaciones;
import javax.swing.*;
import java.util.*;
public class Registro {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        int opcion = 0;
        while (opcion != 7){
            System.out.println("1. Ingresar datos");
            System.out.println("2. Encontrar un dato");
            System.out.println("3. modificar un dato");
            System.out.println("4. Saber el Stock de la lista");
        
            opcion = scanner.nextInt();


            switch (opcion){
                case 1:
                    System.out.println("Ingrese un dato");
                    String dato = scanner.next();
                    lista.add(dato);
                    System.out.println("Dato agregado correctamente.");
                    break;
                case 2:
                    System.out.println("Ingrese el dato a mdificar.");
                    int indiceModificar = scanner.nextInt();
                    if (indiceModificar >= 0 && indiceModificar < lista.size()) {
                        System.out.println("Ingrese el nuevo dato");
                        String nuevoDato = scanner.next();
                        lista.set(indiceModificar, nuevoDato);
                        System.out.println("Dato modificado correctamente");
                    }
                    else {
                        System.out.println("El indice no existe.");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el dato a buscar.");
                    String datoBuscado = scanner.next();
                    int indice = lista.indexOf(datoBuscado);
                    if (indice != 1){
                        System.out.println("El dato se encuentra en el indice" + indice);
                    }
                    else {
                        System.out.println("El dato no se encuentra en la lista.");
                    }
                    break;
                case 4:
                    Collections.sort(lista);
                    System.out.println("Los datos se ordenaron alfabeticamente.");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
            scanner.next();
        }
          
        System.out.println("El tamaño de la lista es: " + lista.size());
        scanner.close();
    }
}
