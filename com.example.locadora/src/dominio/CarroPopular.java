package dominio;

public class CarroPopular extends Veiculo {
    public CarroPopular(String placa, String modelo, double valorDiaria, boolean alugado) {
        super(placa, modelo, valorDiaria, alugado);
    }

    public double calcularSeguro(){
        return 50;
    }
}
