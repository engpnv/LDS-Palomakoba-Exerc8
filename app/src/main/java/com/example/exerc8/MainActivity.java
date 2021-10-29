package com.example.exerc8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText et_novoNumero;
    Button bt_adicionar;
    ListView lv_lista;
    ArrayList<Integer> lista;
    ArrayAdapter<Integer> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_novoNumero = findViewById(R.id.et_novoNumero);
        bt_adicionar = findViewById(R.id.bt_adicionar);
        lv_lista = findViewById(R.id.lv_lista);

        lista = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,lista );

        lv_lista.setAdapter(adapter);

        bt_adicionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*int numero = Integer.parseInt(et_novoNumero.getText().toString());
                lista.add(numero);
                adapter.notifyDataSetChanged(); */

                //parte 2 (Executo sem try e catch, debug e altero)
                try{
                    int numero = Integer.parseInt(et_novoNumero.getText().toString());
                    lista.add(numero);
                    adapter.notifyDataSetChanged();
                } catch (Exception e) {
                    Toast.makeText(MainActivity.this, "Insira um número antes de adicionar", Toast.LENGTH_SHORT).show();
                }




            }
        });

    }
}