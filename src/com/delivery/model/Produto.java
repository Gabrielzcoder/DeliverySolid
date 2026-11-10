package src.com.delivery.model;

public class Produto {

    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void exibirInformacoes() {
        System.out.println("Produto: " + nome);
        System.out.printf("Preço: R$ %.2f%n", preco);
    }
}
