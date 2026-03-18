public class Apartamento {
    
    private int andar;
    private int numero;

    protected Apartamento(int andar, int numero) {
        this.andar = andar;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "\nAndar: " + andar + " \nNumero: " + numero + "\n";
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

}
