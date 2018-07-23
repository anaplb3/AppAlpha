package com.example.anaplb.appAlpha.helper;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.anaplb.appAlpha.R;

import java.util.ArrayList;

/**
 * Created by anaplb on 21/07/18.
 */

public class listasDAO implements IListasDAO {
    private ArrayList<Integer> IdsCompletar = new ArrayList<>();
    private ArrayList<String> letrasCompletar = new ArrayList<>();
    private ArrayList<String> nomesFaltandoCompletar = new ArrayList<>();
    private ArrayList<String> nomesCompletar = new ArrayList<>();
    private ArrayList<String> letrasAssociar = new ArrayList<>();
    private ArrayList<Integer> idsAssociar = new ArrayList<>();
    private SQLiteDatabase escreve;


    public listasDAO(Context context) {
        dbHelper db = new dbHelper(context);
        escreve = db.getWritableDatabase();
    }

    @Override

    public void salvandoComplete() {

        ContentValues cv = new ContentValues();

        this.IdsCompletar = retornandoIdsCompletar();
        this.letrasCompletar = retornandoLetrasCompletar();
        this.nomesCompletar = retornandoNomesCompletar();
        this.nomesFaltandoCompletar = retornandoLetrasFaltandoCompletar();

        //Rodando um for no array de ids, pegando os indices de todas as listas e escrevendo no banco de dados
        try {
            for (int i = 0; i < this.IdsCompletar.size(); i++) {
                cv.put("ids", this.IdsCompletar.get(i));
                cv.put("palavras", this.nomesCompletar.get(i));
                cv.put("letras", this.letrasCompletar.get(i));
                cv.put("letrasFaltando", this.nomesFaltandoCompletar.get(i));
                escreve.insert(dbHelper.nomeCompleta, null, cv);

                Log.i("Info insert", "deu certoooooooo");
            }
        } catch (Exception e) {
            Log.i("Info insert", "Erro ao adicionar completar " + e.getMessage());
        }
    }

    @Override
    public void salvandoAssociar() {
        ContentValues content = new ContentValues();

        this.idsAssociar = retornandoIdsAssociar();
        this.letrasAssociar = retornandoLetraAssociar();

        //Rodando um for no array de IDs, pegando os indices e salvando no banco de dados
        try {
            for (int i = 0; i < this.idsAssociar.size(); i++) {

                content.put("ids", this.idsAssociar.get(i));
                content.put("letras", this.letrasAssociar.get(i));

                escreve.insert(dbHelper.nomeAssocia, null, content);

                Log.i("info insert", "deu certooo");
            }
        } catch (Exception e) {
            Log.i("Info insert ", "Erro ao add associar " + e.getMessage());
        }
    }

    public boolean testandoSeVazio() {
        Cursor cursor = escreve.rawQuery("SELECT ids, palavras, letras, letrasFaltando FROM completando", null);

        cursor.moveToFirst();

        if (cursor.getCount() <= 0) {
            Log.i("status", "VAZIO");
            return true;
        } else {
            Log.i("status", "CHEIO");
            return false;
        }
    }

        public ArrayList<String> retornandoNomesCompletar () {
            //Adicionando os nomes ao array
            this.nomesCompletar.add("ILHA");
            this.nomesCompletar.add("CADEIRA");
            this.nomesCompletar.add("MESA");
            this.nomesCompletar.add("SOL");
            this.nomesCompletar.add("URSO");
            this.nomesCompletar.add("CACHORRO");
            this.nomesCompletar.add("FOGUEIRA");
            this.nomesCompletar.add("MELANCIA");
            this.nomesCompletar.add("PAPAGAIO");
            this.nomesCompletar.add("ÔNIBUS");

            return this.nomesCompletar;
        }


        public ArrayList<Integer> retornandoIdsCompletar() {
            //Adicionando imagens no array
            this.IdsCompletar.add(R.drawable.ilha);
            this.IdsCompletar.add(R.drawable.cadeira);
            this.IdsCompletar.add(R.drawable.mesa);
            this.IdsCompletar.add(R.drawable.sol);
            this.IdsCompletar.add(R.drawable.urso);
            this.IdsCompletar.add(R.drawable.cachorro);
            this.IdsCompletar.add(R.drawable.fogueira);
            this.IdsCompletar.add(R.drawable.melancia);
            this.IdsCompletar.add(R.drawable.papagaio);
            this.IdsCompletar.add(R.drawable.onibus);

            return this.IdsCompletar;
        }

        public ArrayList<String> retornandoLetrasCompletar () {
            //Adicionando as letras no array
            this.letrasCompletar.add("i");
            this.letrasCompletar.add("a");
            this.letrasCompletar.add("e");
            this.letrasCompletar.add("o");
            this.letrasCompletar.add("u");
            this.letrasCompletar.add("a");
            this.letrasCompletar.add("e");
            this.letrasCompletar.add("i");
            this.letrasCompletar.add("o");
            this.letrasCompletar.add("u");

            return this.letrasCompletar;
        }

        public ArrayList<String> retornandoLetrasFaltandoCompletar () {
            //Adicionando as palavras faltando letras ao array
            this.nomesFaltandoCompletar.add("_LHA");
            this.nomesFaltandoCompletar.add("C_DEIRA");
            this.nomesFaltandoCompletar.add("M_SA");
            this.nomesFaltandoCompletar.add("S_L");
            this.nomesFaltandoCompletar.add("_RSO");
            this.nomesFaltandoCompletar.add("C_CHORRO");
            this.nomesFaltandoCompletar.add("FOGU_IRA");
            this.nomesFaltandoCompletar.add("MELANC_A");
            this.nomesFaltandoCompletar.add("PAPAGAI_");
            this.nomesFaltandoCompletar.add("ÔNIB_S");

            return this.nomesFaltandoCompletar;
        }

        public ArrayList<Integer> retornandoIdsAssociar () {
            //Adicionando ID de imagens no array do desafio Associar
            this.idsAssociar.add(R.drawable.abelha);
            this.idsAssociar.add(R.drawable.escova);
            this.idsAssociar.add(R.drawable.indio);
            this.idsAssociar.add(R.drawable.oculos);
            this.idsAssociar.add(R.drawable.uva);

            return this.idsAssociar;
        }

        public ArrayList<String> retornandoLetraAssociar () {
            //Adicionando letras ao array do desafio Associar
            this.letrasAssociar.add("a");
            this.letrasAssociar.add("e");
            this.letrasAssociar.add("i");
            this.letrasAssociar.add("o");
            this.letrasAssociar.add("u");

            return this.letrasAssociar;
        }
    }
