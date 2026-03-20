package poo_ads2026.todoparte.classesdeassociacao.exe1;

public class Paciente {
    
    private String nome;
    private String cpf;
    private int id;

    public Paciente() {

    }

    public Paciente(String nome, String cpf, int id) {
        this.nome = nome;
        this.cpf = cpf;
        this.id = id;
    }

    @Override
    public String toString() {
        return "\nPaciente [nome=" + nome + ", cpf=" + cpf + ", id=" + id + "]\n";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
