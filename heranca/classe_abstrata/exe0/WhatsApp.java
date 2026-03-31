package poo_ads2026.heranca.classe_abstrata.exe0;

public class WhatsApp extends CanalNotificacao{
    
    private String statusLeitura;

    public WhatsApp(String destinatario, String mensagem, String statusLeitura) {
        super(destinatario, mensagem);
        this.statusLeitura = statusLeitura;
    }

    @Override
    public void enviar(){
        System.out.println("Enviando Zap para "+destinatario+"... Mensagem: "+mensagem+"\nStatus de leitura: "+statusLeitura);
    }

    @Override
    public String toString() {
        return "WhatsApp [destinatario=" + destinatario + ", statusLeitura=" + statusLeitura + ", mensagem=" + mensagem
                + "]";
    }

    public String getStatusLeitura() {
        return statusLeitura;
    }

    public void setStatusLeitura(String statusLeitura) {
        this.statusLeitura = statusLeitura;
    }

    

}
