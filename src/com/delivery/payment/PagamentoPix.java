package src.com.delivery.payment;

public class PagamentoPix implements Pagamento {

    @Override
    public void pagar(double valor) {
        System.out.printf(
                "Pagamento de R$ %.2f realizado via PIX.%n",
                valor
        );
    }
}
