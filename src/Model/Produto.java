package Model;

public class Produto {
    private int id;
    private String nome;
    private float preco,quantidade;

    public Produto() {
    }

    public Produto(int id, String nome, float preco, float quantidade) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public float getPreco() {
        return preco;
    }

    public float getQuantidade() {
        return quantidade;
    }
    
    
    
}
