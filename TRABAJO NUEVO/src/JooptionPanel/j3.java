package JooptionPanel;
import javax.swing.*;
import java.util.*;

public class j3 {
    public static void main(String[] args) {
        String [] stock = {"Tuercas","Tornillos","Clavos","Tarugos","Remaches"};
        
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea imprimir una lista del Stock?", "Registro", 0, 0);
        int tuercas =0;
        int [] cantidad = new int[5];
        int tornillos = 0;
        int clavos = 0;
        int tarugos = 0;
        int remaches = 0;
        int valorx = 0;
           
        while(true){
            if(respuesta == 0){
                String respuestas = (String) JOptionPane.showInputDialog(null, "Elgui un componente", "Stock de mi local", JOptionPane.DEFAULT_OPTION, null,stock,stock[0]);
                
                switch (respuestas) {
                    case "Tuercas":
                        tuercas = Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese la cantidad de tuercas"));
                        System.out.println(tuercas);
                        cantidad [0] = tuercas;
                    break;
                    
                    case "Tornillos":
                        tornillos = Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese la cantidad de tornillos"));
                        System.out.println(tornillos);
                        cantidad [1] = tornillos;
                    break;
                    
                    case "Clavos":
                        clavos = Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese la cantidad de clavos"));
                        System.out.println(clavos);
                        cantidad [2] = clavos;
                    break;
                    
                    case "Tarugos":
                        tarugos = Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese la cantidad de tarugos"));
                        System.out.println(tarugos);
                        cantidad [3] = tarugos;
                    break;
                    
                    case "Remaches":
                        remaches = Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese la cantidad de remaches"));
                        System.out.println(remaches);
                        cantidad [4] = remaches;

                        break;
                    
                    
                    default:
                      break;
                    
                }
                if(cantidad[4] != 0){
                    JOptionPane.showMessageDialog(null, "Esta es la cantidad de Tuercas: "+ cantidad[0] +  "\n Esta es la cantidad de Tornillos: "+ cantidad[1] + "\n Esta es la cantidad de Clavos: "+ cantidad[2] + "\n Esta es la cantidad de Tarugos: "+ cantidad[3] + "\n Esta es la cantidad de Remaches: "+ cantidad[4], null,valorx);
                }
                
               

            }
        }


    }
}
