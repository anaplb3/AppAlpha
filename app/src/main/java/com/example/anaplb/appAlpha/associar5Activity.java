package com.example.anaplb.appAlpha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatImageView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class associar5Activity extends AppCompatActivity {
    private int numeroAleatorio;
    private ArrayList<String> letras;
    private ArrayList<Integer> ids;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_associar5);

        Bundle dados = getIntent().getExtras();
        this.letras = dados.getStringArrayList("letras");
        this.ids = dados.getIntegerArrayList("ids");

        numeroAleatorio = imagemAleatoria();
        AppCompatImageView imagemApp = findViewById(R.id.imageView7);
        imagemApp.setImageResource(this.ids.get(numeroAleatorio));
    }

    public void escolhaA(View view) {
        Button botao = findViewById(R.id.button38);
        TestandoBotoes button = new TestandoBotoes(botao, this.letras, this.ids);
        button.validandoBotao(botao, "a", this.numeroAleatorio);
        this.escolhendoImagem("a");
    }

    public void escolhaE(View view) {
        Button botao = findViewById(R.id.button39);
        TestandoBotoes button = new TestandoBotoes(botao, this.letras, this.ids);
        button.validandoBotao(botao, "e", this.numeroAleatorio);
        this.escolhendoImagem("e");
    }

    public void escolhaI(View view) {
        Button botao = findViewById(R.id.button40);
        TestandoBotoes button = new TestandoBotoes(botao, this.letras, this.ids);
        button.validandoBotao(botao, "i", this.numeroAleatorio);
        this.escolhendoImagem("i");
    }

    public void escolhaO(View view) {
        Button botao = findViewById(R.id.button41);
        TestandoBotoes button = new TestandoBotoes(botao, this.letras, this.ids);
        button.validandoBotao(botao, "o", this.numeroAleatorio);
        this.escolhendoImagem("o");
    }

    public void escolhaU(View view) {
        Button botao = findViewById(R.id.button42);
        TestandoBotoes button = new TestandoBotoes(botao, this.letras, this.ids);
        button.validandoBotao(botao, "u", this.numeroAleatorio);
        this.escolhendoImagem("u");
    }

    private int imagemAleatoria() {
        Random gerador = new Random();
        int num = gerador.nextInt(ids.size());
        return num;
    }

    public void escolhendoImagem(String escolhaUsuario) {
        Bundle dados = getIntent().getExtras();
        int pontos = dados.getInt("pontos");

        TextView textinho = findViewById(R.id.textView14);
        TestandoBotoes button = new TestandoBotoes(null, this.letras, this.ids);
        int resultado = button.setandoImagem(pontos, escolhaUsuario, textinho, this.numeroAleatorio,2);
        button.tirandoListas(numeroAleatorio, 2);

        Intent intent = new Intent(getApplicationContext(), finalActivity.class);
        intent.putExtra("pontos", resultado);
        startActivity(intent);
        finish();


    }
}
