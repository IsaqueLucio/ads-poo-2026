package poo_ads2026.todoparte.classesdeassociacao.exe1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Consulta {
    
    private LocalDateTime dataConsulta;
    private double valorConsulta;
    private Medico medico;
    private Paciente paciente;

    public Consulta() {

    }

    public Consulta(LocalDateTime dataConsulta, double valorConsulta, Medico medico, Paciente paciente) {
        this.dataConsulta = dataConsulta;
        this.valorConsulta = valorConsulta;
        this.medico = medico;
        this.paciente = paciente;
    }

    DateTimeFormatter formatoBr = DateTimeFormatter.ofPattern("dd/MM/yyyy ás HH:mm");

    @Override
    public String toString() {
        return "\nConsulta [dataConsulta=" + dataConsulta.format(formatoBr) + ", valorConsulta=" + valorConsulta + ", medico=" + medico
                + ", paciente=" + paciente + "]\n";
    }

    public LocalDateTime getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(LocalDateTime dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public double getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
}
