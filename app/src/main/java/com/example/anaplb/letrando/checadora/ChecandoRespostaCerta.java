package com.example.anaplb.letrando.checadora;

import android.content.Context;
import android.content.Intent;
import android.widget.Button;

import com.example.anaplb.letrando.R;
import com.example.anaplb.letrando.activities.DesafioActivity;
import com.example.anaplb.letrando.activities.PontuacaoActivity;

import java.util.ArrayList;

public class ChecandoRespostaCerta {

    public boolean checando(char letra, String escolha) {

        return escolha.equals(String.valueOf(letra));
    }


    public int validandoBotao(Button botao, char letraCerta, String letraEscolhida, int pontos) {
        if (checando(letraCerta, letraEscolhida)) {
            pontos += 1;
            botao.setBackgroundResource(R.color.verde);
        } else {
            botao.setBackgroundResource(R.color.Red);
        }

        return pontos;
    }

    public Intent escolhendoActivity(Context context, int contador) {
        Intent intent = null;
        if (contador == 5) {
            intent = new Intent(context, PontuacaoActivity.class);
        } else {
            intent = new Intent(context, DesafioActivity.class);
        }

        intent.putExtra("contador", contador);

        return intent;
    }

    public Intent salvandoDados(ArrayList<String> palavras, ArrayList<Integer> imgs, Intent intent, int indice, int pontos) {
        palavras.remove(indice);
        imgs.remove(indice);

        intent.putExtra("palavras", palavras);
        intent.putExtra("imagens", imgs);
        intent.putExtra("pontos", pontos);

        return intent;

    }

}
