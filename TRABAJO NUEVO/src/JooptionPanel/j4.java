package JooptionPanel;

import java.util.Random;

import javax.swing.Icon;
import javax.swing.JOptionPane;

public class j4 {
    public static void main(String[] args) {
        String [] stock = {"Tuercas","Tornillos","Clavos","Tarugos","Remaches"};

        String respuestas = (String) JOptionPane.showInputDialog(null, "Elgui un componente", "Stock de mi local", JOptionPane.DEFAULT_OPTION, null,stock,stock[0]);

        System.out.println(respuestas);



        String [] comidas = {"milanesa","Hmaburguesas","pizza"};

        JOptionPane.showOptionDialog(null, "Seleccione una opcion", "Comidas", 0, 0, null, comidas, );


    }
}
