package dominio;

public class Cliente {
    private String nome;
    private String cpf;
    private AtivoCriativo[] itensAlugados;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void imprimirItensAlugados(){
        for (AtivoCriativo itens : itensAlugados){
            System.out.println(itens.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public AtivoCriativo[] getItensAlugados() {
        return itensAlugados;
    }

    public void setItensAlugados(AtivoCriativo[] itensAlugados) {
        this.itensAlugados = itensAlugados;
    }
}
