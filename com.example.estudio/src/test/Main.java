package test;

import dominio.EnsaioFotografico;
import dominio.ServicoAudiovisual;
import dominio.SessaoPodcast;
import dominio.TipoCenario;
import servico.RelatorioServico;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ServicoAudiovisual servico;
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n === Estudio ===");
            System.out.println("1. Agendar Ensaio Fotográfico Noturno");
            System.out.println("2. Agendar Sessão de Podcast");
            System.out.println("0. Sair");
            System.out.println("Escolha uma opção: ");
            System.out.println("=============================");
            int opcao = input.nextInt();
            input.nextLine();

            if(opcao == 0){
                System.out.println("Encerrando sistema...");
                continuar = false;
                continue;
            }

            System.out.println("O nome do cliente: ");
            String nomeCliente = input.nextLine();

            System.out.println("Digite o valor base: R$ ");
            double valorBase = input.nextDouble();
            input.nextLine();


            switch (opcao) {
                case 1:
                    servico = new EnsaioFotografico(nomeCliente, valorBase, TipoCenario.RUA_NOTURNA);
                    break;

                case 2:
                    servico = new SessaoPodcast(nomeCliente, valorBase, TipoCenario.ESTUDIO_PODCAST);
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    continue;
            }

            RelatorioServico.imprimirFechamento(servico);
        }
    }
}
