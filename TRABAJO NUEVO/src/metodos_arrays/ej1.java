package metodos_arrays;
import java.util.*;

public class ej1 {
    public static void main(String[] args) {
        int [] numeros1 = {1,3,6,8,776,98,34,2,76,9,0};
        int [] numeros2 = {3,5,43,2,12,43,5,6,77,67,54,43};
        
        Arrays.sort(numeros1);
        for(int i =0;i<numeros1.length;i++){
            System.out.println("Lista ordenanda "+ numeros1[i]);
        }
        


        if(Arrays.equals(numeros1, numeros2)){
            System.out.println("Lista 1 y Lista 2 son iguales");
        }
        else{
            System.out.println("No son iguales");
        }


        int [] original = new int[] {1,2,3};

        
        System.out.println("array original; ");
        for(int i =0;i<original.length;i++){
            System.out.println(original[i]+ " ");
        }
        //Copiamos array original
        int[] copy = Arrays.copyOf(original, 5);

        // Le asignamos un valor a la posicion 
        copy[3] = 11;
        copy[4] = 55;        

        System.out.println(".....................................");
        for(int i =0;i<copy.length;i++){
            System.out.println(copy[i]+ " ");
        }
    }
}
