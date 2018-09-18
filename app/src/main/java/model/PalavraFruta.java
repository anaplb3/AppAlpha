package model;

import com.example.anaplb.letrando.R;

import java.util.ArrayList;

public class PalavraFruta extends Palavra{

    public PalavraFruta(String nome, int idImagem, int idSom) {
        super(nome, idImagem, idSom);
    }

    @Override
    public ArrayList<Palavra> recursos() {
        ArrayList<String> nomes = retornandoNomes();
        ArrayList<Integer> imgs = retornandoImagens();
        ArrayList<Palavra> palavras = new ArrayList<>();

        for(int i = 0; i < nomes.size(); i++) {
            Palavra p = new PalavraFruta(nomes.get(i), imgs.get(i), 0);

            palavras.add(p);
        }

        return palavras;
    }

    public ArrayList<String> retornandoNomes() {
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("abacate");
        nomes.add("abacaxi");
        nomes.add("banana");
        nomes.add("goiaba");
        nomes.add("maçã");
        nomes.add("manga");
        nomes.add("melancia");
        nomes.add("morango");
        nomes.add("pera");
        nomes.add("uva");

        return nomes;
    }

    public ArrayList<Integer> retornandoImagens() {
        ArrayList<Integer> imgs = new ArrayList<>();

        imgs.add(R.drawable.abacate);
        imgs.add(R.drawable.abacaxi);
        imgs.add(R.drawable.banana);
        imgs.add(R.drawable.goiaba);
        imgs.add(R.drawable.maca);
        imgs.add(R.drawable.manga);
        imgs.add(R.drawable.melancia);
        imgs.add(R.drawable.morango);
        imgs.add(R.drawable.pera);
        imgs.add(R.drawable.uva);

        return imgs;
    }
}
