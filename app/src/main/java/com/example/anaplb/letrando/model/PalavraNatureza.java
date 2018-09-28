package com.example.anaplb.letrando.model;

import android.annotation.SuppressLint;
import android.os.Parcel;

import com.example.anaplb.letrando.R;

import java.util.ArrayList;

public class PalavraNatureza extends Palavra {
    public PalavraNatureza(String nome, int idImagem, int idSom) {
        super(nome, idImagem, idSom);
    }

    public PalavraNatureza() {
        super("", 0, 0);
    }

    @Override
    public ArrayList<Palavra> recursos() {
        ArrayList<String> nomes = retornandoNomes();
        ArrayList<Integer> imgs = retornandoImagens();
        ArrayList<Palavra> palavras = new ArrayList<>();

        for(int i = 0; i < nomes.size(); i++) {
            Palavra p = new PalavraNatureza(nomes.get(i), imgs.get(i), 0);

            palavras.add(p);
        }

        return palavras;
    }

    public ArrayList<String> retornandoNomes() {
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("abelha");
        nomes.add("árvore");
        nomes.add("bode");
        nomes.add("flor");
        nomes.add("galo");
        nomes.add("gato");
        nomes.add("lua");
        nomes.add("nuvem");
        nomes.add("praia");
        nomes.add("rio");
        nomes.add("sol");
        nomes.add("vaca");

        return nomes;
    }

    public ArrayList<Integer> retornandoImagens() {
        ArrayList<Integer> imgs = new ArrayList<>();

        imgs.add(R.drawable.abelha);
        imgs.add(R.drawable.arvore);
        imgs.add(R.drawable.bode);
        imgs.add(R.drawable.flor);
        imgs.add(R.drawable.galo);
        imgs.add(R.drawable.gato);
        imgs.add(R.drawable.moon);
        imgs.add(R.drawable.nuvem);
        imgs.add(R.drawable.praia);
        imgs.add(R.drawable.rio);
        imgs.add(R.drawable.sol);
        imgs.add(R.drawable.vaca);

        return imgs;
    }

}
