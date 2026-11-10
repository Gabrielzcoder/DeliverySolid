package src.com.delivery.service;

import src.com.delivery.interfaces.Notificador;
import src.com.delivery.model.Pedido;

public class NotificacaoService {

    private final Notificador notificador;

    public NotificacaoService(Notificador notificador) {
        this.notificador = notificador;
    }

    public void notificar(Pedido pedido) {
        notificador.enviarNotificacao(pedido);
    }
}