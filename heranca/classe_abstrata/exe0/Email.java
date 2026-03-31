package poo_ads2026.heranca.classe_abstrata.exe0;

public class Email extends CanalNotificacao{
    
    private String assunto;

    public Email(String destinatario, String mensagem, String assunto) {
        super(destinatario, mensagem);
        this.assunto = assunto;
    }

    @Override
    public void enviar(){
        System.out.println("Enviando E-mail para "+destinatario+" com o assunto \""+assunto+"\": "+mensagem);
    }

    @Override
    public String toString() {
        return "Email [destinatario=" + destinatario + ", assunto=" + assunto + ", mensagem=" + mensagem + "]";
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    

}
