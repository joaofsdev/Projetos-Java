package dominio;

public class AuditoriaBacen implements AutoCloseable {
    public void registrarOperacao(ContaBancaria conta, double valor, TipoTransacao tipo) {
        System.out.println("Log Bacen: " + tipo + " de R$ " + valor + " na conta " + conta.getNumeroConta() + " registrado com sucesso.");
    }

    @Override
    public void close(){
        System.out.println("Criptografando dados e encerrando conexão com Banco Central...");
    }
}
