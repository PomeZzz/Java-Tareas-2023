package Metodos;
import java.util.*;

public class met {
    static Scanner entrada = new Scanner (System.in);
    static int n1;
    static int n2;
    static int sumaa;
    static int respuesta;
    public static void main(String[] args) {
        
        do {
            System.out.println("1-suma" + "2-Resta" + "3-Multiplicacion"+"Salir-0");
            int respuesta = entrada.nextInt();
        switch (respuesta) {
            case 1:
                suma();
                break;
            
            case 2:
                suma();
                break;
            case 3:
                multiplicacion();
                break;
            case 4:
                divicion();
                break;
            default:
                break;
        }
        } while (respuesta!=0);
        
    }


    public static void suma() {
        System.out.println("Ingrese el primer numero");
        n1 = entrada.nextInt();
        System.out.println("Ingrese el segundo numero");
        n2 = entrada.nextInt();
        sumaa = n1+n2;
        System.out.println("La suma es" + sumaa);
    }

    public static void resta() {
        System.out.println("Ingrese el primer numero");
        n1 = entrada.nextInt();
        System.out.println("ingrese el segundo numero");
        n2 = entrada.nextInt();
        sumaa = n1-n2;
        System.out.println("la resta es" + sumaa);
    }

    public static void multiplicacion() {
        System.out.println("Ingrese el primer numero");
        n1 = entrada.nextInt();
        System.out.println("ingrese el segundo numero");
        n2 = entrada.nextInt();
        sumaa = n1*n2;
        System.out.println("la resta es" + sumaa);
    }

    public static void divicion() {
        System.out.println("Ingrese el primer numero");
        n1 = entrada.nextInt();
        System.out.println("ingrese el segundo numero");
        n2 = entrada.nextInt();
        sumaa = n1/n2;
        System.out.println("la resta es" + sumaa);
    }
}
