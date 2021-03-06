package com.example.anaplb.appAlpha;

import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatImageView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import com.example.anaplb.appAlpha.helper.dbHelper;
import com.example.anaplb.appAlpha.helper.listasDAO;

import java.util.ArrayList;
import java.util.Random;

public class primeiraActivity extends AppCompatActivity {
    private int numeroAleatorio;
    private ArrayList<String> nomes = new ArrayList<String>();
    private ArrayList<String> respostas = new ArrayList<String>();
    private ArrayList<String> letrasFaltando = new ArrayList<String>();
    private ArrayList<Integer> ids = new ArrayList<Integer>();
    private SharedPreferences preferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeira);

        preferences = getSharedPreferences("firstRun", MODE_PRIVATE);

        Log.i("tamanho da lista ", "-"+this.ids.size()+"");

        listasDAO listas = new listasDAO(getApplicationContext());

        boolean teste = listas.testandoSeVazio();
        if(teste == true) {
            listas.salvandoComplete();
            this.ids = listas.retornandoIdsCompletar();
            this.nomes = listas.retornandoNomesCompletar();
            this.respostas = listas.retornandoLetrasCompletar();
            this.letrasFaltando = listas.retornandoLetrasFaltandoCompletar();
        } else {
            this.ids = listas.retornandoIdsCompletar();
            this.nomes = listas.retornandoNomesCompletar();
            this.respostas = listas.retornandoLetrasCompletar();
            this.letrasFaltando = listas.retornandoLetrasFaltandoCompletar();
        }

        this.numeroAleatorio = imagemAleatoria();

        AppCompatImageView imagemApp = findViewById(R.id.img_mostrada);
        imagemApp.setImageResource(this.ids.get(numeroAleatorio));
        TextView textinho = findViewById(R.id.text);
        textinho.setText(this.letrasFaltando.get(numeroAleatorio));

        Log.i("random do on create1: ", "é "+this.numeroAleatorio+" esse");

    }


    private int imagemAleatoria() {
        Random gerador = new Random();
        int num = gerador.nextInt(ids.size());
        Log.i("array id1", "é"+this.ids.size()+".");

        return num;
    }

    public void escolhaA(View view) {
        Button botao = findViewById(R.id.btn_a);
        TestandoBotoes button = new TestandoBotoes(botao, this.nomes, this.respostas, this.ids, this.letrasFaltando);
        button.validandoBotao(botao, "a", this.numeroAleatorio);
        this.escolhendoImagem("a");
    }

    public void escolhaE(View view) {
        Button botao = findViewById(R.id.btn_e);
        TestandoBotoes button = new TestandoBotoes(botao, this.nomes, this.respostas, this.ids, this.letrasFaltando);
        button.validandoBotao(botao, "e", this.numeroAleatorio);
        this.escolhendoImagem("e");
    }

    public void escolhaI(View view) {
        Button botao = findViewById(R.id.btn_i);
        TestandoBotoes button = new TestandoBotoes(botao, this.nomes, this.respostas, this.ids, this.letrasFaltando);
        button.validandoBotao(botao, "i", this.numeroAleatorio);
        this.escolhendoImagem("i");
    }

    public void escolhaO(View view) {
        Button botao = findViewById(R.id.btn_o);
        TestandoBotoes button = new TestandoBotoes(botao, this.nomes, this.respostas, this.ids, this.letrasFaltando);
        button.validandoBotao(botao, "o", this.numeroAleatorio);
        this.escolhendoImagem("o");
    }

    public void escolhaU(View view) {
        Button botao = findViewById(R.id.btn_u);
        TestandoBotoes button = new TestandoBotoes(botao, this.nomes, this.respostas, this.ids, this.letrasFaltando);
        button.validandoBotao(botao, "u", this.numeroAleatorio);
        this.escolhendoImagem("u");
    }


    public void escolhendoImagem(String escolhaUsuario) {
        TextView textinho = findViewById(R.id.text);
        TestandoBotoes button = new TestandoBotoes(this.nomes, this.respostas, this.ids, this.letrasFaltando);
        int resultado = button.setandoImagem(0, escolhaUsuario, textinho, this.numeroAleatorio, 1);
        button.tirandoListas(numeroAleatorio,1);


        Log.i("escolhendo imagem : ", "é "+this.numeroAleatorio+" esse");
        Intent intent = new Intent(getApplicationContext(), segundaActivity.class);
        intent.putExtra("pontos", resultado);
        intent.putExtra("nomes", this.nomes);
        intent.putExtra("letras", this.respostas);
        intent.putExtra("ids", this.ids);
        intent.putExtra("letrasFaltando", this.letrasFaltando);
        startActivity(intent);
        finish();

    }
}