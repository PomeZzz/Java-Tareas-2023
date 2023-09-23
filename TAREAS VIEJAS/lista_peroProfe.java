import java.util.*; 

public class lista_peroProfe {
    public static void main(String[] agrs){
    int [] numeros = new int [4];
    Scanner datos = new Scanner(System.in);
    int i;
    for( i = 1; i<4; i++){
        System.out.println("Ingresa 3 numeros: " + i);
        numeros[i] = datos.nextInt();
    }

    if(numeros[1] > numeros[2] && numeros[1] > numeros[3]){
        System.out.println("El numero mayor es "+ numeros[1]);
    }
    else if(numeros[2] > numeros[2] && numeros[2] > numeros[3]){
        System.out.println("El numero mayor es "+ numeros[2]);
    }
    else if(numeros[3] > numeros[1] && numeros[3] > numeros[1]){
        System.out.println("El numero mayor es "+ numeros[3]);
    }

    
    }
}
