package dominio;

public enum StatusAtivo {
    DISPONIVEL(1, "Disponivel para Uso!"), ALUGADO(2, "Alugado no Momento!"), EM_MANUTENCAO(3, "Em Manutenção!");

    private int id;
    private String descricao;
    StatusAtivo(int id, String descricao){
        this.id = id;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }
}
