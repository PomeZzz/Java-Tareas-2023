package Clases;
import java.util.Scanner;
public class main {
   static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        clase1 c1 = new clase1();
        clase2 c2 = new clase2();
        clase3 c3 = new clase3();
        
        int parasalir=0;
        do {
            System.out.println("1-Valores" + "\n2-Tonto" + "\n3-joption");
            int respuesta = entrada.nextInt();
        switch (respuesta) {
            case 1:
                c1.ingresarnombre();
                break;
            case 2:
                c2.Eltontodelgrupoes();
                break;

            case 3:
                c3.joption();
                break;

            default:
                break;
        } System.out.println("1- conti "+ "2- salir");
         parasalir = entrada.nextInt();
        } while (parasalir != 2);
    }
}
