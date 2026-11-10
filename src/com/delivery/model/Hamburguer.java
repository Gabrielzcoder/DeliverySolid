package src.com.delivery.model;

public class Hamburguer extends Produto {

    private String tipoCarne;

    public Hamburguer(String nome, double preco, String tipoCarne) {
        super(nome, preco);
        this.tipoCarne = tipoCarne;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Tipo de carne: " + tipoCarne);
    }
}
