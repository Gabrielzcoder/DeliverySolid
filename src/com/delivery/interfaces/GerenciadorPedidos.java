package src.com.delivery.interfaces;

import src.com.delivery.model.Pedido;

public interface GerenciadorPedidos {
    Pedido criarPedido(int id, String nomeCliente, String produto, double valor);
}
