package dominio;

import exceptions.SaldoInsuficienteException;
import exceptions.TransacaoInvalidaException;

public class ContaPoupanca extends ContaBancaria implements Taxavel {

    public ContaPoupanca(String titular, String numeroConta, double saldo) {
        super(titular, numeroConta, saldo);
    }

    @Override
    public void processarTransferencia(double valor, TipoTransacao tipo) throws SaldoInsuficienteException {
        if (valor <= 0) {
            throw new TransacaoInvalidaException("Erro: Valor da transação deve ser maior que 0");
        } else if (valor > this.saldo) {
            throw new SaldoInsuficienteException("Erro: Saldo insuficiente");
        } else {
            if(tipo == TipoTransacao.DEPOSITO){
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
        return 0;
    }
}
