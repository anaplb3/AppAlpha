package com.example.anaplb.letrando.recursos;

import java.util.ArrayList;

import com.example.anaplb.letrando.model.Palavra;
import java.util.Random;

public class Dicionario {
    private ArrayList<String> palavras;
    private Random gerador;
    private int indice;
    private char vogal;

    public Dicionario(ArrayList<String> palavras) {
        this.palavras = palavras;
        this.gerador = new Random();
        this.indice = 0;
    }

    public char vogalEscolhida() {
        int indice = gerador.nextInt(4) + 1;
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

    public int getIndice() {
        this.indice = gerador.nextInt(palavras.size());
        return this.indice;
    }

    public String palavraFormatada() {
        String nome = null;

        String word =  this.palavras.get(this.indice);
        boolean achou = false;

        do {
            vogal = vogalEscolhida();
            for(int iChar = 0; iChar < word.length(); iChar++) {

                if(vogal == word.charAt(iChar)) {
                    nome = word.replace(word.charAt(iChar), '_');
                    achou = true;
                    break;
                }
            }
        } while (achou == false);

        return nome;
    }

    public char getVogal() {
        return this.vogal;
    }

}
