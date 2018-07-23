package com.example.anaplb.appAlpha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatImageView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

import com.example.anaplb.appAlpha.helper.listasDAO;

public class associar1Activity extends AppCompatActivity {

    private int numeroAleatorio;
    private ArrayList<String> letras = new ArrayList<String>();
    private ArrayList<Integer> ids = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_associar1);

        listasDAO listasDAO = new listasDAO(getApplicationContext());

        boolean teste = listasDAO.testandoSeVazio();
        if(teste == true) {
            listasDAO.salvandoAssociar();
            this.letras = listasDAO.retornandoLetraAssociar();
            this.ids = listasDAO.retornandoIdsAssociar();
        } else {
            this.letras = listasDAO.retornandoLetraAssociar();
            this.ids = listasDAO.retornandoIdsAssociar();
        }

        this.numeroAleatorio = imagemAleatoria();

        AppCompatImageView imagemApp = findViewById(R.id.imageView);
        imagemApp.setImageResource(this.ids.get(numeroAleatorio));

    }

    public void escolhaA(View view) {
        Button botao = findViewById(R.id.buttonA);
        TestandoBotoes button = new TestandoBotoes(botao, this.letras, this.ids);
        button.validandoBotao(botao, "a", this.numeroAleatorio);
        this.escolhendoImagem("a");
    }

    public void escolhaE(View view) {
        Button botao = findViewById(R.id.buttonE);
        TestandoBotoes button = new TestandoBotoes(botao, this.letras, this.ids);
        button.validandoBotao(botao, "e", this.numeroAleatorio);
        this.escolhendoImagem("e");
    }

    public void escolhaI(View view) {
        Button botao = findViewById(R.id.buttonI);
        TestandoBotoes button = new TestandoBotoes(botao, this.letras, this.ids);
        button.validandoBotao(botao, "i", this.numeroAleatorio);
        this.escolhendoImagem("i");
    }

    public void escolhaO(View view) {
        Button botao = findViewById(R.id.buttonO);
        TestandoBotoes button = new TestandoBotoes(botao, this.letras, this.ids);
        button.validandoBotao(botao, "o", this.numeroAleatorio);
        this.escolhendoImagem("o");
    }

    public void escolhaU(View view) {
        Button botao = findViewById(R.id.buttonU);
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
        TextView textinho = findViewById(R.id.textView);
        TestandoBotoes button = new TestandoBotoes(null, this.letras, this.ids);
        int resultado = button.setandoImagem(0, escolhaUsuario, textinho, this.numeroAleatorio,2);
        button.tirandoListas(numeroAleatorio, 2);

        Intent intent = new Intent(getApplicationContext(), associar2Activity.class);
        intent.putExtra("pontos", resultado);
        intent.putExtra("letras", this.letras);
        intent.putExtra("ids", this.ids);
        startActivity(intent);
        finish();

    }

}
