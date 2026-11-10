package src.com.delivery;

import src.com.delivery.model.Pedido;
import src.com.delivery.repository.PedidoRepositoryMemoria;
import src.com.delivery.service.PedidoService;
import src.com.delivery.service.PedidoExibicaoService;

public class Main {

    public static void main(String[] args) {

        // Inicializando o armazenamento
        PedidoRepositoryMemoria repository =
                new PedidoRepositoryMemoria();

        // Inicializando o serviço de pedidos
        PedidoService pedidoService =
                new PedidoService(repository);

        // Inicializando o serviço de exibição
        PedidoExibicaoService exibicaoService =
                new PedidoExibicaoService();

        // Criando um pedido
        Pedido pedido = pedidoService.criarPedido(
                1,
                "Gabriel",
                "Pizza de Calabresa",
                49.90
        );

        // Exibindo as informações
        exibicaoService.exibirPedido(pedido);
    }
}
