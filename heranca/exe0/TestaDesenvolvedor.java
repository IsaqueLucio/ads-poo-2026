package poo_ads2026.heranca.exe0;

import java.util.ArrayList;
import java.util.List;

public class TestaDesenvolvedor {
    public static void main(String[] args){
        
        List <Desenvolvedor> listDesenvolvedores = new ArrayList<>();

        Junior devJunior = new Junior("Isaque", "Java", 4000, "Gemini");
        Pleno devPleno = new Pleno("Thiago", "Ruby", 8000, 4);
        Senior devSenior = new Senior("Arthur", "Python", 13000, 700);

        listDesenvolvedores.add(devJunior);
        listDesenvolvedores.add(devPleno);
        listDesenvolvedores.add(devSenior);

        for(Desenvolvedor f: listDesenvolvedores){
            System.out.println(f.toString());
            f.codar();
            Double bonus = f.calcularBonus();
            System.out.println("Bonus do desenvolvedor: "+bonus);
            
        }


      
    }
}
