package com.example.parcial1rodriguezangeles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public Cotizacion nueva;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        EditText marca= (EditText)  findViewById(R.id.etmarca);
        EditText modelo= (EditText)  findViewById(R.id.etmodelo);
        EditText costo= (EditText)  findViewById(R.id.etcosto);
        EditText plazo= (EditText)  findViewById(R.id.etPlazo);

        TextView resultado = (TextView) findViewById(R.id.tvResultado);

        Button agregar = (Button) findViewById(R.id.btnRegistrar);
        Button limpiar = (Button) findViewById(R.id.btnLimpiar);
        Button cotizar= (Button) findViewById(R.id.btnCotizar);

        limpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                marca.setText("");
                modelo.setText("");
                costo.setText("");
                plazo.setText("");
                resultado.setText("Resultado");
            }
        });

        cotizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                nueva.setEnganche((float) (nueva.getCosto()*0.30));
                nueva.setMensualidad((float) (nueva.getCosto()*0.70)/nueva.getPlazo() );
                nueva.setComision((float)(nueva.getCosto()*0.02));

                resultado.setText("Enganche: "+nueva.getEnganche() +"\nMensualidad: "+nueva.getMensualidad()+"\nComision: "+nueva.getComision() );

            }
        });

        agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nueva=new Cotizacion(marca.getText().toString(),modelo.getText().toString(),Float.parseFloat(costo.getText().toString()),Integer.parseInt(plazo.getText().toString()),0,0,0);

                resultado.setText("Registrado");

            }
        });







    }
}