package poo_ads2026.heranca.classe_abstrata.exe0;

public class Sms extends CanalNotificacao {
    
    private int numeroTelefone;

    public Sms(String destinatario, String mensagem, int numeroTelefone) {
        super(destinatario, mensagem);
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public void enviar(){
        System.out.println("Enviando SMS para o número "+numeroTelefone+": "+mensagem);
    }

    @Override
    public String toString() {
        return "Sms [numeroTelefone=" + numeroTelefone + ", destinatario=" + destinatario + ", mensagem=" + mensagem
                + "]";
    }

    public int getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(int numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    

}
