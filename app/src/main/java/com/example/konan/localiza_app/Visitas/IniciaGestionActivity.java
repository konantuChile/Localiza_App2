package com.example.konan.localiza_app.Visitas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.konan.localiza_app.MenuActivity;
import com.example.konan.localiza_app.R;

public class IniciaGestionActivity extends AppCompatActivity {

    TextView nombreClieGestTV;
    TextView direccionClieGestTV;
    TextView nombreGestionGestTV;
    String idClie;
    String nombreClie;
    String direccionClie;
    String nombreGest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicia_gestion);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        nombreClieGestTV = (TextView) findViewById(R.id.nombreClienteIniGestion);
        direccionClieGestTV = (TextView) findViewById(R.id.direccionClienteIniGestion);
        nombreGestionGestTV = (TextView) findViewById(R.id.nombreGestionIniGestion);

        Button  iniGestionsalirboton = (Button) findViewById(R.id.iniGestionesSalirBoton);
        ImageButton sigGestionesImageBoton = (ImageButton) findViewById(R.id.sigGestionesImageBoton);
        ImageButton histGestionesImageBoton = (ImageButton) findViewById(R.id.histGestionesImageBoton);

        Bundle parametro = getIntent().getExtras();

        if (parametro != null)
        {
            idClie = parametro.getString("idClie");
            nombreClieGestTV.setText(parametro.getString("nombreClie"));
            nombreClie =parametro.getString("nombreClie");
            direccionClieGestTV.setText(parametro.getString("direccionClie"));
            direccionClie = parametro.getString("direccionClie");
            nombreGestionGestTV.setText(parametro.getString("nombreGest"));
            nombreGest = parametro.getString("nombreGest");
        }

        iniGestionsalirboton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IniciaGestionActivity.this,MenuActivity.class);

                startActivity(intent);

            }
        });

        sigGestionesImageBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IniciaGestionActivity.this,IngresaGestionActivity.class);

                intent.putExtra("idClie",idClie);
                intent.putExtra("nombreGest", nombreGest);
                intent.putExtra("nombreClie",nombreClie);
                intent.putExtra("direccionClie", direccionClie);

                startActivity(intent);

            }
        });

        histGestionesImageBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IniciaGestionActivity.this,HistorialActivity.class);

                intent.putExtra("nombreClie",nombreClie);

                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return false;
    }
}
