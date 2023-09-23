package Random;
import java.util.*;


public class ran3 {
    public static void main(String[] agrs){
        Scanner entrada = new Scanner(System.in);
        System.out.println(" 1-Jugar " + " \n 2-Numero Random" + " \n 3-Nombre Random");
        int respuesta=entrada.nextInt();


        switch (respuesta) {
            case 1:
                System.out.println("NAZI");
                break;
            case 2:
                // int[] numero = {1,2,3,4,5,6,7,8,9}; lista que deberia usar si uso numeros
                Random ran = new Random(); //se crea el objet Random    
            
                // System.out.println[numero(ran.nextInt(0)]); formato de lista si no uso el random bien
                System.out.println("El numero es: " + ran.nextInt(1,10));
                break;
            case 3:
                String[] nombre = {"pome","vito","feli","andre","topo",};
                Random ran2 = new Random(); //se crea el objet Random
    
                System.out.println("El nombre es:" + nombre[ran2.nextInt(5)]);
                break;
            default:
                break;
        }
    }
}
