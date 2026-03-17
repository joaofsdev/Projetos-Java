package dominio;

public class SessaoPodcast extends ServicoAudiovisual {
    private static final double TAXA_MASTERIZACAO_POR_CENTO = 0.10;
    private static final double TAXA_IMPOSTO_POR_CENTO = 0.08;

    public SessaoPodcast(String nomeCliente) {
        super(nomeCliente);
    }

    public SessaoPodcast(String nomeCliente, double valorBase) {
        super(nomeCliente, valorBase);
    }

    public SessaoPodcast(String nomeCliente, double valorBase, TipoCenario cenario) {
        super(nomeCliente, valorBase, cenario);
    }

    @Override
    public double calcularCustoTotal() {
        return this.valorBase + (this.valorBase * TAXA_MASTERIZACAO_POR_CENTO);
    }

    @Override
    public double calcularImposto() {
        return calcularCustoTotal() * TAXA_IMPOSTO_POR_CENTO;
    }

    @Override
    public void prepararSet() {
        System.out.println("Testando microfones e isolamento acústico de sala de gravação...");
    }
}
