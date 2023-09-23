import java.util.*; 
public class Para_Impar {
    public static void main(String[] agrs){
        Scanner entrada = new Scanner(System.in);
        int n1, n2;

        System.out.println("Ingrese dos numeritos:");
        n1 = entrada.nextInt();
        n2 = entrada.nextInt();

        if (n1 % 2 == 0){
            System.out.println("El numero " + n1 + " es par.");
        }
        else {
            System.out.println("El numero " + n1 + " no es par");
        }
        if (n2 % 2 == 0){
            System.out.println("El numero " + n2 + " es par");
        }
        else {
            System.out.println("El numero " + n2 +" no es par");
        }



    }
}
