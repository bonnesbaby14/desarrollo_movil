package com.example.parcial2rodriguezgabriel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Formulario extends AppCompatActivity {

    Mueble [] muebles;
    public int contador=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        muebles=new Mueble[5];
        EditText modelo=findViewById(R.id.txtModelo);
        EditText codigo=findViewById(R.id.txtCodigo);
        EditText costo=findViewById(R.id.txtCosto);

        RadioButton madera = (RadioButton) findViewById(R.id.rbmadera);
        RadioButton metal = (RadioButton) findViewById(R.id.rbMetal);
        RadioButton plastico = (RadioButton) findViewById(R.id.rbplastico);

        CheckBox negro=findViewById(R.id.cbxNegro);
        CheckBox blanco=findViewById(R.id.cbxblanco);

        Button registar=findViewById(R.id.btnRegistar);
        Button actualziar=findViewById(R.id.btnActualizar);
        Button eliminar=findViewById(R.id.btnEliminar);
        Button buscar=findViewById(R.id.btnBuscar);

        for (int i=0; i<5; i++){
            muebles [i] = new Mueble("","",-1,"",-1);
        }

        actualziar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean encontrado=false;
                for (int i=0; i<5; i++){
                    if(muebles[i].getCodigo().equals(codigo.getText().toString())){

                        encontrado=true;
                        String material="";
                        int acabadod=-1;

                        if(madera.isChecked()){
                            material="madera";


                        }
                        if(metal.isChecked()){
                            material="metal";


                        }
                        if(plastico.isChecked()){
                            material="plastico";


                        }

                        if(negro.isChecked()){
                            acabadod=0;
                            if (blanco.isChecked()){
                                acabadod=2;
                            }
                        }else{
                            acabadod=1;
                        }

                        muebles[i].setModelo(modelo.getText().toString());
                        muebles[i].setCodigo(codigo.getText().toString());
                        muebles[i].setCosto(Integer.parseInt(costo.getText().toString()));
                        muebles[i].setMaterial(material);
                        muebles[i].setAcabados(acabadod);
                        Toast toast = Toast.makeText(getApplicationContext(), "Actualizado", Toast.LENGTH_SHORT);
                        toast.show();



                    }
                }
                if(!encontrado){
                    Toast toast = Toast.makeText(getApplicationContext(), "No se encontro", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
        eliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean encontrado=false;
                for (int i=0; i<5; i++){
                    if(muebles[i].getCodigo().equals(codigo.getText().toString())){

                        encontrado=true;
                        muebles[i].setAcabados(-1);
                        muebles[i].setCosto(-1);
                        muebles[i].setMaterial("");
                        muebles[i].setCodigo("");
                        muebles[i].setModelo("");

                        Toast toast = Toast.makeText(getApplicationContext(), "Elinminado", Toast.LENGTH_SHORT);
                        toast.show();


                    }
                }
                if(!encontrado){
                    Toast toast = Toast.makeText(getApplicationContext(), "No se encontro", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean encontrado=false;
                for (int i=0; i<5; i++){
                    if(muebles[i].getCodigo().equals(codigo.getText().toString())){

                        encontrado=true;
                        modelo.setText(muebles[i].getModelo().toString());
                        codigo.setText(muebles[i].getCodigo().toString());
                        costo.setText(String.valueOf(muebles[i].getCosto()));

                        if(muebles[i].getMaterial().equals("madera")){
                            madera.setChecked(true);

                        }
                        if(muebles[i].getMaterial().equals("metal")){
                            metal.setChecked(true);

                        }
                        if(muebles[i].getMaterial().equals("plastico")){
                            plastico.setChecked(true);

                        }

                        if(muebles[i].getAcabados()==0){
                            negro.setChecked(true);

                        }
                        if(muebles[i].getAcabados()==1){
                            blanco.setChecked(true);

                        }
                        if(muebles[i].getAcabados()==2){
                            blanco.setChecked(true);
                            negro.setChecked(true);
                        }





                    }
                }
                if(!encontrado){
                    Toast toast = Toast.makeText(getApplicationContext(), "No se encontro", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
        registar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(contador<5){

                    String material="";
                    int acabadod=-1;

                    if(madera.isChecked()){
                        material="madera";


                    }
                    if(metal.isChecked()){
                        material="metal";


                    }
                    if(plastico.isChecked()){
                        material="plastico";


                    }

                    if(negro.isChecked()){
                        acabadod=0;
                        if (blanco.isChecked()){
                            acabadod=2;
                        }
                    }else{
                        acabadod=1;
                    }

                    muebles[contador].setModelo(modelo.getText().toString());
                    muebles[contador].setCodigo(codigo.getText().toString());
                    muebles[contador].setCosto(Integer.parseInt(costo.getText().toString()));
                    muebles[contador].setMaterial(material);
                    muebles[contador].setAcabados(acabadod);
                    Toast toast = Toast.makeText(getApplicationContext(), "Registrado", Toast.LENGTH_SHORT);
                    toast.show();






                }



            }
        });






    }
}