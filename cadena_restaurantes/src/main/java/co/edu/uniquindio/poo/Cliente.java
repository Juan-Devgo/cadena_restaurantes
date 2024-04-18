package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.Collection;

public class Cliente {
    private Pedido pedido;

    public Cliente(){}

    public void realizarPedidoCafeteria(String tipoPedido, String nombrePedido){

        assert tipoPedido != null && !tipoPedido.isBlank();
        assert nombrePedido != null && !nombrePedido.isBlank();

        FabricaPedido cafeteria = PedidoCafeteria.Singlenton.getInstancia();
        if (tipoPedido.toLowerCase() == "producto"){
            Producto producto = cafeteria.CrearProducto();
            productos.add(producto);

        } if(tipoPedido.toLowerCase() == "combo"){
            Combo combo = cafeteria.CrearCombo();
            combos.add(combo);

        } if (tipoPedido.toLowerCase() == "adicional"){
            Adicional adicional = cafeteria.crearAdicional();
            adicionales.add(adicional);

        } else {
            assert false:"Tipo de pedido no encontrado";
        }
    }
    public void realizarPedidoPizzeria(String tipoPedido, String nombrePedido){
        assert tipoPedido != null && !tipoPedido.isBlank();
        assert nombrePedido != null && !nombrePedido.isBlank();
        FabricaPedido pedido = PedidoPizzeria.Singlenton.getInstancia();
    }
    public void realizarPedidoRestauranteSushi(String tipoPedido, String nombrePedido){
        assert tipoPedido != null && !tipoPedido.isBlank();
        assert nombrePedido != null && !nombrePedido.isBlank();
        FabricaPedido pedido = PedidoRestauranteSushi.Singlenton.getInstancia();
    }
}
