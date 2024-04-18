package co.edu.uniquindio.poo;

public class PedidoCafeteria implements FabricaPedido{
    private static PedidoCafeteria instancia;

    private PedidoCafeteria(){
        PedidoCafeteria.instancia = this;
    }
    
    @Override
    public Producto CrearProducto(String nombrePedido){

        return new ProductoCafeteria(nombrePedido);
    }
    @Override
    public Combo CrearCombo(){
        return new ComboCafeteria();
    }
    @Override
    public Adicional crearAdicional(){
        return new AdicionalCafeteria();
    }

    public static class Singlenton{
        public static PedidoCafeteria getInstancia(){
            if (instancia == null) {
                instancia = new PedidoCafeteria();
            }
            return instancia;
        }
    }
}
