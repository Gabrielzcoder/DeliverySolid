package src.com.delivery.notification;

import src.com.delivery.interfaces.Notificador;
import src.com.delivery.model.Pedido;

public class EmailNotificador implements Notificador {

    @Override
    public void enviarNotificacao(Pedido pedido) {
        System.out.println(
                "Email enviado para o cliente: " + pedido.getNomeCliente()
        );
    }
}