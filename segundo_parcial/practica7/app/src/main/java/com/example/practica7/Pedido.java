package com.example.practica7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class Pedido extends AppCompatActivity {

    public ArrayList<Disfraz> datos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedido);
        Bundle parametros = this.getIntent().getExtras();
        datos =new ArrayList<Disfraz>();
        datos = (ArrayList<Disfraz>) parametros.getSerializable("compras");


        EditText nombre=findViewById(R.id.dtNombre);
        EditText domicilio=findViewById(R.id.etDocmiclio);
        EditText telefono=findViewById(R.id.etTelefono);



        Spinner size_spinner = (Spinner) findViewById(R.id.sTalla);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.talla,
                android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        size_spinner.setAdapter(adapter);

        Spinner productos = (Spinner) findViewById(R.id.sProducto);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.productos,
                android.R.layout.simple_spinner_item);

        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        productos.setAdapter(adapter2);

        Button registrar=findViewById(R.id.btnRegistrar);
        Button cancelar=findViewById(R.id.btnCancelar);


        cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Disfraz nuevo=new Disfraz(nombre.getText().toString(),domicilio.getText().toString(),productos.getSelectedItem().toString(),size_spinner.getSelectedItem().toString(),telefono.getText().toString());

                datos.add(nuevo);
                Toast toast = Toast.makeText(getApplicationContext(), "Agregado", Toast.LENGTH_LONG);
                toast.show();
                Intent intent=new Intent(getApplicationContext(),Compas.class);
                intent.putExtra("compras", datos);
                startActivity(intent);



            }
        });






    }

    @Override
    public void onBackPressed() {
        Intent intent=new Intent(getApplicationContext(),Menu.class);
        intent.putExtra("compras", datos);

        startActivity(intent);
    }
}