package Random;
import java.util.*;


public class ran2 {
    public static void main(String[] agrs){
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese la cantidad de alumnos:");
        int cantidad = entrada.nextInt();
        String [] nombres = new String [cantidad];
        Random ran= new Random
        entrada.nextLine();

        for(int i = 0;i<nombres.length;i++){
            System.out.println("ingrese un nombre:");
            nombres[i] = entrada.nextLine();
        }
        System.out.println("El nombre es: "+ nombres[ran.nextInt(cantidad)]);
    }
}
