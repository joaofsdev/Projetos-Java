package dominio;

public class PecaStreetwear extends AtivoCriativo implements Manutencao {
    private static final double TAXA_DIARIA_POR_CENTO = 0.03;
    private static final double TAXA_SEGURO_POR_CENTO = 0.02;

    public PecaStreetwear(String codigoRegistro, String nome, double valorDeMercado) {
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

    @Override
    public void realizarLimpezaOuReparo() {
        Manutencao.super.realizarLimpezaOuReparo();
    }
}
