package com.example.anaplb.letrando.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.anaplb.letrando.R;
import com.example.anaplb.letrando.model.Palavra;
import com.example.anaplb.letrando.model.PalavraCidade;
import com.example.anaplb.letrando.recursos.Dicionario;

import java.util.ArrayList;

public class DesafioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desafio);

        Bundle dados = getIntent().getExtras();
        ArrayList<String> palavras = dados.getStringArrayList("palavras");
        ArrayList<Integer> imgs = dados.getIntegerArrayList("imagens");

        for(int i = 0; i < palavras.size(); i++) {
            Log.i("nome", palavras.get(i));
            Log.i("id ", ""+imgs.get(i));
        }

        Dicionario gerador = new Dicionario(palavras);

        int num = gerador.getIndice();
        String palavra = gerador.palavraFormatada();

        ImageView img = findViewById(R.id.imageView);
        int id = imgs.get(num);
        img.setImageResource(id);


        TextView txt = findViewById(R.id.textView);
        txt.setText(palavra);

    }
}
