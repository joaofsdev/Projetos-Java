package dominio;

public class CarroLuxo extends Veiculo {
    public CarroLuxo(String placa, String modelo, double valorDiaria, boolean alugado) {
        super(placa, modelo, valorDiaria, alugado);
    }

    @Override
    public double calcularSeguro() {
        return this.valorDiaria * 0.15;
    }
}
