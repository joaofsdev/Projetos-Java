package dominio;

public interface Manutencao {
    default void realizarLimpezaOuReparo(){
        System.out.println("Enviado para manutenção!");
    }
}
