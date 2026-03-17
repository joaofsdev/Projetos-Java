package dominio;

import exceptions.DocumentoInvalidoException;
import exceptions.EmbarqueNegadoException;

public class CatracaEletronica implements AutoCloseable {
    public void autorizarEmbarque(PassagemAerea passagem) throws EmbarqueNegadoException {
        if (passagem.status != StatusVoo.EMBARCANDO) {
            throw new EmbarqueNegadoException("O voo já foi encerrado ou ainda não começou o embarque!");
        } else if (passagem instanceof PassagemInternacional) {
            if (((PassagemInternacional) passagem).passaporte == null) {
                throw new DocumentoInvalidoException("Passaporte invalido!");
            }
        }
        System.out.println("Embarque liberado para " + passagem.nomePassageiro + "! Milhas acumuladas: " + passagem.calcularMilhas());
    }

    public void close(){
        System.out.println("Travando catraca eletrônica e encerrando conexão com o servidor da Airlines...");
    }
}
