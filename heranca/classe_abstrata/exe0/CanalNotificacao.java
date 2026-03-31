package poo_ads2026.heranca.classe_abstrata.exe0;

public abstract class CanalNotificacao {
    
    protected String destinatario;
    protected String mensagem;

    public CanalNotificacao(String destinatario, String mensagem) {
        this.destinatario = destinatario;
        this.mensagem = mensagem;
    }

    public void exibirDados(){
        System.out.println("\nDestinatario: "+destinatario
            +"\nMensagem: "+mensagem);
    }

    public abstract void enviar();

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    

}
