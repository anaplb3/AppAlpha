package recursos;

import model.Palavra;
import model.PalavraCidade;
import model.PalavraComida;
import model.PalavraCor;
import model.PalavraCozinha;
import model.PalavraFruta;
import model.PalavraNatureza;

public class PalavraFactory {

    public Palavra pegandoObjeto(String nome, int idImagem, int idSom, int idTema) {
        if(idTema == 0) {
            return new PalavraCidade(nome, idImagem, idSom);
        } else if(idTema == 1) {
            return new PalavraComida(nome, idImagem, idSom);
        } else if(idTema == 2) {
            return new PalavraCor(nome, idImagem, idSom);
        } else if(idTema == 3) {
            return new PalavraCozinha(nome, idImagem, idSom);
        } else if(idTema == 4) {
            return new PalavraFruta(nome, idImagem, idSom);
        } else if(idTema == 5) {
            return new PalavraNatureza(nome, idImagem, idSom);
        }
        return null;
    }
}
