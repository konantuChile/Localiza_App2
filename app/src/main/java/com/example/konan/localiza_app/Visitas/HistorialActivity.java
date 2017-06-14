package com.example.konan.localiza_app.Visitas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.konan.localiza_app.Clases.AdapterHistorial;
import com.example.konan.localiza_app.Clases.Historial;
import com.example.konan.localiza_app.R;

import java.util.ArrayList;

public class HistorialActivity extends AppCompatActivity {

    TextView nombreClieHisttTV;
    TextView direccionClieHistTV;
    String movClie;
    String idClie;
    String nombreClie;
    String direccionClie;
    String nombreGest="";

    ListView lvGestionHist;

    ArrayList<Historial> arrayFiltro = new ArrayList<Historial>();
    ArrayList<Historial> arraydir = new ArrayList<Historial>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historial);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        nombreClieHisttTV = (TextView) findViewById(R.id.nombreClienteHistGestion);
        lvGestionHist = (ListView) findViewById(R.id.gestionesHistList);

        Bundle parametro = getIntent().getExtras();

        if (parametro != null)
        {
            idClie = parametro.getString("idClie");
            nombreClieHisttTV.setText(parametro.getString("nombreClie"));
            nombreClie =parametro.getString("nombreClie");
            direccionClie = parametro.getString("direccionClie");
            nombreGest = parametro.getString("nombreGest");

            CargarArregloHist();
            CargarArregloFitradoHist(idClie);
        }
    }

    private void CargarArregloHist() {
        
        Historial item;

        item = new Historial("5231905-6","27/11/2013","Cobranza","Entrega Documentacion");
        arraydir.add(item);
        item = new Historial("3878892-2","10/11/2016","Cobranza","No Recibe Documentacion");
        arraydir.add(item);
        item = new Historial("5275677-4","19/08/2015","Comprobar Domicilio","Entrega Documentacion");
        arraydir.add(item);
        item = new Historial("8700923-8","02/07/2015","Cobranza","No Vive Allí");
        arraydir.add(item);
        item = new Historial("5435700-1","02/12/2014","Comprobar Domicilio","No Recibe Documentacion");
        arraydir.add(item);
        item = new Historial("5838911-0","09/02/2017","Entregar Informacion","No Vive Allí");
        arraydir.add(item);
        item = new Historial("5020146-5","08/12/2015","Entregar Informacion","Otro");
        arraydir.add(item);
        item = new Historial("3878892-2","23/07/2014","Comprobar Domicilio","No Vive Allí");
        arraydir.add(item);
        item = new Historial("9656825-8","06/10/2013","Cobranza","Otro");
        arraydir.add(item);
        item = new Historial("5231905-6","25/05/2017","Cobranza","Otro");
        arraydir.add(item);
        item = new Historial("3955295-7","27/06/2013","Comprobar Domicilio","Otro");
        arraydir.add(item);
        item = new Historial("3268381-9","21/09/2013","Cobranza","Otro");
        arraydir.add(item);
        item = new Historial("4225349-9","12/04/2017","Entregar Informacion","Entrega Documentacion");
        arraydir.add(item);
        item = new Historial("6021138-8","19/07/2015","Comprobar Domicilio","Otro");
        arraydir.add(item);
        item = new Historial("5512315-2","02/09/2016","Comprobar Domicilio","Entrega Documentacion");
        arraydir.add(item);
        item = new Historial("9656825-8","27/03/2017","Entregar Informacion","No Recibe Documentacion");
        arraydir.add(item);
        item = new Historial("5275677-4","26/09/2015","Cobranza","No Vive Allí");
        arraydir.add(item);
        item = new Historial("5545458-2","06/12/2014","Cobranza","Entrega Documentacion");
        arraydir.add(item);
        item = new Historial("9656825-8","06/06/2013","Entregar Informacion","No Recibe Documentacion");
        arraydir.add(item);
        item = new Historial("5275677-4","12/10/2016","Entregar Informacion","No Recibe Documentacion");
        arraydir.add(item);
        item = new Historial("5435700-1","17/10/2015","Cobranza","Otro");
        arraydir.add(item);
        item = new Historial("10940534-5","25/09/2016","Comprobar Domicilio","No Recibe Documentacion");
        arraydir.add(item);
        item = new Historial("12510204-2","26/10/2014","Entregar Informacion","Otro");
        arraydir.add(item);
        item = new Historial("8700923-8","09/12/2015","Entregar Informacion","No Recibe Documentacion");
        arraydir.add(item);
        item = new Historial("5231905-6","24/12/2014","Cobranza","No Vive Allí");
        arraydir.add(item);
        item = new Historial("10940534-5","25/04/2014","Comprobar Domicilio","No Recibe Documentacion");
        arraydir.add(item);
        item = new Historial("5545458-2","04/06/2016","Comprobar Domicilio","Otro");
        arraydir.add(item);
        item = new Historial("12510204-2","27/01/2016","Comprobar Domicilio","No Vive Allí");
        arraydir.add(item);
        item = new Historial("5231905-6","30/04/2015","Comprobar Domicilio","No Recibe Documentacion");
        arraydir.add(item);

        // Creo el adapter personalizado
        AdapterHistorial adaptador = new AdapterHistorial(this, arraydir);
        // Lo aplico
        lvGestionHist.setAdapter(adaptador);
    }

    private  void CargarArregloFitradoHist(String idCliente) {

        arrayFiltro.clear();//.getAdapter(null);
        Historial itemFiltro;

        for (int i = 0; i < arraydir.size(); i++){
            System.out.println(arraydir.get(i).getIdCliente());
            if (arraydir.get(i).getIdCliente().equals(idCliente)) {
                itemFiltro = new Historial(arraydir.get(i).getFechaGestion(),arraydir.get(i).getNombreGestion(),arraydir.get(i).getResultadoGestion());
                arrayFiltro.add(itemFiltro);

                // Creo el adapter personalizado
                AdapterHistorial adaptador = new AdapterHistorial(this, arrayFiltro);
                // Lo aplico
                lvGestionHist.setAdapter((ListAdapter) adaptador);
            }
        }

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return false;
    }
}
