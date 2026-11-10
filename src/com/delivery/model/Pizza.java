package src.com.delivery.model;

public class Pizza extends Produto {

    private String tamanho;

    public Pizza(String nome, double preco, String tamanho) {
        super(nome, preco);
        this.tamanho = tamanho;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Tamanho: " + tamanho);
    }
}
