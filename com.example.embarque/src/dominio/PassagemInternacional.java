package dominio;

public class PassagemInternacional extends PassagemAerea {
    protected String passaporte;

    public PassagemInternacional(String nomePassageiro, String numeroVoo, StatusVoo status, String passaporte) {
        super(nomePassageiro, numeroVoo, status);
        this.passaporte = passaporte;
    }

    public int calcularMilhas() {
        return 2000;
    }

    @Override
    public void exibirRegrasBagagem() {
        System.out.println("Permitido 2 malas de 23kg despachadas");
    }

    public String getPassaporte() {
        return passaporte;
    }

    public void setPassaporte(String passaporte) {
        this.passaporte = passaporte;
    }
}
