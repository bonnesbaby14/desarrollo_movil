package com.example.parcial2rodriguezgabriel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button salir=findViewById(R.id.btnSalir);
        Button entrar=findViewById(R.id.btnEntrar);
        Spinner users_spinner = (Spinner) findViewById(R.id.spnUsers);
        EditText passwordd=findViewById(R.id.etPassword);

        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String usuario= users_spinner.getSelectedItem().toString();
                String password = passwordd.getText().toString();

                switch (usuario){
                    case "uno":
                        if(password.equals("uno")){

                            Intent intent = new Intent(getApplicationContext(), Formulario.class);
                            startActivity(intent);
                        }else{
                            Toast toast = Toast.makeText(getApplicationContext(), "Datos incorrectos", Toast.LENGTH_SHORT);
                            toast.show();
                        }

                        break;
                    case "dos":
                        if(password.equals("dos")){
                            Intent intent = new Intent(getApplicationContext(), Formulario.class);
                            startActivity(intent);
                        }else{
                            Toast toast = Toast.makeText(getApplicationContext(), "Datos incorrectos", Toast.LENGTH_SHORT);
                            toast.show();
                        }

                        break;
                    case "tres":
                        if(password.equals("tres")){
                            Intent intent = new Intent(getApplicationContext(), Formulario.class);
                            startActivity(intent);
                        }else{
                            Toast toast = Toast.makeText(getApplicationContext(), "Datos incorrectos", Toast.LENGTH_SHORT);
                            toast.show();
                        }

                        break;
                    case "cuatro":
                        if(password.equals("cuatro")){
                            Intent intent = new Intent(getApplicationContext(), Formulario.class);
                            startActivity(intent);
                        }else{
                            Toast toast = Toast.makeText(getApplicationContext(), "Datos incorrectos", Toast.LENGTH_SHORT);
                            toast.show();
                        }

                        break;
                    case "cinco":
                        if(password.equals("cinco")){
                            Intent intent = new Intent(getApplicationContext(), Formulario.class);
                            startActivity(intent);
                        }else{
                            Toast toast = Toast.makeText(getApplicationContext(), "Datos incorrectos", Toast.LENGTH_SHORT);
                            toast.show();
                        }

                        break;
                }

            }





        });
        salir.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), "Saliendo", Toast.LENGTH_SHORT);
                toast.show();
                finish();
            }
        });
    }
}