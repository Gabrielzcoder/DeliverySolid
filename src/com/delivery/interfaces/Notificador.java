package src.com.delivery.interfaces;

import src.com.delivery.model.Pedido;

public interface Notificador {
    void enviarNotificacao(Pedido pedido);
}
