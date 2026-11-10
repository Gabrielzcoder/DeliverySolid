package src.com.delivery.model;

public class Pedido {

    private int id;
    private String nomeCliente;
    private String produto;
    private double valor;

    public Pedido(int id, String nomeCliente, String produto, double valor) {
        this.id = id;
        this.nomeCliente = nomeCliente;
        this.produto = produto;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getProduto() {
        return produto;
    }

    public double getValor() {
        return valor;
    }
}
