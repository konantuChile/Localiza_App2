package com.example.konan.localiza_app.Visitas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.konan.localiza_app.Clases.AdapterGestion;
import com.example.konan.localiza_app.Clases.Gestiones;
import com.example.konan.localiza_app.MenuActivity;
import com.example.konan.localiza_app.R;

import java.util.ArrayList;

public class GestionesActivity extends AppCompatActivity {

    TextView nombreClieTV;
    TextView direccionClieTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gestiones);

        nombreClieTV = (TextView) findViewById(R.id.nombreClienteGestion);
        direccionClieTV = (TextView) findViewById(R.id.direccionClienteGestion);
        Button gestionsalirboton = (Button) findViewById(R.id.gestionesSalirBoton);

        Bundle parametro = getIntent().getExtras();

        if (parametro != null)
        {
            nombreClieTV.setText(parametro.getString("nombreClie"));
            direccionClieTV.setText(parametro.getString("direccionClie"));
        }

        gestionsalirboton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GestionesActivity.this,MenuActivity.class);

                startActivity(intent);

            }
        });


        ListView lvGestion = (ListView) findViewById(R.id.gestionesList);

        ArrayList<Gestiones> arraydir = new ArrayList<Gestiones>();
        Gestiones item;

        // Introduzco los datos
        item = new Gestiones(" Comprobar Domicilio");
        arraydir.add(item);
        item = new Gestiones(" Cobranza");
        arraydir.add(item);
        item = new Gestiones(" Entregar Informacion");
        arraydir.add(item);
        // Creo el adapter personalizado
        AdapterGestion adaptador = new AdapterGestion(this, arraydir);
        // Lo aplico
        lvGestion.setAdapter(adaptador);

    }
}
