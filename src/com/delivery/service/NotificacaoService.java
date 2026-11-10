package src.com.delivery.service;

import src.com.delivery.interfaces.Notificador;
import src.com.delivery.model.Pedido;

public class NotificacaoService implements Notificador {

    @Override
    public void enviarNotificacao(Pedido pedido) {
        System.out.println("Notificação enviada para " + pedido.getNomeCliente());
    }
}