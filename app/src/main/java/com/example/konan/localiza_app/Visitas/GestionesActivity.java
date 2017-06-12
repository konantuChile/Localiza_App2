package com.example.konan.localiza_app.Visitas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
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
    String movClie;
    String idClie;
    String nombreClie;
    String direccionClie;
    String nombreGest="";
    ListView lvGestion;
    ListView lvGestionFiltro;

    ArrayList<Gestiones> arrayFiltro = new ArrayList<Gestiones>();
    ArrayList<Gestiones> arraydir = new ArrayList<Gestiones>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gestiones);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        nombreClieTV = (TextView) findViewById(R.id.nombreClienteGestiones);
        direccionClieTV = (TextView) findViewById(R.id.direccionClienteGestiones);
        Button gestionsalirboton = (Button) findViewById(R.id.gestionesSalirBoton);

        lvGestion = (ListView) findViewById(R.id.gestionesList);


        Bundle parametro = getIntent().getExtras();

        if (parametro != null)
        {
            movClie = parametro.getString("movClie");
            idClie = parametro.getString("idClie");
            nombreClieTV.setText(parametro.getString("nombreClie"));
            nombreClie = parametro.getString("nombreClie");
            direccionClieTV.setText(parametro.getString("direccionClie"));
            direccionClie = parametro.getString("direccionClie");
            nombreGest = parametro.getString("nombreGest");

            CargarArreglo();

            if(movClie.equals("0"))
            {
                CargarArregloFitrado(idClie);
            }
            else
            {

            }
        }

        gestionsalirboton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GestionesActivity.this,MenuActivity.class);

                startActivity(intent);

            }
        });

        lvGestion.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                final int pos = position;
                Intent intent = new Intent(GestionesActivity.this, IniciaGestionActivity.class);

                TextView nombreGestiontextView = (TextView) view.findViewById(R.id.nombreGestiones);
                String nombreGest = nombreGestiontextView .getText().toString();
                intent.putExtra("idClie", idClie);
                intent.putExtra("nombreGest", nombreGest);
                intent.putExtra("nombreClie",nombreClie);
                intent.putExtra("direccionClie", direccionClie);
                startActivity(intent);
            }
        });
    }

    private void CargarArreglo() {

        //ArrayList<Gestiones> arraydir = new ArrayList<Gestiones>();
        Gestiones item;

        item = new Gestiones("10152214-8","Cobranza");
        arraydir.add(item);
        item = new Gestiones("10152214-8","Comprobar Domicilio");
        arraydir.add(item);
        item = new Gestiones("10152214-8","Entregar Informacion");
        arraydir.add(item);
        item = new Gestiones("10940534-5","Cobranza");
        arraydir.add(item);
        item = new Gestiones("12510204-2","Comprobar Domicilio");
        arraydir.add(item);
        item = new Gestiones("1483069-3","Entregar Informacion");
        arraydir.add(item);
        item = new Gestiones("3268381-9","Cobranza");
        arraydir.add(item);
        item = new Gestiones("3268381-9","Comprobar Domicilio");
        arraydir.add(item);
        item = new Gestiones("3268381-9","Entregar Informacion");
        arraydir.add(item);
        item = new Gestiones("3878892-2","Cobranza");
        arraydir.add(item);
        item = new Gestiones("3955295-7","Comprobar Domicilio");
        arraydir.add(item);
        item = new Gestiones("4225349-9","Cobranza");
        arraydir.add(item);
        item = new Gestiones("4225349-9","Comprobar Domicilio");
        arraydir.add(item);
        item = new Gestiones("4225349-9","Entregar Informacion");
        arraydir.add(item);
        item = new Gestiones("5020146-5","Cobranza");
        arraydir.add(item);
        item = new Gestiones("5020146-5","Entregar Informacion");
        arraydir.add(item);
        item = new Gestiones("5231905-6","Cobranza");
        arraydir.add(item);
        item = new Gestiones("5231905-6","Comprobar Domicilio");
        arraydir.add(item);
        item = new Gestiones("5231905-6","Entregar Informacion");
        arraydir.add(item);
        item = new Gestiones("5275677-4","Cobranza");
        arraydir.add(item);
        item = new Gestiones("5275677-4","Comprobar Domicilio");
        arraydir.add(item);
        item = new Gestiones("5275677-4","Entregar Informacion");
        arraydir.add(item);
        item = new Gestiones("5435700-1","Cobranza");
        arraydir.add(item);
        item = new Gestiones("5435700-1","Comprobar Domicilio");
        arraydir.add(item);
        item = new Gestiones("5512315-2","Cobranza");
        arraydir.add(item);
        item = new Gestiones("5512315-2","Comprobar Domicilio");
        arraydir.add(item);
        item = new Gestiones("5512315-2","Entregar Informacion");
        arraydir.add(item);
        item = new Gestiones("5545458-2","Cobranza");
        arraydir.add(item);
        item = new Gestiones("5838911-0","Comprobar Domicilio");
        arraydir.add(item);
        item = new Gestiones("5838911-0","Entregar Informacion");
        arraydir.add(item);
        item = new Gestiones("6021138-8","Cobranza");
        arraydir.add(item);
        item = new Gestiones("8700923-8","Comprobar Domicilio");
        arraydir.add(item);
        item = new Gestiones("9656825-8","Entregar Informacion");
        arraydir.add(item);
        item = new Gestiones("9656825-8","Cobranza");
        arraydir.add(item);
        item = new Gestiones("9656825-8","Comprobar Domicilio");
        arraydir.add(item);

        // Creo el adapter personalizado
        AdapterGestion adaptador = new AdapterGestion(this, arraydir);
        // Lo aplico
        lvGestion.setAdapter(adaptador);
    }

    private  void CargarArregloFitrado(String idCliente) {

        arrayFiltro.clear();//.getAdapter(null);
        Gestiones itemFiltro;

        for (int i = 0; i < arraydir.size(); i++){
            System.out.println(arraydir.get(i).getIdClienteGest());
            if (arraydir.get(i).getIdClienteGest().equals(idCliente)) {
                itemFiltro = new Gestiones(arraydir.get(i).getIdGestion());
                arrayFiltro.add(itemFiltro);

                // Creo el adapter personalizado
                AdapterGestion adaptador = new AdapterGestion(this, arrayFiltro);
                // Lo aplico
                lvGestion.setAdapter(adaptador);
            }
        }
    }
}
