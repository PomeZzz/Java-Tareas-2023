package Evaluacion;

import javax.swing.JOptionPane;

public class segundoejercicio {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Bienvenido a la Ferretería");

        
        String nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre:");

        
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar una compra?", "Confirmación", JOptionPane.YES_NO_OPTION);

        if (respuesta == JOptionPane.YES_OPTION) {
            
            String[] opciones = { "Herramientas", "Materiales", "Pinturas","Tornillos","Destornilladores"};
            int seleccion = JOptionPane.showOptionDialog(null, "¿Qué desea comprar?", "Opciones", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

            
            String[] marcasHerramientas = { "CAT", "STEAL", "BOSCH","SKIL" };
            String marcaSeleccionada = (String) JOptionPane.showInputDialog(null, "Seleccione una marca de herramienta:", "Lista desplegable", JOptionPane.QUESTION_MESSAGE, null, marcasHerramientas, marcasHerramientas[0]);

            
            String mensaje = "Gracias por su compra, " + nombre +
                    "\ncompra: " + opciones[seleccion] +
                    "\nMarca: " + marcaSeleccionada;
            JOptionPane.showMessageDialog(null, mensaje);
        } else {
            
            JOptionPane.showMessageDialog(null, "CHAUU, " + nombre);
        }
    }
}


