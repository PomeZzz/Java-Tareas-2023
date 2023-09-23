package Tarea;
import javax.swing.*;
import java.util.*;
public class tarealistas {
    public static void main(String[] args) {
        ArrayList <Integer> numeros = new ArrayList<>();
        ArrayList <Integer> numerospos = new ArrayList<>();
        ArrayList <Integer> numerosneg = new ArrayList<>();
         
        Scanner entrada = new Scanner(System.in);

        for(int i = 0; i < 10; i++){
            System.out.println("ingrese un numero");
            int n = entrada.nextInt();
            numeros.add(n);
        }
        
        
        for(Integer e : numeros){
            if(e>0){
                numerospos.add(e);
            }
            else{
                if(e<0){
                    numerosneg.add(e);
                }
            }
        }

        System.out.println("Esta es la lista: " + numeros);
        System.out.println("Esta es la lista positiva: " + numerospos);
        System.out.println("Esta es la lista de numeros negativos" + numerosneg);

    }
}
