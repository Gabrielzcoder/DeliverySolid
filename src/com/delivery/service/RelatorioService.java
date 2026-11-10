package src.com.delivery.service;

import src.com.delivery.interfaces.GeradorRelatorios;
import src.com.delivery.model.Pedido;

public class RelatorioService implements GeradorRelatorios {

    @Override
    public void gerarRelatorio(Pedido pedido) {
        System.out.println("===== RELATÓRIO DO PEDIDO =====");
        System.out.println("Cliente: " + pedido.getNomeCliente());
        System.out.println("Produto: " + pedido.getProduto());
        System.out.printf("Valor: R$ %.2f%n", pedido.getValor());
    }
}