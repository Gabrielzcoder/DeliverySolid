package src.com.delivery;

import src.com.delivery.model.Pedido;
import src.com.delivery.repository.PedidoRepositoryMemoria;
import src.com.delivery.service.PedidoService;
import src.com.delivery.service.PedidoExibicaoService;

import src.com.delivery.payment.Pagamento;
import src.com.delivery.payment.PagamentoCartao;
import src.com.delivery.payment.PagamentoPix;
import src.com.delivery.payment.PagamentoDinheiro;
import src.com.delivery.payment.PagamentoService;

public class Main {

    public static void main(String[] args) {

        // Inicializando o armazenamento
        PedidoRepositoryMemoria repository =
                new PedidoRepositoryMemoria();

        // Inicializando os serviços
        PedidoService pedidoService =
                new PedidoService(repository);

        PedidoExibicaoService exibicaoService =
                new PedidoExibicaoService();

        PagamentoService pagamentoService =
                new PagamentoService();

        // Criando um pedido
        Pedido pedido = pedidoService.criarPedido(
                1,
                "Gabriel",
                "Pizza de Calabresa",
                49.90
        );

        // Exibindo o pedido
        exibicaoService.exibirPedido(pedido);

        // Testando formas de pagamento
        System.out.println("\n===== FORMAS DE PAGAMENTO =====");

        Pagamento cartao = new PagamentoCartao();
        Pagamento pix = new PagamentoPix();
        Pagamento dinheiro = new PagamentoDinheiro();

        pagamentoService.realizarPagamento(
                cartao, pedido.getValor()
        );

        pagamentoService.realizarPagamento(
                pix, pedido.getValor()
        );

        pagamentoService.realizarPagamento(
                dinheiro, pedido.getValor()
        );
    }
}
