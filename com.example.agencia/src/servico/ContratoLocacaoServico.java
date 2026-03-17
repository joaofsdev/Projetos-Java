package servico;

import dominio.AtivoCriativo;
import dominio.Cliente;
import dominio.StatusAtivo;

import java.util.Arrays;

public class ContratoLocacaoServico {
    public static void fecharContrato(Cliente cliente, AtivoCriativo[] itens, int dias) {
        double valorTotalDiaria = 0;
        double valorTotalSeguro = 0;
        boolean sucesso = false;
        for (AtivoCriativo item : itens) {
            if (item.getStatusAtivo() != StatusAtivo.DISPONIVEL) {
                System.out.println("Item " + item.getNome() + " não está disponivel");
            } else {
                item.setStatusAtivo(StatusAtivo.ALUGADO);
                valorTotalDiaria += (item.calcularDiaria() * dias);
                valorTotalSeguro += item.calcularSeguro();
                sucesso = true;
            }
        }
        if (sucesso) {
            cliente.setItensAlugados(itens);
            System.out.println("----- Recibo -----");
            System.out.println("Nome do cliente: " + cliente.getNome());
            System.out.println("Valor total aluguel: " + valorTotalDiaria);
            System.out.println("Valor total seguro: " + valorTotalSeguro);
            System.out.println("TOTAL A PAGAR: R$ " + (valorTotalDiaria + valorTotalSeguro));
            System.out.println("------------------------");
        }

    }
}
