package com.example.konan.localiza_app.Visitas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.konan.localiza_app.R;

import java.util.ArrayList;

public class FinGestionActivity extends AppCompatActivity {

    String idClie;
    String nombreClie;
    String direccionClie;
    String nombreGest;
    ArrayList<String> lista;

    TextView nombreClieTV;
    TextView direccionClieTV;
    TextView nombreGestTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fin_gestion);

        Button salirFinGestionBoton = (Button) findViewById(R.id.salirFinGestionBoton);

        nombreClieTV = (TextView) findViewById(R.id.nombreClienteFinGestion);
        direccionClieTV = (TextView) findViewById(R.id.direccionClienteFinGestion);
        nombreGestTV = (TextView) findViewById(R.id.nombreGestionFinGestion);

        Bundle parametro = getIntent().getExtras();

        if (parametro != null) {
            idClie = parametro.getString("idClie");
            nombreClie = parametro.getString("nombreClie");
            direccionClie = parametro.getString("direccionClie");
            nombreGest = parametro.getString("nombreGest");

            nombreClieTV.setText(parametro.getString("nombreClie"));
            direccionClieTV.setText(parametro.getString("direccionClie"));
            nombreGestTV.setText(parametro.getString("nombreGest"));
        }

        salirFinGestionBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(FinGestionActivity.this, GestionesActivity.class);

                intent.putExtra("movClie", "1");
                intent.putExtra("idClie", idClie);
                intent.putExtra("nombreGest", nombreGest);
                intent.putExtra("nombreClie", nombreClie);
                intent.putExtra("direccionClie", direccionClie);

                startActivity(intent);

            }
        });

    }
}
