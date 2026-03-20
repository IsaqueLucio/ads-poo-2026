package poo_ads2026.todoparte.relacionamentomisto.exe2;

import java.util.ArrayList;
import java.util.List;

public class Venda {
    
    private int id;
    private Cliente cliente;
    private double total;
    private List <ItemVenda> listaItemVenda = new ArrayList<>();

    public Venda(){

    }

    public Venda(int id,Cliente cliente){
        this.cliente = cliente;
        this.id = id;
        this.total = 0.0;
    }

     public void adicionarItemVenda(int id, int quantiade, Produto novProduto){
        ItemVenda novItemVenda = new ItemVenda(id, quantiade, novProduto);
        this.listaItemVenda.add(novItemVenda);
    }

    public double calcularTotal(){
        for (ItemVenda item : listaItemVenda) {
            this.total += item.getProduto().getPreco() * item.getQuantidade();
        }
        return this.total;
    }

    @Override
    public String toString(){
        return "Detalhes da Venda: \nID da venda = "+id+" \nDados do cliente = "+cliente+ " \nLista dos items pegos= "+listaItemVenda+" \nTotal da venda = R$ "+calcularTotal();
    }



}
