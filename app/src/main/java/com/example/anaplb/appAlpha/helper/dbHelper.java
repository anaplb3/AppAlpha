package com.example.anaplb.appAlpha.helper;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.anaplb.appAlpha.R;

import java.util.ArrayList;


/**
 * Created by anaplb on 21/07/18.
 */

public class dbHelper extends SQLiteOpenHelper {
    public static int VERSION = 1;
    public static String NAME = "appAlpha";
    public static String nomeCompleta = "completando";
    public static String nomeAssocia = "associando";

    public dbHelper(Context context) {
        super(context, NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {


        String criandoCompletar = "CREATE TABLE IF NOT EXISTS " + nomeCompleta +
                "(indice INTEGER PRIMARY KEY AUTOINCREMENT, ids INT(10), palavras VARCHAR, letras VARCHAR, letrasFaltando VARCHAR); ";
        String criandoAssociar = "CREATE TABLE IF NOT EXISTS " + nomeAssocia +
                "(indice INTEGER PRIMARY KEY AUTOINCREMENT, ids INT(10), letras VARCHAR); ";


        try {
            db.execSQL(criandoCompletar);
            db.execSQL(criandoAssociar);

            Log.i("Info db", "DEU CERTOOOOOOO");
        } catch (Exception e) {
            Log.i("Info db", "Erro ao criar tabela " + e.getMessage());
        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {


    }
}