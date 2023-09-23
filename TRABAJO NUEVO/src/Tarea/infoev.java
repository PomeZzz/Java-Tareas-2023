package Tarea;
import javax.swing.*;

import java.lang.reflect.Array;
import java.util.*;
public class infoev {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(null);
        numeros.add(12);
        numeros.add(23);
        numeros.add(45);

        int tamano = numeros.size(); //esto te da el largo de la lista
        System.out.println("el tamano es: "+ tamano);

        numeros.set(1, 42);

        System.out.println("la lista modificada" + numeros);

         int indice = numeros.get(0);
         System.out.println("elemento ubicado"+ indice);

         numeros.remove(2);
         System.out.println("lista"+ numeros);

         boolean valor = numeros.isEmpty();
         System.out.println("¿La lista esta vacia?"+valor);

         
    }
}


