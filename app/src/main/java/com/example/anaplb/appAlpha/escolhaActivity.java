package com.example.anaplb.appAlpha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class escolhaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escolha);
    }

    public void completarLetra(View view) {
        Intent intent = new Intent(getApplicationContext(), primeiraActivity.class);
        startActivity(intent);
    }

    public void associarLetra(View view) {
        Intent intent = new Intent(getApplicationContext(), associar1Activity.class);
        startActivity(intent);
    }
}
