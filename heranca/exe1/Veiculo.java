package poo_ads2026.heranca.exe1;

public class Veiculo {
    
    protected String marca;
    protected String modelo;
    protected double velocidade;

    protected Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    protected void mover(double velMov){
        if(velMov <= 0){
            System.out.println("Para acelerar e se mover precisa ser um valor positivo maior que zero.");
        } else{
            this.velocidade += velMov;
            System.out.println("Veículo se movendo a "+this.velocidade+" Km/h");
        }
    }

    protected void abastecer(){
        System.out.println("Veículo reabastecendo...");
    }

    @Override
    public String toString() {
        return "Veiculo [marca=" + marca + ", modelo=" + modelo + ", velocidade=" + velocidade + "]";
    }

    protected String getMarca() {
        return marca;
    }

    protected void setMarca(String marca) {
        this.marca = marca;
    }

    protected String getModelo() {
        return modelo;
    }

    protected void setModelo(String modelo) {
        this.modelo = modelo;
    }

    protected double getVelocidade() {
        return velocidade;
    }

    protected void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

}
