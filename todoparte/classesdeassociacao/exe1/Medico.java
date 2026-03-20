package poo_ads2026.todoparte.classesdeassociacao.exe1;

public class Medico {
    
    private String nome;
    private String especialidade;
    private String crm;
    private int id;

    public Medico() {

    }

    public Medico(String nome, String especialidade, String crm, int id) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.crm = crm;
        this.id = id;
    }

    @Override
    public String toString() {
        return "\nMedico [nome=" + nome + ", especialidade=" + especialidade + ", crm=" + crm + ", id=" + id + "]\n";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
