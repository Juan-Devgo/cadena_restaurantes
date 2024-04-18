package co.edu.uniquindio.poo;

public class PedidoPizzeria implements FabricaPedido{
    private static PedidoPizzeria instancia;

    private PedidoPizzeria(){
        PedidoPizzeria.instancia = this;
    }
    
    @Override
    public Producto CrearProducto(){
        return new ProductoPizzeria();
    }
    @Override
    public Combo CrearCombo(){
        return new ComboPizzeria();
    }
    @Override
    public Adicional crearAdicional(){
        return new AdicionalPizzeria();
    }

    public static class Singlenton{
        public static PedidoPizzeria getInstancia(){
            if (instancia == null) {
                instancia = new PedidoPizzeria();
            }
            return instancia;
        }
    }
}
