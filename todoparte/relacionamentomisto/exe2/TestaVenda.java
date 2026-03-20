package poo_ads2026.todoparte.relacionamentomisto.exe2;

public class TestaVenda {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(1, "João");
        Produto produto1 = new Produto(1, "Camiseta", 50.0);
        Produto produto2 = new Produto(2, "Calça", 100.0);

        Venda venda1 = new Venda(1, cliente1);
        venda1.adicionarItemVenda(1, 2, produto1); // 2 camisetas
        venda1.adicionarItemVenda(2, 1, produto2); // 1 calça

        System.out.println(venda1);
    }
}
