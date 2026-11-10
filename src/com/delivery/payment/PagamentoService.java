package src.com.delivery.payment;

public class PagamentoService {

    public void realizarPagamento(Pagamento pagamento, double valor) {
        pagamento.pagar(valor);
    }
}
