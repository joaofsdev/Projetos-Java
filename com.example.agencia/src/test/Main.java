package test;

import dominio.*;
import servico.ContratoLocacaoServico;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Joao", "141.041.081-31");
        VeiculoCena carro = new VeiculoCena("1", "BMW 320i", 210000);
        PecaStreetwear jaqueta = new PecaStreetwear("1", "Jaqueta Supreme x Champion", 3000);
        EquipamentoFotografico camera = new EquipamentoFotografico("1", "Camera Sony", 5500);

        AtivoCriativo[] itens = {carro, jaqueta, camera};

        ContratoLocacaoServico.fecharContrato(cliente, itens, 2);
    }
}
