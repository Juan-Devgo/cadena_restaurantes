package co.edu.uniquindio.poo;

public abstract class Producto {
    private String nombre;

    public Producto(String nombre){
        assert nombre != null && !nombre.isBlank();

        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
