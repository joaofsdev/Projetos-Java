package dominio;

import exceptions.PeriodoInvalidoException;

// 1. Removi o "abstract" para podermos instanciar (dar o "new" lá na Main)
public class ImpressoraContrato implements AutoCloseable {

    public void imprimir(Reserva reserva) throws PeriodoInvalidoException {
        reserva.validarReserva();
        System.out.println(reserva.gerarContrato());
    }

    @Override
    public void close() {
        System.out.println("Desligando impressora de PDF e limpando fila de impressão...");
    }
}