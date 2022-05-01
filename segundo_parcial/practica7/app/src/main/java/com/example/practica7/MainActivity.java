package com.example.practica7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {





    public ArrayList<Disfraz> data;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText user=findViewById(R.id.etUsuario);
        EditText password=findViewById(R.id.etPassword);

        Button entrar=findViewById(R.id.btnEntrar);
        Button salir=findViewById(R.id.btnSalir);

        SharedPreferences preferences=getSharedPreferences("credenciales", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=preferences.edit();
        editor.putString("user","uno");
        editor.putString("password","uno");
        editor.commit();
    data=new ArrayList<Disfraz>();


        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences preferences = getSharedPreferences("credenciales", Context.MODE_PRIVATE);

                if (user.getText().toString().equals(preferences.getString("user", "nel").toString()) && password.getText().toString().equals(preferences.getString("password", "nel").toString())) {
                    Intent intent = new Intent(getApplicationContext(), Menu.class);

                    intent.putExtra("compras",data);

                    Toast toast = Toast.makeText(getApplicationContext(), "Entro", Toast.LENGTH_LONG);
                    toast.show();
                    startActivity(intent);
                }else{
                    Toast toast = Toast.makeText(getApplicationContext(), "Datos Incorrectos", Toast.LENGTH_LONG);
                    toast.show();
                }
            }





        });

        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
    finish();
            }
        });
    }





}