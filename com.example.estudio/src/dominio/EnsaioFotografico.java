package dominio;

public class EnsaioFotografico extends ServicoAudiovisual{
    private static final double TAXA_EDICAO_POR_CENTO = 0.20;
    private static final double TAXA_IMPOSTO_POR_CENTO = 0.05;

    public EnsaioFotografico(String nomeCliente) {
        super(nomeCliente);
    }

    public EnsaioFotografico(String nomeCliente, double valorBase) {
        super(nomeCliente, valorBase);
    }

    public EnsaioFotografico(String nomeCliente, double valorBase, TipoCenario cenario) {
        super(nomeCliente, valorBase, cenario);
    }

    @Override
    public double calcularCustoTotal() {
        return this.valorBase + (this.valorBase * TAXA_EDICAO_POR_CENTO) ;
    }

    @Override
    public double calcularImposto() {
        return calcularCustoTotal() * TAXA_IMPOSTO_POR_CENTO;
    }

    @Override
    public void prepararSet() {
        System.out.println("Ajustando iluminação externa e lentes para fotografica urbana...");
    }
}
