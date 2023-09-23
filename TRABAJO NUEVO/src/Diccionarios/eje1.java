package Diccionarios;
import java.util.HashMap;

public class eje1 {
    public static void main(String[] args) {
        HashMap dicciionarioooooo = new HashMap<>();//diccionario es la variable del diccionario.
    
        dicciionarioooooo.put("nombres", "martin" + "felipe" + "miguel");
        String nom = dicciionarioooooo.get("nombres").toString();
        System.out.println("Los nombres son: " + nom);
    }


}
