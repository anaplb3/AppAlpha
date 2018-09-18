package com.example.anaplb.letrando;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import som.Som;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Som som = new Som();

        som.playSound(getApplicationContext(), 0);
    }
}
