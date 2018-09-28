package com.example.anaplb.letrando.model;

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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdImagem() {
        return idImagem;
    }

    public void setIdImagem(int idImagem) {
        this.idImagem = idImagem;
    }

    public int getIdSom() {
        return idSom;
    }

    public void setIdSom(int idSom) {
        this.idSom = idSom;
    }

    public abstract ArrayList<Palavra> recursos();

    public void checando() {};

    public abstract ArrayList<String> retornandoNomes();

    public abstract ArrayList<Integer> retornandoImagens();



}
