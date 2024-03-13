package co.edu.uniquindio.poo;

public class PedidoPizzeria implements FabricaPedido{
    
    
    @Override
    public Producto CrearProducto(){
        return new ProductoPizzeria();
    }

    @Override
    public Combo CrearCombo(){
        return new ComboPizzeria();
    }
}
