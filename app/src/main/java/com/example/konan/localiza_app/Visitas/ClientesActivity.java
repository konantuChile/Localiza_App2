package com.example.konan.localiza_app.Visitas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.konan.localiza_app.Clases.AdapterCliente;
import com.example.konan.localiza_app.Clases.Clientes;
import com.example.konan.localiza_app.R;

import java.util.ArrayList;

public class ClientesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clientes);


        Button clientessalirboton = (Button) findViewById(R.id.clientesSalirBoton);
        final TextView idClie = (TextView) findViewById(R.id.idClienteItem);
        final TextView nombreClie = (TextView) findViewById(R.id.nombreClienteItem);
        final TextView direccionClie = (TextView) findViewById(R.id.direccionClienteItem);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // If your minSdkVersion is 11 or higher, instead use:
        // getActionBar().setDisplayHomeAsUpEnabled(true);

        clientessalirboton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();

            }
        });
        ListView lv = (ListView) findViewById(R.id.list1);

        ArrayList<Clientes> arraydir = new ArrayList< Clientes>();
        Clientes item;

        // Introduzco los datos
        item = new Clientes("5231905-6","RUPERTO DEL CARMEN PINTO","1 DE MAYO 1017, SANTIAGO");
        arraydir.add(item);
        item = new Clientes("6021138-8","JUAN ADRIAN FIGUEROA","10 DE JULIO 1398, SANTIAGO");
        arraydir.add(item);
        item = new Clientes("10152214-8","MONICA DE LOURDES AYALA","10 DE JULIO 713, SANTIAGO");
        arraydir.add(item);
        item = new Clientes("5545458-2","JOSE GUILLERMO ALMONACID","1-3 ORIENTE 673, SANTIAGO");
        arraydir.add(item);
        item = new Clientes("12510204-2","ERNESTO SEGUNDO DIAZ","21 DE MAYO 1549, SANTIAGO");
        arraydir.add(item);
        item = new Clientes("4225349-9","JUAN JOSE SEGUNDO RIQUELME","9 DE MARZO 1990, SANTIAGO");
        arraydir.add(item);
        item = new Clientes("3268381-9","EDUARDO LORENZO SERRA","AB GRAL BDO O'HIGGINS 1845, SANTIAGO");
        arraydir.add(item);
        item = new Clientes("3878892-2","ARMANDO DEL CARMEN HUERTA","ABDON CIFUENTES 51, SANTIAGO");
        arraydir.add(item);
        item = new Clientes("5020146-5","ROBERTO CARLOS FERNANDEZ","ABDON CIFUENTES 96, SANTIAGO");
        arraydir.add(item);
        item = new Clientes("8700923-8","FERNANDO ANDRES MONTENEGRO DONOSO","AGUSTINAS 1185, SANTIAGO");
        arraydir.add(item);
        item = new Clientes("10940534-5","ARMANDO RICARDO SILVA OLIVARES","AGUSTINAS 1442, SANTIAGO");
        arraydir.add(item);
        item = new Clientes("5275677-4","LUIS HUMBERTO MOLINA MONTENEGRO","AGUSTINAS 1442, SANTIAGO");
        arraydir.add(item);
        item = new Clientes("1483069-3","OSVALDO ARTURO ENRIQUE ARENAS OJEDA","AGUSTINAS 1480, SANTIAGO");
        arraydir.add(item);
        item = new Clientes("5435700-1","ALEX FABIAN NEIRA JARA","AGUSTINAS 1533, SANTIAGO");
        arraydir.add(item);
        item = new Clientes("9656825-8","LUIS GONZALO BRAVO SOTO","AGUSTINAS 1547, SANTIAGO");
        arraydir.add(item);
        item = new Clientes("5838911-0","LETICIA ISABEL MORALES POLLONI","AGUSTINAS 1850, SANTIAGO");
        arraydir.add(item);
        item = new Clientes("5512315-2","ULISES ENRIQUE MORALES LOPEZ","AGUSTINAS 2250, SANTIAGO");
        arraydir.add(item);
        item = new Clientes("3955295-7","RODRIGO GONZALO DALMAZZO MIRANDA","AGUSTINAS 2492, SANTIAGO");
        arraydir.add(item);

        // Creo el adapter personalizado
        AdapterCliente adaptador = new AdapterCliente(this, arraydir);
        // Lo aplico
        lv.setAdapter(adaptador);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                final int pos = position;
                Intent intent = new Intent(ClientesActivity.this, GestionesActivity.class);

                TextView idClietextView = (TextView) view.findViewById(R.id.idClienteItem);
                String idClie = idClietextView.getText().toString();
                TextView nombreClietextView = (TextView) view.findViewById(R.id.nombreClienteItem);
                String nombre = nombreClietextView.getText().toString();
                TextView direccionClietextView = (TextView) view.findViewById(R.id.direccionClienteItem);
                String direccion = direccionClietextView.getText().toString();
                intent.putExtra("movClie","0");
                intent.putExtra("idClie",idClie);
                intent.putExtra("nombreClie", nombre);
                intent.putExtra("direccionClie", direccion);
                startActivity(intent);
            }
        });
    }
}
