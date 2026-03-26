package poo_ads2026.heranca.exe1;

public class Aviao extends Veiculo {

    private double altitudeMax;

    public Aviao(String marca, String modelo, double altitudeMax) {
        super(marca, modelo);
        this.altitudeMax = altitudeMax;
    }

    @Override
    protected void mover(double velMov){
        if(velMov <= 0){
            System.out.println("Para acelerar e se mover precisa ser um valor positivo maior que zero.");
        } else{
            this.velocidade += velMov;
            double altura = this.altitudeMax-(this.altitudeMax/4); //não faz sentindo o 
            System.out.println("Avião voando a "+velocidade+"km/h e "+altura+" metros");
        }
    }

    @Override
    protected void abastecer(){
        System.out.println("Abastecendo com querosene de aviação...");
    }


}
