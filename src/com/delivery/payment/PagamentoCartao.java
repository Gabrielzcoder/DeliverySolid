package src.com.delivery.payment;

public class PagamentoCartao implements Pagamento {

    @Override
    public void pagar(double valor) {
        System.out.printf(
                "Pagamento de R$ %.2f realizado via cartão.%n",
                valor
        );
    }
}
