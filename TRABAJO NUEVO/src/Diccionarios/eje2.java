package Diccionarios;
import java.util.*;


public class eje2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList <Integer> numeros = new ArrayList<>();


        int nu ;
        HashMap diccionario = new HashMap<>();
        for(int i = 0; i < 5; i++);

        System.out.println("ingrese un numero: ");
        nu = entrada.nextInt();
        numeros.add(nu);

        diccionario.put("numeros", numeros);
        System.out.println("los numeros son; " + diccionario.get("numeros"));
        
    }
}
