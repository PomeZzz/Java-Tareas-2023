import java.util.*;

import javax.sound.midi.SysexMessage;

public class Arrays_ej3 {
    public static void main(String[] agrs){
        Scanner Input = new Scanner(System.in);
        double[] sueldos = new double[10];
        String[] nombres = new String[10];
        int k;
        double mayorSueldo = 0;
        String nombreMayorSueldo = "";

        for (k = 0; k<10 ; k++){
            System.out.println("Ingrese Los Nombres: " + k);
            nombres[k] = Input.nextLine();
            System.out.println("Ingrese Los Sueldos: " + k);
            sueldos[k] = Input.nextDouble();
            Input.nextLine();

            if(sueldos[k] > mayorSueldo){
                mayorSueldo = sueldos[k];
                nombreMayorSueldo = nombres[k];
            }


        }
        
        System.out.println("Empleandos con mayor sueldo" + nombreMayorSueldo + "con un sueldo de: " + mayorSueldo);
    }
}
