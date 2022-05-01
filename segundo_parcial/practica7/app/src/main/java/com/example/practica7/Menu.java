package com.example.practica7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class Menu extends AppCompatActivity {

    public ArrayList<Disfraz> datos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button pedidos=findViewById(R.id.btnPedido);
        Button productos =findViewById(R.id.btnProductos);
        Button miscompras=findViewById(R.id.btnMicompras);
        Button nosotros=findViewById(R.id.btnNosotros);
        Button cerrarsesion=findViewById(R.id.btnCerrarsesion);

        Bundle parametros = this.getIntent().getExtras();
       datos =new ArrayList<Disfraz>();
        datos = (ArrayList<Disfraz>) parametros.getSerializable("compras");




        pedidos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),Pedido.class);
                intent.putExtra("compras", datos);

                startActivity(intent);

            }
        });

        productos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),Productos.class);
                startActivity(intent);
            }
        });


        miscompras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),Compas.class);
                intent.putExtra("compras", datos);
                startActivity(intent);
            }
        });

        nosotros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),Nosotros.class);
                startActivity(intent);
            }
        });
        cerrarsesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });






    }
}