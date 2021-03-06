package com.example.anaplb.appAlpha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatImageView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class quartaActivity extends AppCompatActivity {
    private int numeroAleatorio;
    private ArrayList<String> nomes;
    private ArrayList<String> letras;
    private ArrayList<String> letrasFaltando;
    private ArrayList<Integer> ids;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quarta);

        Bundle dados = getIntent().getExtras();
        this.nomes = dados.getStringArrayList("nomes");
        this.letras = dados.getStringArrayList("letras");
        this.ids = dados.getIntegerArrayList("ids");
        this.letrasFaltando = dados.getStringArrayList("letrasFaltando");

        numeroAleatorio = imagemAleatoria();
        AppCompatImageView imagemApp = findViewById(R.id.imagem2);
        imagemApp.setImageResource(this.ids.get(numeroAleatorio));
        TextView textinho = findViewById(R.id.textView5);
        textinho.setText(this.letrasFaltando.get(numeroAleatorio));

        Log.i("random do on create4: ", "é "+this.numeroAleatorio+" esse");

    }

    private int imagemAleatoria() {
        Random gerador = new Random();
        int num = gerador.nextInt(ids.size());

        return num;
    }

    public void escolhaA(View view) {
        Button botao = findViewById(R.id.button11);
        TestandoBotoes button = new TestandoBotoes(botao, this.nomes, this.letras, this.ids, this.letrasFaltando);
        button.validandoBotao(botao, "a", this.numeroAleatorio);
        this.escolhendoImagem("a");
    }

    public void escolhaE(View view) {
        Button botao = findViewById(R.id.button12);
        TestandoBotoes button = new TestandoBotoes(botao, this.nomes, this.letras, this.ids, this.letrasFaltando);
        button.validandoBotao(botao, "e", this.numeroAleatorio);
        this.escolhendoImagem("e");
    }

    public void escolhaI(View view) {
        Button botao = findViewById(R.id.button13);
        TestandoBotoes button = new TestandoBotoes(botao, this.nomes, this.letras, this.ids, this.letrasFaltando);
        button.validandoBotao(botao, "i", this.numeroAleatorio);
        this.escolhendoImagem("i");
    }

    public void escolhaO(View view) {
        Button botao = findViewById(R.id.button14);
        TestandoBotoes button = new TestandoBotoes(botao, this.nomes, this.letras, this.ids, this.letrasFaltando);
        button.validandoBotao(botao, "o", this.numeroAleatorio);
        this.escolhendoImagem("o");
    }

    public void escolhaU(View view) {
        Button botao = findViewById(R.id.button15);
        TestandoBotoes button = new TestandoBotoes(botao, this.nomes, this.letras, this.ids, this.letrasFaltando);
        button.validandoBotao(botao, "u", this.numeroAleatorio);
        this.escolhendoImagem("u");
    }

    public void escolhendoImagem(String escolhaUsuario) {
        Bundle dados = getIntent().getExtras();
        int pontos = dados.getInt("pontos");

        TextView textinho = findViewById(R.id.textView5);
        TestandoBotoes button = new TestandoBotoes(this.nomes, this.letras, this.ids, this.letrasFaltando);
        int resultado = button.setandoImagem(pontos, escolhaUsuario, textinho, this.numeroAleatorio,1);
        button.tirandoListas(numeroAleatorio,1);

        Log.i("escolhendo imagem : ", "é "+this.numeroAleatorio+" esse");
        Intent intent = new Intent(getApplicationContext(), quintaActivity.class);
        intent.putExtra("pontos", resultado);
        intent.putExtra("nomes", this.nomes);
        intent.putExtra("letras", this.letras);
        intent.putExtra("ids", this.ids);
        intent.putExtra("letrasFaltando", this.letrasFaltando);
        startActivity(intent);
        finish();

    }
}
