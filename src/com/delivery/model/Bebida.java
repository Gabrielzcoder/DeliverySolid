package src.com.delivery.model;

public class Bebida extends Produto {

    private int volume;

    public Bebida(String nome, double preco, int volume) {
        super(nome, preco);
        this.volume = volume;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Volume: " + volume + " ml");
    }
}
