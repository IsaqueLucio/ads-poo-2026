package poo_ads2026.heranca.exe1;

import java.util.ArrayList;
import java.util.List;

public class TestaSistemaDeVeiculos {
    public static void main(String[] args) {
        
        List <Veiculo> listaVeiculos = new ArrayList<>();

        Aviao aviao = new Aviao("Boeing", "787", 13140);
        CarroEletrico carroEletrico = new CarroEletrico("BYD", "Seal", 372);

        listaVeiculos.add(aviao);
        listaVeiculos.add(carroEletrico);

        for(Veiculo f: listaVeiculos){
            f.mover(100);
        }
    }
}
