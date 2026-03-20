package dominio;

import java.io.File;
import java.io.IOException;

public class GeradorDeReserva {
    public static void inicializarDiretorio() {
        File diretorio = new File("C:\\Projetos\\Projetos-Java\\com.example.locadora\\reservas");
        if (!diretorio.exists()) {
            boolean isCreated = diretorio.mkdir();
            System.out.println("Diretorio no criado com sucesso");
            System.out.println("Caminho Absoluto: " + diretorio.getAbsolutePath());
        } else {
            System.out.println("Pasta raiz operante!");
        }
    }

    public static void emitirArquivoReserva(Veiculo veiculo, String nomeCliente, String dataHoje) {
        String nomeArquivo = "reserva_ " + nomeCliente + " _ " + veiculo.getPlaca() + " _ " + dataHoje + ".txt ";
        File reserva = new File("C:\\Projetos\\Projetos-Java\\com.example.locadora\\reservas\\", nomeArquivo);
        try {
            boolean isCreated = reserva.createNewFile();
            System.out.println("Arquivo gerado com sucesso");
            System.out.println("Caminho Absoluto: " + reserva.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
