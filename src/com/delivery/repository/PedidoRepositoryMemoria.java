package src.com.delivery.repository;

import src.com.delivery.model.Pedido;
import java.util.ArrayList;
import java.util.List;

public class PedidoRepositoryMemoria implements PedidoRepository {

    private List<Pedido> pedidos = new ArrayList<>();

    @Override
    public void salvar(Pedido pedido) {
        pedidos.add(pedido);
        System.out.println("Pedido salvo com sucesso!");
    }
}

