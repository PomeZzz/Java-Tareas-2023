package Clases;
import java.util.Random;

public class clase2 {
    public void Eltontodelgrupoes(){
        String[] nombre = {"Pome", "Vito", "Feli", "Andre","Kenny","Topo","Jose"};
        Random ran = new Random();

        System.out.println("El mas tonto del grupo es:  " + nombre[ran.nextInt(7)]);
    }
}
