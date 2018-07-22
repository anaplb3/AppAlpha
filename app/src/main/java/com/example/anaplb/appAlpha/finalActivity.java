package com.example.anaplb.appAlpha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class finalActivity extends AppCompatActivity {

    private Button sair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        sair = findViewById(R.id.button22);
        sair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

    }

    public void pontuacao(View view) {
        Button botao = findViewById(R.id.button21);
        this.quantasEstrelas(view);
    }

    public void quantasEstrelas(View view) {
        Bundle dados = getIntent().getExtras();
        int pontos = dados.getInt("pontos");

        ImageView yey = findViewById(R.id.img_pontos);
        TextView texto = findViewById(R.id.textinho);

        if(pontos == 0 ) {
            yey.setImageResource(R.drawable.sad);
            texto.setText("Poxa, tente mais da próxima vez!");
        } else if(pontos == 1) {
            yey.setImageResource(R.drawable.uma);
            texto.setText("Parabéns, mas ainda pode melhorar!");
        } else if(pontos == 2) {
            yey.setImageResource(R.drawable.dois);
            texto.setText("Muito bem, mas se esforce mais um pouquinho ;)!");
        } else if(pontos == 3) {
            yey.setImageResource(R.drawable.tres);
            texto.setText("Isso aí, foi muito bem!");
        } else if(pontos == 4) {
            yey.setImageResource(R.drawable.quatro);
            texto.setText("Parabéns, quase chegou lá :)");
        } else {
            yey.setImageResource(R.drawable.cinco);
            texto.setText("Arrasou! Ganhou as 5 estrelas :)");
        }

    }
}
