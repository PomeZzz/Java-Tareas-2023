package Evaluacion2;

public class LugarTuristico {
    private String nombre;
    private String tipo;
    private String descripcion;

    public LugarTuristico(String nombre, String tipo, String descripcion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
