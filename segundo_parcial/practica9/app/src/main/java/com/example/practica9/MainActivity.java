package com.example.practica9;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout menu;
    ViewPager escenario;
    ControladorMenu menuCtrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//Asociar instancias con componentes
        menu = (TabLayout) findViewById(R.id.tabmenu);
        escenario = (ViewPager) findViewById(R.id.vwpVisor);
//Se crea una instancia del controlador de menu
        menuCtrl = new
                ControladorMenu(getSupportFragmentManager(), menu.getTabCount());
//Se establece quien controla el cambio de opciones
        escenario.setAdapter(menuCtrl);
//Se crea un escucha para el menú, que permita definir acción por pestaña
        menu.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
//Se identifica la opción elegida
                escenario.setCurrentItem(tab.getPosition());
                switch (tab.getPosition()) {
                    case 0:
                        menuCtrl.notifyDataSetChanged();
                        break;
                    case 1:
                        menuCtrl.notifyDataSetChanged();
                        break;
                    case 2:
                        menuCtrl.notifyDataSetChanged();
                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }


        });
//Asocia el menu con el Viewpager
        escenario.addOnPageChangeListener(new
                TabLayout.TabLayoutOnPageChangeListener(menu));
    }//onCreate
}//class