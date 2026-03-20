package poo_ads2026.todoparte.classesdeassociacao.exe1;

import java.time.LocalDateTime;

public class TestaConsultorio{

    public static void main(String[] args){

        Medico med1 = new Medico("House","Infectologia","CRM/EUA 12345",101);
        Paciente pac1 = new Paciente("Marcos","CPF123",102);

        LocalDateTime dataCo = LocalDateTime.of(2026, 5, 20, 15, 30);
        Consulta con1 = new Consulta(dataCo, 50.00, med1, pac1);
        
        System.out.println(con1);
    }
}