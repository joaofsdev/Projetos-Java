package dominio;

public abstract class AtivoCriativo implements Alugavel {
    protected String codigoRegistro;
    protected String nome;
    protected double valorDeMercado;
    protected StatusAtivo statusAtivo;

    {
        this.statusAtivo = StatusAtivo.DISPONIVEL;
    }

    public AtivoCriativo(String codigoRegistro, String nome, double valorDeMercado) {
        this.codigoRegistro = codigoRegistro;
        this.nome = nome;
        this.valorDeMercado = valorDeMercado;
    }

    public abstract double calcularSeguro();

    public String getCodigoRegistro() {
        return codigoRegistro;
    }

    public void setCodigoRegistro(String codigoRegistro) {
        this.codigoRegistro = codigoRegistro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorDeMercado() {
        return valorDeMercado;
    }

    public void setValorDeMercado(double valorDeMercado) {
        this.valorDeMercado = valorDeMercado;
    }

    public StatusAtivo getStatusAtivo() {
        return statusAtivo;
    }

    public void setStatusAtivo(StatusAtivo statusAtivo) {
        this.statusAtivo = statusAtivo;
    }
}
