package model;

import java.util.ArrayList;

public abstract class Palavra {
    protected String nome;
    protected int idImagem;
    protected int idSom;

    public Palavra(String nome, int idImagem, int idSom) {
        this.nome = nome;
        this.idImagem = idImagem;
        this.idSom = idSom;
    }

    public abstract ArrayList<Palavra> recursos();

}
