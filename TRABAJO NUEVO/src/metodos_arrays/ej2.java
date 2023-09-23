package metodos_arrays;
import java.sql.Clob;
import java.text.BreakIterator;
import java.util.*;
import javax.swing.*;

public class ej2 {
    public static void main(String[] args) {
        int [] numeros1 = {1,3,6,8,77};
        int [] numeros2 = {3,5,43,2,1};
        int valorx = 0;

        int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea Saber si las listas son iguales?", "Fornite", 0, 0);

        if(respuesta == 0){
            Arrays.sort(numeros1);
            Arrays.sort(numeros2);
        }
       

        if(respuesta == 1){
            System.out.println("Por que pones que no mala onda"); 
            
        }
        
        
        
        if(Arrays.equals(numeros1, numeros2)){
            System.out.println("Lista 1 y Lista 2 son iguales");
        }
        else{
            System.out.println("No son iguales");
        }
        
        
        
        for (int i = 0; i < numeros1.length; i++) {
            JOptionPane.showMessageDialog(null, "la lista 1 es: "+numeros1[i], null, respuesta);
        }
        for (int i = 0; i < numeros1.length; i++) {
            JOptionPane.showMessageDialog(null, "la lista 2 es: "+numeros2[i], null, respuesta);
        }


        int[] copy = Arrays.copyOf(numeros1, 7);
        int[] copy2 = Arrays.copyOf(numeros2, 7);

        copy[5] = 100;
        copy[6] = 200;
        copy2[5] = 200;
        copy2[6] = 400;

        for(int i =0;i<copy.length;i++){
            System.out.println("Esta es la lista 1 actualizada:"+ copy[i]+ " ");
        }

        for(int i =0;i<copy2.length;i++){
            System.out.println("Esta es la lista 2 actualizada:"+ copy2[i]+ " ");
        }


    }
}
