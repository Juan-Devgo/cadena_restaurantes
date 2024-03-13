package co.edu.uniquindio.poo;

public class PedidoRestauranteSushi implements FabricaPedido {
    
    
    @Override
    public Producto CrearProducto(){
        return new ProductoRestauranteSushi();
    }

    @Override
    public Combo CrearCombo(){
        return new ComboRestauranteSushi();
    }
}
