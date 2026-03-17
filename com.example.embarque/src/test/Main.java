package test;

import dominio.CatracaEletronica;
import dominio.PassagemInternacional;
import dominio.PassagemNacional;
import dominio.StatusVoo;
import exceptions.DocumentoInvalidoException;
import exceptions.EmbarqueNegadoException;

public class Main {
    public static void main(String[] args) {
        PassagemInternacional passagemInternacional = new PassagemInternacional("Joao", "023", StatusVoo.AGUARDANDO, "1322");
        PassagemNacional passagemNacional = new PassagemNacional("Vanessa", "024", StatusVoo.EMBARCANDO, "002");

        try(CatracaEletronica catracaEletronica = new CatracaEletronica()){
            catracaEletronica.autorizarEmbarque(passagemNacional);
        }   catch (DocumentoInvalidoException | EmbarqueNegadoException e){
            System.out.println(e.getMessage());
        }
    }
}
