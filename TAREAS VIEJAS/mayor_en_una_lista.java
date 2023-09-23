import javax.swing.text.Position;

public class mayor_en_una_lista {
    public static void main(String[] args) {
        int[] numeros = new int[] {10, 23, 12 ,45, 2, 14, 47};
        
        int ubicacion = 0;

        for(int x = 0; x < numeros.length; x++){
            if (numeros[x] > numeros[ubicacion])
            ubicacion = x;
        }

        int mayor = numeros[ubicacion];
        System.out.println("El mayor es: " + mayor + " y se encuentra en el índice " + ubicacion);

    }
}

