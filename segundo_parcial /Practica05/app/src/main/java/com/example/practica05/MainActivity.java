package com.example.practica05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText codigo, costo, marca, modelo;
    private RadioButton chica, mediana, grande;
    private CheckBox negro, blanco, rojo, azul, naranja;
    private Spinner spinenr;
    Viaje ropa[] = new Viaje[10];
    Boolean uno = false, dos = false;
    int aux, aux2;
    int con = 0, valor=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        codigo = findViewById(R.id.txtCodigo);
        costo = findViewById(R.id.txtCosto);
        spinenr=findViewById(R.id.spinner);
        String [] valores={"EUA","ALEMANIA","LONDRES","MEXICO"};
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,valores);
        spinenr.setAdapter(adapter);

        chica = (RadioButton) findViewById(R.id.rbChico);
        mediana = (RadioButton) findViewById(R.id.rbMediano);
        grande = (RadioButton) findViewById(R.id.rbGrande);
        negro = findViewById(R.id.cbxNegro);
        blanco = findViewById(R.id.cbxBlanco);
        rojo = findViewById(R.id.cbxRojo);
        azul = findViewById(R.id.cbxAzul);
        naranja = findViewById(R.id.cbxNaranja);

        for (int i=0; i<10; i++){
            ropa [i] = new Viaje();
        }
    }

    public void registrarDatos(View view){
        if(con < 10){
        try {

            ropa[con].setCodigo(codigo.getText().toString());
            ropa[con].setCosto(Float.parseFloat(costo.getText().toString()));
            ropa[con].setOrigen(spinenr.getSelectedItem().toString());


            if (chica.isChecked()) {
                aux2 = 5;
            } else if (mediana.isChecked()) {
                aux2 = 10;
            } else if (grande.isChecked()) {
               aux2 = 15;
            }

            ropa[con].setDias(aux2);

            if (blanco.isChecked()) {
                aux = 3;
            } if (negro.isChecked()) {
                aux = 2;
            } if (rojo.isChecked()) {
                aux = 5;
            } if (azul.isChecked()) {
                aux =6;
            } if (naranja.isChecked()) {
                aux = 4;
            }

            ropa[con].setPersonas(aux);

            Toast.makeText(this, "Viaje guardada de forma correcta", Toast.LENGTH_SHORT).show();

            con++;
            limpiar();
        }catch (Exception e){
            Toast.makeText(this, "No se pudo guardar la ropa", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();

        }


        }else {
            Toast.makeText(this, "Viaje llena, ya no hay espacio", Toast.LENGTH_SHORT).show();
        }
    }

    public void limpiarComponentes(View view){
        limpiar();
    }

    public void limpiar(){
        System.out.println("se denio limpiar");
        codigo.setText("");
        costo.setText("");
        azul.setChecked(false);
        naranja.setChecked(false);
        rojo.setChecked(false);
        negro.setChecked(false);
        blanco.setChecked(false);
        chica.setChecked(false);
        mediana.setChecked(false);
        grande.setChecked(false);
        codigo.requestFocus();
    }

    public void buscar(View view){
        chica.setChecked(true);
        mediana.setChecked(true);
        try{

            for (int i=0; i<=con; i++){
                if(ropa[i].getCodigo().equals(codigo.getText().toString())){

                    costo.setText(String.valueOf(ropa[i].getCosto()));

                    if(ropa[i].getDias()==5)chica.setChecked(true);
                    else if (ropa[i].getDias()==10) mediana.setChecked(true);
                    else if (ropa[i].getDias()==15) grande.setChecked(true);

                    if (ropa[i].getPersonas()==3)blanco.setChecked(true);
                    if (ropa[i].getPersonas()==2) negro.setChecked(true);
                    if (ropa[i].getPersonas()==6) azul.setChecked(true);
                    if (ropa[i].getPersonas()==4) naranja.setChecked(true);
                    if (ropa[i].getPersonas()==5) rojo.setChecked(true);
                    uno = true;


                }
            }

            if(uno == true)  {
                Toast.makeText(this, "El viaje existe", Toast.LENGTH_SHORT).show();
            }
            else {
                Toast.makeText(this, "No existe el viaje", Toast.LENGTH_SHORT).show();
                limpiar();
            }
            uno = false;


        }catch (Exception e){

        }
    }

    public static Viaje[] removeTheElement(Viaje[] arr, int index)
    {

        if (arr == null || index < 0
                || index >= arr.length) {

            return arr;
        }

        Viaje[] anotherArray = new Viaje[arr.length - 1];


        for (int i = 0, k = 0; i < arr.length; i++) {


            if (i == index) {
                continue;
            }


            anotherArray[k++] = arr[i];
        }

        return anotherArray;
    }


    public void eliminarRopa(View view){

        try{
            for (int i=0; i<=con; i++){
                if(ropa[i].getCodigo().equals(codigo.getText().toString())){
                    dos = true;
                    ropa = removeTheElement(ropa, i);
                    Toast.makeText(this, "Se eliminó el viaje!" , Toast.LENGTH_SHORT).show();
                    con--;
                }
            }

        if (dos != true ){
            Toast.makeText(this, "No se encontró el código", Toast.LENGTH_SHORT).show();
        }

        dos = false;
        limpiar();

        }catch (Exception e){

        }
    }



}