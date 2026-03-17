package dominio;

public class EquipamentoFotografico extends AtivoCriativo {
    private static final double TAXA_DIARIA_POR_CENTO = 0.02;
    private static final double TAXA_SEGURO_POR_CENTO = 0.04;

    public EquipamentoFotografico(String codigoRegistro, String nome, double valorDeMercado) {
        super(codigoRegistro, nome, valorDeMercado);
    }

    @Override
    public double calcularDiaria() {
        return this.valorDeMercado * TAXA_DIARIA_POR_CENTO;
    }

    @Override
    public double calcularSeguro() {
        return this.valorDeMercado * TAXA_SEGURO_POR_CENTO;
    }
}
