package com.example.anaplb.letrando.model;

import android.annotation.SuppressLint;
import android.os.Parcel;

import com.example.anaplb.letrando.R;

import java.util.ArrayList;


public class PalavraCor extends Palavra{

    public PalavraCor(String nome, int idImagem, int idSom) {
        super(nome, idImagem, idSom);
    }

    public PalavraCor() {
        super("", 0, 0);
    }

    @Override
    public ArrayList<Palavra> recursos() {
        ArrayList<String> nomes = retornandoNomes();
        ArrayList<Integer> imgs = retornandoImagens();
        ArrayList<Palavra> palavras = new ArrayList<>();

        for(int i = 0; i < nomes.size(); i++) {
            Palavra p = new PalavraCor(nomes.get(i), imgs.get(i), 0);

            palavras.add(p);
        }
        return palavras;
    }

    public ArrayList<String> retornandoNomes() {
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("amarelo");
        nomes.add("azul");
        nomes.add("branco");
        nomes.add("laranja");
        nomes.add("marrom");
        nomes.add("preto");
        nomes.add("rosa");
        nomes.add("roxo");
        nomes.add("verde");
        nomes.add("vermelho");

        return nomes;
    }

    public ArrayList<Integer> retornandoImagens() {
        ArrayList<Integer> imgs = new ArrayList<>();

        imgs.add(R.drawable.amarelo);
        imgs.add(R.drawable.azul);
        imgs.add(R.drawable.branco);
        imgs.add(R.drawable.laranja);
        imgs.add(R.drawable.marrom);
        imgs.add(R.drawable.preto);
        imgs.add(R.drawable.rosa);
        imgs.add(R.drawable.purple);
        imgs.add(R.drawable.verde);
        imgs.add(R.drawable.vermelho);

        return imgs;
    }

}
