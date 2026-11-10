package src.com.delivery.service;

import src.com.delivery.model.Pedido;

public class PedidoExibicaoService {

    public void exibirPedido(Pedido pedido) {

        System.out.println("\n===== INFORMAÇÕES DO PEDIDO =====");
        System.out.println("ID: " + pedido.getId());
        System.out.println("Cliente: " + pedido.getNomeCliente());
        System.out.println("Produto: " + pedido.getProduto());
        System.out.printf("Valor: R$ %.2f%n", pedido.getValor());
        System.out.println("================================");
    }
}
