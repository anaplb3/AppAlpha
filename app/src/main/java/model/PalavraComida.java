package model;

import com.example.anaplb.letrando.R;

import java.util.ArrayList;

public class PalavraComida extends Palavra{

    public PalavraComida(String nome, int idImagem, int idSom) {
        super(nome, idImagem, idSom);
    }

    @Override
    public ArrayList<Palavra> recursos() {
        ArrayList<String> nomes = retornandoNomes();
        ArrayList<Integer> imgs = retornandoImagens();
        ArrayList<Palavra> palavras = new ArrayList<>();

        for(int i = 0; i < nomes.size(); i++) {
            Palavra p = new PalavraComida(nomes.get(i), imgs.get(i), 0);

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
}
