package src.com.delivery.notification;

import src.com.delivery.interfaces.Notificador;
import src.com.delivery.model.Pedido;

public class WhatsAppNotificador implements Notificador {

    @Override
    public void enviarNotificacao(Pedido pedido) {
        System.out.println(
                "WhatsApp enviado para o cliente: " + pedido.getNomeCliente()
        );
    }
}