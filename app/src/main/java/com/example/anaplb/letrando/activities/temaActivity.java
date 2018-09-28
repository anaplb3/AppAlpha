package com.example.anaplb.letrando.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.anaplb.letrando.R;
import com.example.anaplb.letrando.model.Palavra;
import com.example.anaplb.letrando.recursos.PalavraFactory;

public class temaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getApplicationContext().setTheme(R.style.Theme_AppCompat_Light_NoActionBar);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tema);

        getLayoutInflater().inflate(R.layout.activity_tema, null);



    }

    public void botaoEscolha(Button b) {
        PalavraFactory factory = new PalavraFactory();

        Palavra p = factory.pegandoObjeto(b);

        Intent intent = new Intent(getApplicationContext(), DesafioActivity.class);
        intent.putExtra("palavras", p.retornandoNomes());
        intent.putExtra("imagens", p.retornandoImagens());
        startActivity(intent);
        finish();

    }

    public void botaoCidade(View v) {
        Button b = findViewById(R.id.btn_cidade);
        botaoEscolha(b);
    }

    public void botaoNatureza(View v) {
        Button b = findViewById(R.id.btn_natureza);
        botaoEscolha(b);
    }

    public void botaoCozinha(View v) {
        Button b = findViewById(R.id.btn_cozinha);
        botaoEscolha(b);
    }

    public void botaoCor(View v) {
        Button b = findViewById(R.id.btn_cores);
        botaoEscolha(b);
    }

    public void botaoFruta(View v) {
        Button b = findViewById(R.id.btn_frutas);
        botaoEscolha(b);
    }

    public void botaoComida(View v) {
        Button b = findViewById(R.id.btn_comida);
        botaoEscolha(b);
    }
}
