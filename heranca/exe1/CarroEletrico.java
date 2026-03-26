package poo_ads2026.heranca.exe1;

public class CarroEletrico extends Veiculo{
    
    protected int autonomiaBateria;

    public CarroEletrico(String marca, String modelo, int autonomiaBateria) {
        super(marca, modelo);
        this.autonomiaBateria = autonomiaBateria;
    }

    @Override
    protected void mover(double velMov){
        if(velMov <= 0){
            System.out.println("Para acelerar e se mover precisa ser um valor positivo maior que zero.");
        } else{
            this.velocidade += velMov;
            System.out.println("Carro elétrico movendo-se silenciosamente");
        }
    }

    @Override
    protected void abastecer(){
        System.out.println("Recarregando bateria em posto de carga rápida");
    }

    @Override
    public String toString() {
        return "CarroEletrico [autonomiaBateria=" + autonomiaBateria + "]";
    }

    public int getAutonomiaBateria() {
        return autonomiaBateria;
    }

    public void setAutonomiaBateria(int autonomiaBateria) {
        this.autonomiaBateria = autonomiaBateria;
    }

    

}
