package src.com.delivery.service;

import src.com.delivery.interfaces.GerenciadorEntregas;
import src.com.delivery.model.Pedido;

public class EntregaService implements GerenciadorEntregas {

    @Override
    public void realizarEntrega(Pedido pedido) {
        System.out.println("Pedido " + pedido.getId() + " saiu para entrega!");
    }
}
