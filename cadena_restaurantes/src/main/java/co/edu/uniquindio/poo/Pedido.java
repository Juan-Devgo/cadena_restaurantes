package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.Collection;

public class Pedido {
    private Collection<Combo> combos;
    private Collection<Producto> productos;
    private Collection<Adicional> adicionales;

    public Pedido(){
        this.combos = new ArrayList<>();
        this.productos = new ArrayList<>();
        this.adicionales = new ArrayList<>();
    }

    public void agregarCombo(Combo combo){
        assert combo != null;
        combos.add(combo);
    }
}
