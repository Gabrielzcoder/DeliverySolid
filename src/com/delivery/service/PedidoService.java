package src.com.delivery.service;

import src.com.delivery.model.Pedido;
import src.com.delivery.repository.PedidoRepository;

public class PedidoService {

    private PedidoRepository repository;

    public PedidoService(PedidoRepository repository) {
        this.repository = repository;
    }

    public Pedido criarPedido(int id, String nomeCliente,
                              String produto, double valor) {

        Pedido pedido = new Pedido(id, nomeCliente, produto, valor);

        repository.salvar(pedido);

        return pedido;
    }
}
