package com.example.practica_tres;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public int contador=0;
    public boolean encontardo=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Moto array[]=new Moto[10];

        Button agregar=(Button) findViewById(R.id.btnAgregar);
        Button eliminar=(Button) findViewById(R.id.btnElminar);
        Button buscar=(Button) findViewById(R.id.btnBuscar);

        EditText marca=(EditText) findViewById(R.id.etData);
        EditText modelo=(EditText) findViewById(R.id.etData2);
        EditText ano=(EditText) findViewById(R.id.etData3);
        EditText activa=(EditText) findViewById(R.id.etData4);

        TextView label=(TextView) findViewById(R.id.lbTitle);
        Toast toast = Toast.makeText(this, "no se encontro", Toast.LENGTH_LONG);

        agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                array[contador]=new Moto(marca.getText().toString(),modelo.getText().toString(),Integer.parseInt(ano.getText().toString()),activa.getText().toString().equals("1")?true:false);
                contador++;
                label.setText("Agregado");
                marca.setText("");
                modelo.setText("");
                ano.setText("");
                activa.setText("");

            }
        });

        buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                for(int i=0;i<contador;i++){
                    if(array[i].getMarca().equals(marca.getText().toString())  ){



                        marca.setText(array[i].getMarca());
                        modelo.setText(array[i].getModelo());
                        ano.setText(array[i].getAno()+"");
                        activa.setText(array[i].isActiva()?"1":"0");
                        label.setText("Encontrado");
                        encontardo=false;
                        break;



                    }
                    encontardo=true;
                }
                if(encontardo) {
                    label.setText("No encontrado");
                    marca.setText("");
                    modelo.setText("");
                    ano.setText("");
                    activa.setText("");
                    toast.show();
                }
            }
        });

        eliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                label.setText("Resultado");
                marca.setText("");
                modelo.setText("");
                ano.setText("");
                activa.setText("");

            }
        });







    }
}