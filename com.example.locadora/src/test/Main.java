package test;

import dominio.CarroLuxo;
import dominio.CarroPopular;
import dominio.GeradorDeReserva;
import dominio.Veiculo;
import excecoes.DiasInvalidosException;
import excecoes.VeiculoIndisponivelException;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Veiculo> frota = new ArrayList<Veiculo>();
        GeradorDeReserva.inicializarDiretorio();

        CarroLuxo c1 = new CarroLuxo("MDP1D01", "Ferrari Spider", 400, false);
        CarroLuxo c2 = new CarroLuxo("MDZ2H02", "Mercedes Benz GLA 200", 300, false);
        CarroPopular c3 = new CarroPopular("MDG3K01", "Chevrolet Astra", 50, false);
        CarroPopular c4 = new CarroPopular("FPZ4U51", "Volkswagem Saveiro", 120, true);

        frota.add(c1);
        frota.add(c2);
        frota.add(c3);
        frota.add(c4);

        Scanner input = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("---- Menu ----");
            System.out.println("[1] Ver Frota");
            System.out.println("[2] Alugar Veiculo");
            System.out.println("[3] Sair");
            int opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1:
                    for (Veiculo v : frota) {
                        System.out.println("Carro: " + v.getModelo() + "\n" + "Placa: " + v.getPlaca() + "\n" + "Alugado: " + v.isAlugado() + "\n");
                    }
                    break;
                case 2:
                    System.out.println("Digite seu nome: ");
                    String nomeCliente = input.nextLine();

                    System.out.println("Qual a placa do veículo que deseja alugar?");
                    String placa = input.nextLine();

                    System.out.println("Digite a quantidade de dias que deseja alugar: ");
                    int dias = input.nextInt();
                    input.nextLine();

                    boolean veiculoEncontrado = false;

                    for (Veiculo v : frota) {
                        if (v.getPlaca().equalsIgnoreCase(placa)) {
                            veiculoEncontrado = true;

                            try {
                                if (dias <= 0) {
                                    throw new DiasInvalidosException("Erro: A quantidade de dias deve ser maior que zero!");
                                }
                                if (v.isAlugado()) {
                                    throw new VeiculoIndisponivelException("Erro: Este veículo já está alugado por outro cliente!");
                                }

                                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                                String dataHoje = sdf.format(new Date());

                                v.setAlugado(true);
                                System.out.println(v.gerarRecibo(dias));

                                GeradorDeReserva.emitirArquivoReserva(v, nomeCliente, dataHoje);

                            } catch (DiasInvalidosException | VeiculoIndisponivelException e) {
                                System.out.println(e.getMessage());
                            }

                            break;
                        }
                    }

                    if (!veiculoEncontrado) {
                        System.out.println("Erro: Veículo com a placa " + placa + " não encontrado na frota.");
                    }
                    break;

                case 3:
                    continuar = false;
                    System.out.println("Encerrando sistema...");
                    break;
                default:
                    System.out.println("Escolha uma opção valida!");
                    break;

            }
        }
    }
}
