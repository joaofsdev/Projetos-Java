package dominio;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ReservaSalaReuniao extends Reserva {

    public ReservaSalaReuniao(String nomeCliente, Calendar dataInicio, Calendar dataFim, double valorDiaria) {
        super(nomeCliente, dataInicio, dataFim, valorDiaria);
    }

    @Override
    public String gerarContrato() {
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

        StringBuilder sb = new StringBuilder();

        sb.append("=== CONTRATO DE LOCAÇÃO ===\n")
                .append("Locatário: ").append(getNomeCliente()).append("\n")
                .append("Período: ").append(formatador.format(getDataInicio().getTime()))
                .append(" a ").append(formatador.format(getDataFim().getTime())).append("\n")
                .append("===========================\n");

        return sb.toString();
    }
}