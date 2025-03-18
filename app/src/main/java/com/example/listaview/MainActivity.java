package com.example.listaview;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.ArrayAdapter;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private FrameLayout container;
    private ListView listView;
    private ArrayAdapter<String> adapter;
    private ArrayList<String> nomes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        Button btnLayout1 = findViewById(R.id.btnLayout1);
        Button btnLayout2 = findViewById(R.id.btnLayout2);
        Button btnLayout3 = findViewById(R.id.btnLayout3);
        Button btnLayout4 = findViewById(R.id.btnLayout4);


        container = findViewById(R.id.container);


        nomes = new ArrayList<>();
        nomes.add("ALEXANDRE MARQUES DE OLIVEIRA");
        nomes.add("BRUNO PEREIRA RAMOS");
        nomes.add("CARLOS GEANINNE AQUINO SILVA");
        nomes.add("CECÍLIA DE BRITO PALHANO");
        nomes.add("DARLEY CORREIA RAMOS");


        adapter = new ArrayAdapter<>(this, R.layout.item_lista, R.id.textViewItem, nomes);


        btnLayout1.setOnClickListener(v -> carregarLayout(R.layout.layout_lista));
        btnLayout2.setOnClickListener(v -> carregarLayout(R.layout.layout_lista2));
        btnLayout3.setOnClickListener(v -> carregarLayout(R.layout.layout_lista3));
        btnLayout4.setOnClickListener(v -> carregarLayout(R.layout.layout_lista4));


        carregarLayout(R.layout.layout_lista);
    }

    private void carregarLayout(int layoutResId) {

        container.removeAllViews();


        View layout = getLayoutInflater().inflate(layoutResId, container, false);
        container.addView(layout);


        listView = layout.findViewById(R.id.lista);
        listView.setAdapter(adapter);
    }
}