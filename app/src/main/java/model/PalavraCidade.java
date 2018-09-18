package model;


import com.example.anaplb.letrando.R;

import java.util.ArrayList;

public class PalavraCidade extends Palavra{

    public PalavraCidade(String nome, int idImagem, int idSom) {
        super(nome, idImagem, idSom);
    }


    @Override
    public ArrayList<Palavra> recursos() {
        ArrayList<String> nomes = retornandoNomes();
        ArrayList<Integer> imgs = retornandoImagens();
        ArrayList<Palavra> palavras = new ArrayList<>();

        for(int i = 0; i < nomes.size(); i++) {
            Palavra p = new PalavraCidade(nomes.get(i), imgs.get(i), 0);

            palavras.add(p);
        }

        return palavras;
    }

    public ArrayList<String> retornandoNomes() {
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("aeroporto");
        nomes.add("escola");
        nomes.add("hospital");
        nomes.add("igreja");
        nomes.add("museu");
        nomes.add("praia");
        nomes.add("restaurante");
        nomes.add("shopping");
        nomes.add("zoologico");

        return nomes;
    }

    public ArrayList<Integer> retornandoImagens() {
        ArrayList<Integer> imgs = new ArrayList<>();


        imgs.add(R.drawable.aeroporto);
        imgs.add(R.drawable.escola);
        imgs.add(R.drawable.hospital);
        imgs.add(R.drawable.igreja);
        imgs.add(R.drawable.museu);
        imgs.add(R.drawable.praia);
        imgs.add(R.drawable.rest);
        imgs.add(R.drawable.shopping);
        imgs.add(R.drawable.zoologico);

        return imgs;
    }
}
