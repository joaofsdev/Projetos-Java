package dominio;

import exceptions.PeriodoInvalidoException;

import java.util.Calendar;

public abstract class Reserva {
    protected String nomeCliente;
    protected Calendar dataInicio;
    protected Calendar dataFim;
    protected double valorDiaria;

    public Reserva(String nomeCliente, Calendar dataInicio, Calendar dataFim, double valorDiaria) {
        this.nomeCliente = nomeCliente.trim().toUpperCase();
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.valorDiaria = valorDiaria;
    }

    public void validarReserva() throws PeriodoInvalidoException {
        if(this.dataFim.before(this.dataInicio)) {
            throw new PeriodoInvalidoException("Erro: O check-out não pode ser feito antes da data do check-in");
        }
    }

    public abstract String gerarContrato();

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente.trim().toUpperCase();
    }

    public Calendar getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Calendar dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Calendar getDataFim() {
        return dataFim;
    }

    public void setDataFim(Calendar dataFim) {
        this.dataFim = dataFim;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }
}