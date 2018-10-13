package com.example.anaplb.letrando.model;

import android.annotation.SuppressLint;
import android.os.Parcel;

import com.example.anaplb.letrando.R;

import java.util.ArrayList;

public class PalavraCozinha extends Palavra{

    public PalavraCozinha(String nome, int idImagem, int idSom) {
        super(nome, idImagem, idSom);
    }

    public PalavraCozinha() {
        super("", 0, 0);
    }

    @Override
    public ArrayList<Palavra> recursos() {
        ArrayList<String> nomes = retornandoNomes();
        ArrayList<Integer> imgs = retornandoImagens();
        ArrayList<Integer> audio = retornandoAudios();
        ArrayList<Palavra> palavras = new ArrayList<>();

        for(int i = 0; i < nomes.size(); i++) {
            Palavra p = new PalavraCozinha(nomes.get(i), imgs.get(i), audio.get(i));

            palavras.add(p);
        }

        return palavras;
    }

    public ArrayList<String> retornandoNomes() {
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("colher");
        nomes.add("faca");
        nomes.add("fogão");
        nomes.add("garfo");
        nomes.add("geladeira");
        nomes.add("mesa");
        nomes.add("pia");
        nomes.add("prato");
        nomes.add("ralo");
        nomes.add("torneira");

        return nomes;
    }

    public ArrayList<Integer> retornandoImagens() {
        ArrayList<Integer> imgs = new ArrayList<>();

        imgs.add(R.drawable.colher);
        imgs.add(R.drawable.faca);
        imgs.add(R.drawable.fogao);
        imgs.add(R.drawable.garfo);
        imgs.add(R.drawable.geladeira);
        imgs.add(R.drawable.mesa);
        imgs.add(R.drawable.sink);
        imgs.add(R.drawable.prato);
        imgs.add(R.drawable.ralo);
        imgs.add(R.drawable.torneira);

        return imgs;
    }

    @Override
    public ArrayList<Integer> retornandoAudios() {
        ArrayList<Integer> audio = new ArrayList<>();

        audio.add(R.raw.colher);
        audio.add(R.raw.faca);
        audio.add(R.raw.fogao);
        audio.add( R.raw.garfo);
        audio.add(R.raw.geladeira);
        audio.add(R.raw.mesa);
        audio.add(R.raw.pia);
        audio.add(R.raw.prato);
        audio.add(R.raw.ralo);
        audio.add(R.raw.torneira);

        return audio;

    }

}
