package Random;

import java.util.Random;

public class ran1 {
    public static void main(String[] args) {
        String[] nombre = {"pome","vito","feli","andre","topo",};
        Random ran = new Random(); //se crea el objet Random

        System.out.println(nombre[ran.nextInt(5)]);
    }
}
