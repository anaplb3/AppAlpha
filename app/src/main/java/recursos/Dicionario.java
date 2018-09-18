package recursos;

import java.util.ArrayList;

import model.Palavra;
import java.util.Random;

public class Dicionario {
    private ArrayList<Palavra> palavras;
    private Random gerador;

    public Dicionario(ArrayList<Palavra> palavras) {
        this.palavras = palavras;
        this.gerador = new Random();
    }

    public char vogalEscolhida() {
        int indice = gerador.nextInt(5) + 1;
        ArrayList<Character> vogais = vogais();

        return vogais.get(indice);
    }

    public ArrayList<Character> vogais() {
        ArrayList<Character> vogais = new ArrayList<>();

        vogais.add('a');
        vogais.add('e');
        vogais.add('i');
        vogais.add('o');
        vogais.add('u');

        return vogais;

    }

    public String palavraFormatada(int indice) {
        char vogal = vogalEscolhida();
        String nome = "";

        Palavra p = this.palavras.get(indice);
        String word = p.getNome();

        for(int iChar = 0; iChar < word.length(); iChar++) {

            if(vogal == word.charAt(iChar)) {
                nome = word.replace(word.charAt(iChar), '_');
                break;
            }
        }

        return nome;
    }


}
