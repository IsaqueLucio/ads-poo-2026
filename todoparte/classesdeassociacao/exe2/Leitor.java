package poo_ads2026.todoparte.classesdeassociacao.exe2;

public class Leitor {
    
    private String nome;
    private int id;

    public Leitor() {

    }

    public Leitor(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    @Override
    public String toString() {
        return "\nLeitor [nome=" + nome + ", id=" + id + "]\n";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
