package com.example.anaplb.letrando.model;

import android.annotation.SuppressLint;
import android.os.Parcel;

import com.example.anaplb.letrando.R;

import java.util.ArrayList;


public class PalavraComida extends Palavra{

    public PalavraComida(String nome, int idImagem, int idSom) {
        super(nome, idImagem, idSom);
    }

    public PalavraComida() {
        super("", 0, 0);
    }

    @Override
    public ArrayList<Palavra> recursos() {
        ArrayList<String> nomes = retornandoNomes();
        ArrayList<Integer> imgs = retornandoImagens();
        ArrayList<Integer> audio = retornandoAudios();
        ArrayList<Palavra> palavras = new ArrayList<>();

        for(int i = 0; i < nomes.size(); i++) {
            Palavra p = new PalavraComida(nomes.get(i), imgs.get(i), audio.get(i));

            palavras.add(p);
        }
        return palavras;
    }

    public ArrayList<String> retornandoNomes() {
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("arroz");
        nomes.add("batata");
        nomes.add("bolo");
        nomes.add("carne");
        nomes.add("feijão");
        nomes.add("macarrão");
        nomes.add("ovo");
        nomes.add("peixe");
        nomes.add("sorvete");
        nomes.add("tomate");

        return nomes;
    }

    public ArrayList<Integer> retornandoImagens() {
        ArrayList<Integer> imgs = new ArrayList<>();

        imgs.add(R.drawable.arroz);
        imgs.add(R.drawable.batata);
        imgs.add(R.drawable.bolo);
        imgs.add(R.drawable.carne);
        imgs.add(R.drawable.feijao);
        imgs.add(R.drawable.macarrao);
        imgs.add(R.drawable.ovo);
        imgs.add(R.drawable.peixe);
        imgs.add(R.drawable.sorvete);
        imgs.add(R.drawable.tomate);

        return imgs;
    }

    @Override
    public ArrayList<Integer> retornandoAudios() {
        ArrayList<Integer> audio = new ArrayList<>();

        audio.add(R.raw.arroz);
        audio.add(R.raw.batata);
        audio.add(R.raw.bolo);
        audio.add( R.raw.carne);
        audio.add(R.raw.feijao);
        audio.add(R.raw.macarrao);
        audio.add(R.raw.ovo);
        audio.add(R.raw.peixe);
        audio.add(R.raw.sorvete);
        audio.add(R.raw.tomate);

        return audio;

    }

}
