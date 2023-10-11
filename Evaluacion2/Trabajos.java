package Evaluacion2;

import java.util.HashMap;
import java.util.Map;

public class Trabajos {
    private Map<String, Integer> trabajos;

    public Trabajos() {
        trabajos = new HashMap<>();
    }

    
    public void AñadirTrabajadores(String trabajo) {
        trabajos.put(trabajo, trabajos.getOrDefault(trabajo, 0) + 1);
    }

   
    public void MostrarTodo() {
        for (Map.Entry<String, Integer> entry : trabajos.entrySet()) {
            System.out.println("Trabajo: " + entry.getKey() + ", Trabajadores: " + entry.getValue());
        }
    }

    
    public void MostrarTrabajos(String trabajo) {
        if (trabajos.containsKey(trabajo)) {
            System.out.println("Trabajo: " + trabajo + ", Trabajadores: " + trabajos.get(trabajo));
        } else {
            System.out.println("No hay trabajadores en el trabajo: " + trabajo);
        }
    }

    
    public void cuantos() {
        System.out.println("Número de trabajos diferentes: " + trabajos.size());
    }

    
    public void borra() {
        trabajos.clear();
    }

    public static void main(String[] args) {
        Trabajos trabajos = new Trabajos();

        trabajos.AñadirTrabajadores("Programador");
        trabajos.AñadirTrabajadores("Diseñador");
        trabajos.AñadirTrabajadores("Programador");
        trabajos.AñadirTrabajadores("Gerente");
        trabajos.AñadirTrabajadores("Gerente");

        System.out.println("Mostrar todos los trabajos:");
        trabajos.MostrarTodo();

        System.out.println("\nMostrar trabajo 'Programador':");
        trabajos.MostrarTrabajos("Programador");

        System.out.println("\nCuantos trabajos diferentes existen:");
        trabajos.cuantos();

        trabajos.borra();
        trabajos.MostrarTodo();
    }
}
