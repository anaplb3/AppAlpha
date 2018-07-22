package com.example.anaplb.appAlpha;


import android.util.Log;
import android.widget.Button;
import android.widget.TextView;


import java.util.ArrayList;


/**
 * Created by anaplb on 13/07/18.
 */

public class TestandoBotoes {
    public Button botao;
    public ArrayList<String> palavras;
    public ArrayList<String> letras;
    public ArrayList<Integer> ids;
    public ArrayList<String> letrasFaltando;


    public TestandoBotoes(Button but, ArrayList<String> pal, ArrayList<String> let, ArrayList<Integer> ids, ArrayList<String> letrasFaltando) {
        this.botao = but;
        this.palavras = pal;
        this.letras = let;
        this.ids = ids;
        this.letrasFaltando = letrasFaltando;
    }

    public TestandoBotoes(ArrayList<String> pal, ArrayList<String> let, ArrayList<Integer> ids, ArrayList<String> faltando) {
        this.botao = null;
        this.palavras = pal;
        this.letras = let;
        this.ids = ids;
        this.letrasFaltando = faltando;
    }

    public TestandoBotoes(Button butao ,ArrayList<String> letras, ArrayList<Integer> ids) {
        this.botao = butao;
        this.palavras = null;
        this.ids = ids;
        this.letras = letras;
        this.letrasFaltando = null;
    }

    public void validandoBotao(Button but, String letraCerta, int numRandom) {
        if(this.letras.get(numRandom).equals(letraCerta)) {
            but.setBackgroundResource(R.color.verde);
        } else {
            but.setBackgroundResource(R.color.Red);
        }

    }

    public int setandoImagem(int pontos, String letraCerta, TextView texto, int numRandom, int escolha) {
        if(letraCerta.equals(this.letras.get(numRandom))) {
            pontos += 1;
        }

        if(escolha == 1) {
            texto.setText(this.palavras.get(numRandom));
        }

        return pontos;
    }

    public void tirandoListas(int numAleatorio, int opcao) {
        if(opcao == 1) {
            this.palavras.remove(numAleatorio);
            this.letras.remove(numAleatorio);
            this.ids.remove(numAleatorio);
            this.letrasFaltando.remove(numAleatorio);
        } else {
            this.letras.remove(numAleatorio);
            this.ids.remove(numAleatorio);
        }

    }
}
