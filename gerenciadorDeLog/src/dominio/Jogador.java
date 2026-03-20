package dominio;

public class Jogador {
    private String nickname;
    private String agenteEscolhido;

    public Jogador(String nickname, String agenteEscolhido) {
        this.nickname = nickname;
        this.agenteEscolhido = agenteEscolhido;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAgenteEscolhido() {
        return agenteEscolhido;
    }

    public void setAgenteEscolhido(String agenteEscolhido) {
        this.agenteEscolhido = agenteEscolhido;
    }
}
