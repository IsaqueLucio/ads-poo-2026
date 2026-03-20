package poo_ads2026.todoparte.relacionamentomisto.exe2;
//pacote não estava antes, adicionei para organizar melhor o código, pode ser removido se não for necessário

public class ItemVenda {
    
    private int id;
    private int quantidade;
    private Produto produto;

    public ItemVenda() {

    }

    public ItemVenda(int id, int quantidade, Produto produto) {
        this.id = id;
        this.quantidade = quantidade;
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "Itens da Venda: \nID =" + id + " \nQuantidade = " + quantidade + " \nProduto=" + produto + "\n";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    


}
