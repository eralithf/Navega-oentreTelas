package com.example.listaview;

import  java.util.ArrayList;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.listaview.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        @SuppressLint("MissingInflatedId") ListView listView = (ListView) findViewById(R.id.lista);

        Log.d("MainActivity", "onCreate: Started.");

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("ALEXANDRE MARQUES DE OLIVEIRA");
        nomes.add("BRUNO PEREIRA RAMOS");
        nomes.add("CARLOS CESARINO AQUINO SILVA");
        nomes.add("CECILIA DE BRITO PALMANO");
        nomes.add("DANRLEI CORREA RAMOS");
        nomes.add("DIEGO VIANA DA SILVA");
        nomes.add("JONATAS TORRES VIEIRA");
        nomes.add("JULIO ALVES XAVIER");
        nomes.add("JULIO CESAR PEREIRA JUNIOR");
        nomes.add("LUCAS DIOGO FRANÇA");
        nomes.add("LUCAS GABRIEL TEIXEIRA RODRIGUES");
        nomes.add("PAULO HENRIQUE JESUS DOS SANTOS");
        nomes.add("VINICIUS VIEIRA FRANÇA");
        nomes.add("VITOR PINHEIRO MARQUES");
        nomes.add("WELINGTON ALMEIDA AMORIM");

        ArrayAdapter adapter = new ArrayAdapter<>(this, R.layout.layout_lista, nomes);
        listView.setAdapter(adapter);
    }
}
