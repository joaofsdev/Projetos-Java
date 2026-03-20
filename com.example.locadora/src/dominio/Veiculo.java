package dominio;

import java.text.NumberFormat;
import java.util.Locale;

public abstract class Veiculo {
    protected String placa;
    protected String modelo;
    protected double valorDiaria;
    protected boolean alugado;

    public Veiculo(String placa, String modelo, double valorDiaria, boolean alugado) {
        this.placa = placa;
        this.modelo = modelo;
        this.valorDiaria = valorDiaria;
        this.alugado = alugado;
    }

    public String gerarRecibo(int dias) {
        NumberFormat formatadorMoeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        double valorTotal = (this.valorDiaria * dias) + calcularSeguro();

        StringBuilder s = new StringBuilder();

        s.append("---- RECIBO ----\n")
                .append("Placa: ").append(this.placa).append("\n")
                .append("Modelo: ").append(this.modelo).append("\n")
                .append("Período: ").append(dias).append(" dias\n")
                .append("Valor Diária: ").append(formatadorMoeda.format(this.valorDiaria)).append("\n")
                .append("Seguro: ").append(formatadorMoeda.format(calcularSeguro())).append("\n")
                .append("TOTAL A PAGAR: ").append(formatadorMoeda.format(valorTotal)).append("\n")
                .append("==============================\n");

        return s.toString();
    }

    public abstract double calcularSeguro();

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public boolean isAlugado() {
        return alugado;
    }

    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }
}
