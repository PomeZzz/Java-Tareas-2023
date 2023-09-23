import java.util.*;

public class Arrays_ej2 {
    public static void main(String[] args){
        Scanner datos = new Scanner(System.in);
        int[] numeros = new int[20];
        int pares = 0;

        while (pares < numeros.length){
            System.out.println("Ingrese numeros pares: ");
            int num = datos.nextInt();
            if (num % 2 == 0){
                numeros[pares] = num;
                pares ++;
            }
            else{
                System.out.println("Su numero Ingresado no es par. Ingreselo nuevamente: ");

            }
        }
        System.out.println("Numeros Pares:");
        for(int k = 0; k<numeros.length; k++){
            System.out.println(numeros[k] + " ");
        }   
        datos.close(); 

    }
}
