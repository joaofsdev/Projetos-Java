package dominio;

public class PassagemNacional extends PassagemAerea {
    private String rg;

    public PassagemNacional(String nomePassageiro, String numeroVoo, StatusVoo status, String rg) {
        super(nomePassageiro, numeroVoo, status);
        this.rg = rg;
    }

    public int calcularMilhas() {
        return 500;
    }

    public void exibirRegrasBagagem() {
        System.out.println("Permitido 1 mala de 10kg na cabine");
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
}
