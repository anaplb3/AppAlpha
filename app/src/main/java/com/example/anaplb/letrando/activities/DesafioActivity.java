package com.example.anaplb.letrando.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.anaplb.letrando.R;
import com.example.anaplb.letrando.checadora.ChecandoRespostaCerta;
import com.example.anaplb.letrando.recursos.Dicionario;

import java.util.ArrayList;

public class DesafioActivity extends AppCompatActivity {
    ChecandoRespostaCerta check = new ChecandoRespostaCerta();
    int indice;
    char letraDaVez;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desafio);

        Bundle dados = getIntent().getExtras();
        ArrayList<String> palavras = dados.getStringArrayList("palavras");
        ArrayList<Integer> imgs = dados.getIntegerArrayList("imagens");

        Dicionario gerador = new Dicionario(palavras);

        indice = gerador.getIndice();
        String palavra = gerador.palavraFormatada();

        letraDaVez = gerador.getVogal();

        ImageView img = findViewById(R.id.imageView);
        int id = imgs.get(indice);
        img.setImageResource(id);


        TextView txt = findViewById(R.id.textView);
        txt.setText(palavra);

    }


    public void botaoA(View v) {
        Button a = findViewById(R.id.buttonA);
        passandoDados(a);

    }

    public void botaoE(View v) {
        Button e = findViewById(R.id.buttonE);
        passandoDados(e);
    }

    public void botaoI(View v) {
        Button i = findViewById(R.id.buttonI);
        passandoDados(i);
    }

    public void botaoO(View v) {
        Button o = findViewById(R.id.buttonO);
        passandoDados(o);
    }

    public void botaoU(View v) {
        Button u = findViewById(R.id.buttonU);
        passandoDados(u);
    }

    public void passandoDados(Button button) {
        Bundle dados = getIntent().getExtras();
        int pontos = dados.getInt("pontos");
        int contador = dados.getInt("contador");


        contador +=1;
        pontos = check.validandoBotao(button, letraDaVez, button.getText().toString().toLowerCase(), pontos);

        Intent intent = check.escolhendoActivity(getApplicationContext(), contador);
        intent = check.salvandoDados(dados.getStringArrayList("palavras"), dados.getIntegerArrayList("imagens"), intent, indice, pontos);

        startActivity(intent);
        finish();

    }

}
