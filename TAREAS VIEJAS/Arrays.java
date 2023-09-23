import java.util.*;

public class Arrays {
    public static void main(String[] agrs){
        int[] numeros = new int[10];
        Scanner datos = new Scanner(System.in);
        int k;
        int positivo = 0;
        int negativo = 0;

        for ( k = 0; k<10; k++){
            System.out.println("Ingresar 10 Numeros: " + k);
            numeros[k] = datos.nextInt();
        
        
        if (numeros[k] >0){
            positivo= positivo +1;
        }
        else{
            negativo = negativo +1;
        }
     }
        System.out.println("Numeros positivos: " + positivo);
        System.out.println("Numeros Negativos: " + negativo);
    }
}
