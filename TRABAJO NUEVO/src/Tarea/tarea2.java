package Tarea;
import javax.swing.*;
import java.util.*;

public class tarea2 {
    public static void main(String[] args) {
       double precio = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el precio del auto"));

       double descuento=0;
       if(precio <= 20000){
            descuento = precio*0.1;
       }
        else if(precio > 20000 && precio < 30000){
            descuento = precio*0.15;
       }
       else if(precio <= 30000){
            descuento = precio*0.2;
       }

       double preciofinal = precio - descuento;
       System.out.println("El valor de el auto queda en: " + preciofinal);

    }
}
