package dominio;

import exceptions.SaldoInsuficienteException;
import exceptions.TransacaoInvalidaException;

import java.util.Calendar;

public class ContaCorrente extends ContaBancaria implements Taxavel {
    private static final int TAXA_CONTA_CORRENTE = 15;
    private double limiteChequeEspecial;

    public ContaCorrente(String titular, String numeroConta, double saldo, double limiteChequeEspecial) {
        super(titular, numeroConta, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void processarTransferencia(double valor, TipoTransacao tipo) throws SaldoInsuficienteException {
        if (valor <= 0) {
            throw new TransacaoInvalidaException("Erro: Valor da transação deve ser maior que 0");
        } else if (valor > this.saldo + limiteChequeEspecial) {
            throw new SaldoInsuficienteException("Erro: Saldo insuficiente");
        } else {
            if(tipo == TipoTransacao.DEPOSITO) {
                this.saldo += valor;
            } else {
                this.saldo -= valor;
            }
            System.out.println("Transação Concluida com sucesso!");
            System.out.println("Saldo atual: R$ " + this.saldo);
        }
    }

    @Override
    public double calcularTaxaMensal() {
        return TAXA_CONTA_CORRENTE;
    }
}
