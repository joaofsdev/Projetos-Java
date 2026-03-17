package dominio;

public class VeiculoCena extends AtivoCriativo implements Manutencao {
    private static final double TAXA_DIARIA_POR_CENTO = 0.01;
    private static final double TAXA_SEGURO_POR_CENTO = 0.05;

    public VeiculoCena(String codigoRegistro, String nome, double valorDeMercado) {
        super(codigoRegistro, nome, valorDeMercado);
    }

    @Override
    public double calcularDiaria() {
        return this.valorDeMercado * TAXA_DIARIA_POR_CENTO;
    }

    public double calcularSeguro() {
        return this.valorDeMercado * TAXA_SEGURO_POR_CENTO;
    }

    @Override
    public void realizarLimpezaOuReparo() {
        Manutencao.super.realizarLimpezaOuReparo();
    }
}
