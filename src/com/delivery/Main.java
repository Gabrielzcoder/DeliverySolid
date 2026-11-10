package src.com.delivery;

import src.com.delivery.interfaces.GeradorRelatorios;
import src.com.delivery.interfaces.GerenciadorEntregas;
import src.com.delivery.interfaces.GerenciadorPedidos;
import src.com.delivery.model.Pedido;
import src.com.delivery.notification.EmailNotificador;
import src.com.delivery.notification.SMSNotificador;
import src.com.delivery.notification.WhatsAppNotificador;
import src.com.delivery.payment.PagamentoCartao;
import src.com.delivery.payment.PagamentoDinheiro;
import src.com.delivery.payment.PagamentoPix;
import src.com.delivery.repository.PedidoRepository;
import src.com.delivery.repository.PedidoRepositoryMemoria;
import src.com.delivery.service.EntregaService;
import src.com.delivery.service.NotificacaoService;
import src.com.delivery.service.PagamentoService;
import src.com.delivery.service.PedidoExibicaoService;
import src.com.delivery.service.PedidoService;
import src.com.delivery.service.RelatorioService;

public class Main {

    public static void main(String[] args) {

        // SRP - Criação e exibição de pedidos
        PedidoRepository repository = new PedidoRepositoryMemoria();

        GerenciadorPedidos pedidos = new PedidoService(repository);
        PedidoExibicaoService exibicao = new PedidoExibicaoService();

        Pedido pedido = pedidos.criarPedido(
                1, "Gabriel", "Pizza de Calabresa", 49.90
        );

        exibicao.exibirPedido(pedido);

        // OCP - Diferentes formas de pagamento
        System.out.println("\n===== PAGAMENTOS =====");

        PagamentoService pagamentoService = new PagamentoService();

        pagamentoService.realizarPagamento(new PagamentoCartao(), 49.90);
        pagamentoService.realizarPagamento(new PagamentoPix(), 49.90);
        pagamentoService.realizarPagamento(new PagamentoDinheiro(), 49.90);

        // ISP - Interfaces segregadas
        System.out.println("\n===== SERVIÇOS DO PEDIDO =====");

        GerenciadorEntregas entregas = new EntregaService();
        GeradorRelatorios relatorios = new RelatorioService();

        entregas.realizarEntrega(pedido);
        relatorios.gerarRelatorio(pedido);

        // DIP - Notificações desacopladas
        System.out.println("\n===== NOTIFICAÇÕES =====");

        NotificacaoService emailService =
                new NotificacaoService(new EmailNotificador());

        NotificacaoService smsService =
                new NotificacaoService(new SMSNotificador());

        NotificacaoService whatsappService =
                new NotificacaoService(new WhatsAppNotificador());

        emailService.notificar(pedido);
        smsService.notificar(pedido);
        whatsappService.notificar(pedido);
    }
}
