package Clases;
import java.util.*;
public class clase1 {
    public void ingresarnombre() {
        List<Integer> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese valores a la lista (-1 para terminar):");

        while (true) {
            int valor = scanner.nextInt();
            if (valor == -1) {
                break;
            }
            lista.add(valor);
        }

        System.out.println("Valores ingresados en la lista:");
        for (int valor : lista) {
            System.out.println(valor);
        }
    }
}
