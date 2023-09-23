import java.util.*;

public class Login {
    public static void main(String[] args){
        Scanner datos = new Scanner(System.in);
        int dni ;
        int clave ;
        
        System.out.println("Ingrese su DNI ");
        dni = datos.nextInt();

        while (dni !=46611249){
            System.out.println("Su DNI es incorrecto, intente de nuevo: ");

            dni = datos.nextInt();

        }
        System.out.println("Ingrese su CLAVE ");
        clave = datos.nextInt();

        while (clave !=12233){
            System.out.println("Su CLAVE es incorrecto, intente de nuevo: ");

            clave = datos.nextInt();
            
        }
        System.out.println("Bienvenido");

    }
}
