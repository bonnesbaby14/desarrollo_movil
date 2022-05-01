package com.example.practica7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Productos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productos);


        ListView productos=findViewById(R.id.lvPro);
        ArrayAdapter<String> adapt =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.productos));

        productos.setAdapter(adapt);
        productos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
               switch (position){
                   case 0:
                       Toast toast = Toast.makeText(getApplicationContext(), "Sudadera Tallas: CH M G", Toast.LENGTH_LONG);
                       toast.show();
                       break;
                   case 1:
                       Toast toast1 = Toast.makeText(getApplicationContext(), "Camisa Tallas: CH M G", Toast.LENGTH_LONG);
                       toast1.show();
                       break;
                   case 2:
                       Toast toast2 = Toast.makeText(getApplicationContext(), "Pantalon Tallas: CH M G", Toast.LENGTH_LONG);
                       toast2.show();
                       break;
                       case 3:
                       Toast toast3 = Toast.makeText(getApplicationContext(), "Sandalia Tallas: CH M G", Toast.LENGTH_LONG);
                       toast3.show();
                       break;
                   case 4:
                       Toast toast4 = Toast.makeText(getApplicationContext(), "Pulsera Tallas: CH M G", Toast.LENGTH_LONG);
                       toast4.show();
                       break;


               }
            }
        });
    }
}