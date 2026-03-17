package dominio;

import exceptions.SaldoInsuficienteException;
import exceptions.TransacaoInvalidaException;

import java.util.Calendar;
import java.text.SimpleDateFormat;

public abstract class ContaBancaria {
    protected String titular;
    protected String numeroConta;
    protected double saldo;
    Calendar dataAbertura;

    {
        this.dataAbertura = Calendar.getInstance();
    }

    public ContaBancaria(String titular, String numeroConta, double saldo) {
        this.titular = titular.trim().toUpperCase();
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public abstract void processarTransferencia(double valor, TipoTransacao tipo) throws SaldoInsuficienteException;

    public String gerarExtrato() {
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        StringBuilder sb = new StringBuilder();

        sb.append("=== EXTRATO BANCÁRIO ===\n")
                .append("Titular: ").append(this.titular).append("\n")
                .append("Conta: ").append(this.numeroConta).append("\n")
                .append("Data de Abertura: ").append(formatador.format(this.dataAbertura.getTime())).append("\n")
                .append("Saldo Atual: R$ ").append(this.saldo).append("\n")
                .append("========================\n");

        return sb.toString();
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Calendar getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Calendar dataAbertura) {
        this.dataAbertura = dataAbertura;
    }
}
