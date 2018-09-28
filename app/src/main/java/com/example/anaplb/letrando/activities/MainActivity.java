package com.example.anaplb.letrando.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.anaplb.letrando.R;

import com.example.anaplb.letrando.som.Som;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getApplicationContext().setTheme(R.style.Theme_AppCompat_Light_NoActionBar);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void botao(View v) {
        Button b = findViewById(R.id.button3);

        Intent intent = new Intent(getApplicationContext(), temaActivity.class);
        startActivity(intent);
        finish();
    }
}
