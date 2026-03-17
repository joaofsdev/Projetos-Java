package test;

import dominio.ImpressoraContrato;
import dominio.ReservaSalaReuniao;
import exceptions.PeriodoInvalidoException;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();

        c1.getTime();
        c2.getTime();


        ReservaSalaReuniao reserva = new ReservaSalaReuniao("   JoAo  ", c1, c2, 200);

        try (ImpressoraContrato impressora = new ImpressoraContrato()) {
            impressora.imprimir(reserva);
        } catch (PeriodoInvalidoException e) {
            System.out.println("Erro Capturado: " + e.getMessage());
        }
    }
}
