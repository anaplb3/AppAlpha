package com.example.anaplb.letrando.recursos;

import android.widget.Button;

import com.example.anaplb.letrando.R;
import com.example.anaplb.letrando.model.Palavra;
import com.example.anaplb.letrando.model.PalavraCidade;
import com.example.anaplb.letrando.model.PalavraComida;
import com.example.anaplb.letrando.model.PalavraCor;
import com.example.anaplb.letrando.model.PalavraCozinha;
import com.example.anaplb.letrando.model.PalavraFruta;
import com.example.anaplb.letrando.model.PalavraNatureza;

public class PalavraFactory {

    public Palavra pegandoObjeto(Button button) {
        Palavra p = null;

        switch(button.getId()) {

            case(R.id.btn_cidade):
                p =  new PalavraCidade();
                break;

            case(R.id.btn_comida):
                p = new PalavraComida();
                break;

            case(R.id.btn_cores):
                p =  new PalavraCor();
                break;

            case(R.id.btn_cozinha):
                p =  new PalavraCozinha();
                break;

            case(R.id.btn_frutas):
                p =  new PalavraFruta();
                break;

            case(R.id.btn_natureza):
                p =  new PalavraNatureza();
                break;
        }

        return p;
    }
}
