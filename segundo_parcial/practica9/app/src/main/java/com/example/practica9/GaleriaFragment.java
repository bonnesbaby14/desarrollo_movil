package com.example.practica9;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link GaleriaFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class GaleriaFragment extends Fragment {
    //Instancias
    private Button efecto, musica;
    private View vista; //para acceder a los botones del Fragment
    SoundPool sp; //Objeto para reproducir audio corto
    MediaPlayer mp; //Objeto para reproducir audio largo
    int sonido_de_Reproduccion;
    boolean reproducir;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public GaleriaFragment() {
        // Required empty public constructor
    }

    public static GaleriaFragment newInstance(String param1, String param2) {
        GaleriaFragment fragment = new GaleriaFragment();
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
        vista = inflater.inflate(R.layout.fragment_galeria, container, false);
        //Por medio de la instacia vista se accede al botón del fragment
        //tal como se realiza con el Activity
        efecto = (Button) vista.findViewById(R.id.btnEfecto);
        musica = (Button) vista.findViewById(R.id.btnMusica);

        //Bandera de reproducción
        reproducir = false;
        //Se define el escucha para el botón Reproducir efecto
        efecto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Reproducción de efecto.",
                        Toast.LENGTH_SHORT).show();



                sp = new SoundPool(1, AudioManager.STREAM_MUSIC, 1);
                sp.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() {
                    @Override
                    public void onLoadComplete(SoundPool soundPool, int i, int i1) {
                        sp.play(sonido_de_Reproduccion, 1, 1, 1, 0, 0);
                    }
                });

                sonido_de_Reproduccion = sp.load(getContext(),
                        R.raw.sound_short, 1);


            }
        });
        //Se define el escucha para el botón Reproducir música
        musica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!reproducir) {
                    Toast.makeText(getContext(), "Reproduciendo.",
                            Toast.LENGTH_SHORT).show();
                    //Instancia que se asocia al archivo de audio de larga duración
                    mp = MediaPlayer.create(getContext(), R.raw.audio);
                    //El método reproduce el arhivo.
                    mp.start();
                    reproducir = true;
                } else {
                    mp.stop();
                    Toast.makeText(getContext(), "Detenido.",
                            Toast.LENGTH_SHORT).show();
                    reproducir = false;
                }
            }
        });
        return vista;
    }//onCreateView
}//cla