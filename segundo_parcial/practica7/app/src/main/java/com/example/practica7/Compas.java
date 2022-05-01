package com.example.practica7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Compas extends AppCompatActivity {
    public ArrayList<Disfraz> datos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compas);
        ListView productos=findViewById(R.id.compras);
        Bundle parametros = this.getIntent().getExtras();


        datos =new ArrayList<Disfraz>();
        datos = (ArrayList<Disfraz>) parametros.getSerializable("compras");
        ArrayList<String> lista=new ArrayList<String>();

        for (Disfraz dato:datos) {

            lista.add(dato.getNombre()+" "+dato.getItem()+" "+dato.getNombre() );

        }
        System.out.println(lista.get(0));






        ArrayAdapter<String> adapt =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lista);

        productos.setAdapter(adapt);
    }
}