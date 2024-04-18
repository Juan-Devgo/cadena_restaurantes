package co.edu.uniquindio.poo;

public class PedidoRestauranteSushi implements FabricaPedido {
    private static PedidoRestauranteSushi instancia;

    private PedidoRestauranteSushi(){
        PedidoRestauranteSushi.instancia = this;
    }
        
    @Override
    public Producto CrearProducto(){
        return new ProductoRestauranteSushi();
    }
    @Override
    public Combo CrearCombo(){
        return new ComboRestauranteSushi();
    }
    @Override
    public Adicional crearAdicional(){
        return new AdicionalRestauranteSushi();
    }

    public static class Singlenton{
        public static PedidoRestauranteSushi getInstancia(){
            if (instancia == null) {
                instancia = new PedidoRestauranteSushi();
            }
            return instancia;
        }
    }
}
