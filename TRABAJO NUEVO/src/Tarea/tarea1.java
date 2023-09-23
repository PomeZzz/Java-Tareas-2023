package Tarea;

import javax.swing.*;
import java.util.*;

public class tarea1 {
    public static void main(String[] args) {
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Cara = si Cruz = no?", "Registro", 0, 0);
        int apuestas = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese su apuesta"));

        Random ran = new Random();

        int valor = ran.nextInt(0,2);

        if(valor == respuesta){
            apuestas=apuestas*2;
        }
        else{
            apuestas=0;
        }

        System.out.println("Tu ganancia es:" + apuestas);
        

    }
}
