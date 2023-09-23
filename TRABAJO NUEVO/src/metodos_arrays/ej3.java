package metodos_arrays;
import java.util.*;

public class ej3 {
    public static void main(String[] args) {
        int[] nombre = {38, 124, 92, 16, 81, 47, 109, 73, 130, 12, 62, 30, 102, 23, 145, 87, 52, 4, 95, 67, 41, 117, 76, 10, 59, 36, 142, 8, 134, 55, 19, 139, 70, 1, 115, 64, 29, 99, 43, 150, 85, 49, 127, 69, 33, 121, 78, 21, 97, 7, 143};
        Random ran = new Random(); //se crea el objet Random
        Scanner entradas = new Scanner(System.in);
        Scanner entradas2 = new Scanner(System.in);

        System.out.println("Escoje un numero entre el 0 y el 150");
        int respuesta = entradas.nextInt();

        int pepito = (nombre[ran.nextInt(50)]);
        

        if(respuesta == pepito){
            System.out.println("Tu numero es el correcto, GANASTE!!!!");
        }
        else{
            System.out.println("Sos horrible");
        }

    }
}
