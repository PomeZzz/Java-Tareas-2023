package Evaluacion2;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class AplicacionTuristica {
    private ArrayList<LugarTuristico> lugaresTuristicos = new ArrayList<>();

    public void ingresoDeInformacion(String nombre, String tipo, String descripcion) {
        LugarTuristico lugar = new LugarTuristico(nombre, tipo, descripcion);
        lugaresTuristicos.add(lugar);
        JOptionPane.showMessageDialog(null, "Información agregada con éxito.", "Cosas", JOptionPane.INFORMATION_MESSAGE);
    }

    public void eliminarInformacion(String nombre) {
        for (int i = 0; i < lugaresTuristicos.size(); i++) {
            if (lugaresTuristicos.get(i).getNombre().equals(nombre)) {
                lugaresTuristicos.remove(i);
                JOptionPane.showMessageDialog(null, "Información eliminada con éxito.", "Cosas", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Lugar no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
    }

    public LugarTuristico buscarInformacion(String nombre) {
        for (LugarTuristico lugar : lugaresTuristicos) {
            if (lugar.getNombre().equals(nombre)) {
                return lugar;
            }
        }
        return null;
    }

    public void mostrarMenu() {
        while (true) {
            String opcion = JOptionPane.showInputDialog("Menú:\n1. Agregar información\n2. Eliminar información\n3. Buscar información\n4. Salir");
            if (opcion == null || opcion.equals("4")) {
                break;
            }
            switch (opcion) {
                case "1":
                    String nombre = JOptionPane.showInputDialog("Nombre del lugar turístico:");
                    String tipo = JOptionPane.showInputDialog("Tipo del lugar turístico:");
                    String descripcion = JOptionPane.showInputDialog("Descripción del lugar turístico:");
                    ingresoDeInformacion(nombre, tipo, descripcion);
                    break;
                case "2":
                    String nombreEliminar = JOptionPane.showInputDialog("Nombre del lugar turístico a eliminar:");
                    eliminarInformacion(nombreEliminar);
                    break;
                case "3":
                    String nombreBuscar = JOptionPane.showInputDialog("Nombre del lugar turístico a buscar:");
                    LugarTuristico lugar = buscarInformacion(nombreBuscar);
                    if (lugar != null) {
                        JOptionPane.showMessageDialog(null, "Información encontrada:\nNombre: " + lugar.getNombre() +
                                "\nTipo: " + lugar.getTipo() + "\nDescripción: " + lugar.getDescripcion(),
                                "Información Encontrada", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Lugar no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.", "Error", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
    }

    public static void main(String[] args) {
        AplicacionTuristica app = new AplicacionTuristica();
        app.mostrarMenu();
    }
}
