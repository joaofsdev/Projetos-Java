package dominio;

public abstract class ServicoAudiovisual implements Precificavel, Preparacao {
    protected String nomeCliente;
    protected double valorBase;
    protected TipoCenario cenario;

    public ServicoAudiovisual(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public ServicoAudiovisual(String nomeCliente, double valorBase) {
        this.nomeCliente = nomeCliente;
        this.valorBase = valorBase;
    }

    public ServicoAudiovisual(String nomeCliente, double valorBase, TipoCenario cenario) {
        this.nomeCliente = nomeCliente;
        this.valorBase = valorBase;
        this.cenario = cenario;
    }

    public abstract double calcularCustoTotal();

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

    public TipoCenario getCenario() {
        return cenario;
    }

    public void setCenario(TipoCenario cenario) {
        this.cenario = cenario;
    }
}
