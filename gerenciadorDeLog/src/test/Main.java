package test;

import dominio.GerenciadorDeLogs;
import dominio.Jogador;

public class Main {
    public static void main(String[] args) {
        GerenciadorDeLogs gerenciador = new GerenciadorDeLogs();
        Jogador teste = new Jogador("teste", "Jett");

        gerenciador.criarDiretorioPadrao();
        gerenciador.criarArquivoDeLog(teste);
    }
}
