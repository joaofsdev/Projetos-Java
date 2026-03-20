package dominio;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GerenciadorDeLogs {
    public void criarDiretorioPadrao() {
        File diretorio = new File("C:\\Projetos\\Projetos-Java\\gerenciadorDeLog\\historico_partida");
        if (!diretorio.exists()) {
            diretorio.mkdir();
            System.out.println("Pasta raiz criada com sucesso!");
        } else {
            System.out.println("Pasta raiz operante!");
        }
    }

    public void criarArquivoDeLog(Jogador jogador) {
        SimpleDateFormat formatoData = new SimpleDateFormat("dd-MM-yyyy");
        String dataHoje = formatoData.format(new Date());
        String nomeDoArquivo = "log_" + jogador.getNickname() + "_" + jogador.getAgenteEscolhido() + "_" + dataHoje + ".txt";
        File log = new File("C:\\Projetos\\Projetos-Java\\gerenciadorDeLog\\historico_partida\\" + nomeDoArquivo);
        try {
            boolean isCreated = log.createNewFile();
            if (isCreated) {
                System.out.println("Arquivo criado com sucesso!");
                System.out.println("Caminho absoluto: " + log.getAbsolutePath());
            } else {
                System.out.println("Aviso: O log dessa partida já existe no HD.");
            }
        } catch (IOException e) {
            System.out.println("Erro crítico ao tentar acessar o disco rígido: " + e.getMessage());
        }
    }
}
