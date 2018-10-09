package com.example.anaplb.letrando.checadora;

import android.widget.Button;

import com.example.anaplb.letrando.R;

public class Botao {

    public void validandoBotao(Button botao, char letraCerta, char letraEscolhida) {
        if(letraCerta == letraEscolhida) {
            botao.setBackgroundResource(R.color.verde);
        } else {
            botao.setBackgroundResource(R.color.Red);
        }
    }



}
