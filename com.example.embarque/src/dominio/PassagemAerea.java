package dominio;

public abstract class PassagemAerea implements Fidelidade {
    protected String nomePassageiro;
    protected String numeroVoo;
    protected StatusVoo status;

    public PassagemAerea(String nomePassageiro) {
        this.nomePassageiro = nomePassageiro;
    }

    public PassagemAerea(String nomePassageiro, String numeroVoo) {
        this.nomePassageiro = nomePassageiro;
        this.numeroVoo = numeroVoo;
    }

    public PassagemAerea(String nomePassageiro, String numeroVoo, StatusVoo status) {
        this.nomePassageiro = nomePassageiro;
        this.numeroVoo = numeroVoo;
        this.status = status;
    }

    public abstract void exibirRegrasBagagem();

    public void setNomePassageiro(String nomePassageiro) {
        this.nomePassageiro = nomePassageiro;
    }

    public void setNumeroVoo(String numeroVoo) {
        this.numeroVoo = numeroVoo;
    }

    public void setStatus(StatusVoo status) {
        this.status = status;
    }

    public String getNomePassageiro() {
        return nomePassageiro;
    }

    public String getNumeroVoo() {
        return numeroVoo;
    }

    public StatusVoo getStatus() {
        return status;
    }
}
