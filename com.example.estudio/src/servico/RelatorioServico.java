package servico;

import dominio.ServicoAudiovisual;

public class RelatorioServico {
    public static void imprimirFechamento(ServicoAudiovisual servico) {
        System.out.println("=== Fechamento de Contrato ===");
        servico.prepararSet();
        System.out.println("Custo Total: R$ " + servico.calcularCustoTotal());
        System.out.println("Imposto a recolher: R$ " + servico.calcularImposto());
        System.out.println("==================================================");
    }
}
