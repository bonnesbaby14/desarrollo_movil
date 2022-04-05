package com.example.practica05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText codigo, costo, marca, modelo;
    private RadioButton chica, mediana, grande;
    private CheckBox negro, blanco, rojo, azul, naranja;
    RopaDeportiva ropa[] = new RopaDeportiva[15];
    Boolean uno = false, dos = false;
    String aux, aux2;
    int con = 0, valor=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        codigo = findViewById(R.id.txtCodigo);
        costo = findViewById(R.id.txtCosto);
        marca = findViewById(R.id.txtMarca);
        modelo = findViewById(R.id.txtModelo);
        chica = (RadioButton) findViewById(R.id.rbChico);
        mediana = (RadioButton) findViewById(R.id.rbMediano);
        grande = (RadioButton) findViewById(R.id.rbGrande);
        negro = findViewById(R.id.cbxNegro);
        blanco = findViewById(R.id.cbxBlanco);
        rojo = findViewById(R.id.cbxRojo);
        azul = findViewById(R.id.cbxAzul);
        naranja = findViewById(R.id.cbxNaranja);

        for (int i=0; i<15; i++){
            ropa [i] = new RopaDeportiva();
        }
    }

    public void registrarDatos(View view){
        if(con < 15){
        try {
            ropa[con].setMarca(marca.getText().toString());
            ropa[con].setCodigo(codigo.getText().toString());
            ropa[con].setCosto(costo.getText().toString());
            ropa[con].setModelo(modelo.getText().toString());

            if (chica.isChecked()) {
                aux2 = "C-";
            } else if (mediana.isChecked()) {
                aux2 = "M-";
            } else if (grande.isChecked()) {
               aux2 = "G-";
            }

            ropa[con].setTalla(aux2);

            if (blanco.isChecked()) {
                aux += "Blanco-";
            } if (negro.isChecked()) {
                aux += "Negro-";
            } if (rojo.isChecked()) {
                aux += "Rojo-";
            } if (azul.isChecked()) {
                aux += "Azul-";
            } if (naranja.isChecked()) {
                aux += "Naranja-";
            }

            ropa[con].setColores(aux);

            Toast.makeText(this, "Ropa guardada de forma correcta", Toast.LENGTH_SHORT).show();

            con++;
            limpiar();
        }catch (Exception e){
            Toast.makeText(this, "No se pudo guardar la ropa", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();

        }


        }else {
            Toast.makeText(this, "Ropa llena, ya no hay espacio", Toast.LENGTH_SHORT).show();
        }
    }

    public void limpiarComponentes(View view){
        limpiar();
    }

    public void limpiar(){
        codigo.setText("");
        marca.setText("");
        modelo.setText("");
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
                    marca.setText(ropa[i].getMarca());
                    modelo.setText(ropa[i].getModelo());
                    costo.setText(ropa[i].getCosto());

                    if(ropa[i].getTalla().equals("C-")) chica.setChecked(true);
                    else if (ropa[i].getTalla().indexOf("M") >= 0) mediana.setChecked(true);
                    else if (ropa[i].getTalla().indexOf("G") >= 0) grande.setChecked(true);

                    if (ropa[i].getColores().indexOf("B") >= 0) blanco.setChecked(true);
                    if (ropa[i].getColores().indexOf("Ne") >= 0) negro.setChecked(true);
                    if (ropa[i].getColores().indexOf("A") >= 0) azul.setChecked(true);
                    if (ropa[i].getColores().indexOf("Na") >= 0) naranja.setChecked(true);
                    if (ropa[i].getColores().indexOf("R") >= 0) rojo.setChecked(true);
                    uno = true;


                }
            }

            if(uno == true)  {
                Toast.makeText(this, "La ropa existe", Toast.LENGTH_SHORT).show();
            }
            else {
                Toast.makeText(this, "No existe la ropa", Toast.LENGTH_SHORT).show();
                limpiar();
            }
            uno = false;


        }catch (Exception e){

        }
    }

    public static RopaDeportiva[] removeTheElement(RopaDeportiva[] arr, int index)
    {

        if (arr == null || index < 0
                || index >= arr.length) {

            return arr;
        }

        RopaDeportiva[] anotherArray = new RopaDeportiva[arr.length - 1];


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
                    Toast.makeText(this, "Se eliminó la ropa!" , Toast.LENGTH_SHORT).show();
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