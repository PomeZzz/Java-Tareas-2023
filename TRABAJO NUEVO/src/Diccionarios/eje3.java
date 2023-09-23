package Diccionarios;

import java.util.ArrayList;
import java.util.*;

public class eje3 {
    public static void main(String[] args) {
    HashMap palabras = new HashMap<>();
    Scanner entrada = new Scanner(System.in);
    
    
    palabras.put("perro", "dog");
    palabras.put("gato", "cat");
    palabras.put("casa", "house");
    palabras.put("auto", "car");

    
    System.out.println("Ingrese una palabra de las siguientes: ");
    String ingles = entrada.next();

    if (palabras.containsKey(ingles)) {
        System.out.println("Traduccion: " + palabras.get(ingles));
    }
    else{
        System.out.println("La palabra no esta en el diccionario.");
    }

    }
}
