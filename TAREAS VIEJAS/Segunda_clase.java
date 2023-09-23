import java.util.Scanner;

public class Segunda_clase {
    public static void main(String[] agrs){

        Scanner entrada = new Scanner(System.in);
        int numero1, numero2, numero3;
        int mayor1 =0;
        

        System.out.println("Ingrese su primer nuemro");
        numero1 = entrada.nextInt();
        numero2 = entrada.nextInt();
        numero3 = entrada.nextInt();

        if (numero1 > numero2) {
            mayor1 = numero1;
        }
        else if (numero2 > numero1) {
            mayor1 = numero2;
        }
        
        if(mayor1 > numero3) {
            System.out.println("El numero mayor es: " + mayor1);
        }
        else{
            System.out.println("El numero mayor es: " + numero3);
        }





       




    }
}
