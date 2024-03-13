package co.edu.uniquindio.poo;

public class PedidoCafeteria implements FabricaPedido{
    
    @Override
    public Producto CrearProducto(){
        return new Productocafeteria();
    }
    @Override
    public Combo CrearCombo(){
        return new ComboCafeteria();
    }
}
