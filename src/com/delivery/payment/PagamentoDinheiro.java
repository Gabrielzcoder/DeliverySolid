package src.com.delivery.payment;

public class PagamentoDinheiro implements Pagamento {

    @Override
    public void pagar(double valor) {
        System.out.printf(
                "Pagamento de R$ %.2f realizado em dinheiro.%n",
                valor
        );
    }
}
