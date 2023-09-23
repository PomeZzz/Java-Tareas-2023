package Clases;
import javax.swing.JOptionPane;

public class clase3 {
    public void joption(){
        String cadena;
        int numero;
        Float decimal;

        cadena = JOptionPane.showInputDialog("Ingrese una palabra: ");
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        decimal = Float.parseFloat(JOptionPane.showInputDialog("Ingrese un decimal: "));

        JOptionPane.showMessageDialog(null,"La palabra es: " + cadena);
        JOptionPane.showMessageDialog(null,"El Numero es: " + numero);
        JOptionPane.showMessageDialog(null,"El Decimal es: " + decimal);
    }
}
