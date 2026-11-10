package src.com.delivery.service;

import src.com.delivery.payment.Pagamento;

public class PagamentoService {

    public void realizarPagamento(Pagamento pagamento, double valor) {
        pagamento.pagar(valor);
    }
}
