package com.example.practica9;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FormularioFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FormularioFragment extends Fragment {
    //Instancias
    private Button enviar;
    private TextView correo;
    private View vista; //para acceder al botón del Fragment
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    public FormularioFragment() {
        // Required empty public constructor
    }
    public static FormularioFragment newInstance(String param1, String param2) {
        FormularioFragment fragment = new FormularioFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Devolver la referecia al archivo xml
        vista = inflater.inflate(R.layout.fragment_formulario, container, false);
        //Por medio de la instacia vista se accede al botón del fragment
        //tal como se realiza con el Activity
        enviar = (Button) vista.findViewById(R.id.btnenciar);
        correo = (TextView) vista.findViewById(R.id.etCorreo);
        //Se define el escucha para el botón
        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Datos enviados de "+
                        correo.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
        return vista;
    }//onCreateView
}//class