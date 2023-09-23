package JooptionPanel;
import javax.swing.*;


public class j2 {
    public static void main(String[] args) {
        
        String [] nombres = {"Juan","Jose","Ivi","Vito"};
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea imprimir una lista de nombres?", "Registro", 0, 0);

        if(respuesta == 0){
            for(int i = 0; i < nombres.length; i++){    
                JOptionPane.showMessageDialog(null, "lA LISTA ES: "+ nombres[i]);
            }
        }
        else{JOptionPane.showMessageDialog(null, "Que Lastima");}
                
            
    }
}
