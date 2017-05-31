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
import com.example.konan.localiza_app.MenuActivity;
import com.example.konan.localiza_app.R;

import java.util.ArrayList;

public class ClientesActivity extends AppCompatActivity {

    TextView nombreClie;
    TextView direccionClie;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clientes);

        Button clientessalirboton = (Button) findViewById(R.id.clientesSalirBoton);
        final TextView nombreClie = (TextView) findViewById(R.id.nombreClienteItem);
        final TextView direccionClie = (TextView) findViewById(R.id.direccionClienteItem);

        clientessalirboton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ClientesActivity.this,MenuActivity.class);

                startActivity(intent);

            }
        });
        ListView lv = (ListView) findViewById(R.id.list1);

        ArrayList<Clientes> arraydir = new ArrayList< Clientes>();
        Clientes item;

        // Introduzco los datos
        item = new Clientes(" Juan Pérez","San Carlos 1234 - Puente Alto");
        arraydir.add(item);
        item = new Clientes(" Luis Gómez","Concha y Toro 5412 - La Floridad");
        arraydir.add(item);
        item = new Clientes(" Margarita Fernandez","San Fernando Nro.03 - La Florida");
        arraydir.add(item);
        item = new Clientes(" Pablo Vallejos","Santa Rosa 23434 - Puente Alto");
        arraydir.add(item);
        item = new Clientes(" José González","Rojas Magallanes 1233- La Florida");
        arraydir.add(item);
        item = new Clientes(" Marcelo Fernandez","Trinidad 3242 - La Florida");
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

                TextView nombreClietextView = (TextView) view.findViewById(R.id.nombreClienteItem);
                String nombre = nombreClietextView.getText().toString();
                TextView direccionClietextView = (TextView) view.findViewById(R.id.direccionClienteItem);
                String direccion = direccionClietextView.getText().toString();
                intent.putExtra("nombreClie", nombre);
                intent.putExtra("direccionClie", direccion);
                startActivity(intent);
            }
        });
    }
/*
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        //System.out.println(nombreClie.getText().toString());
        outState.putString("nombreClie", nombreClie.getText().toString());
        outState.putString("direccionClie", direccionClie.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        String savedNombre = savedInstanceState.getString("nombreClie");
        String savedDireccion = savedInstanceState.getString("direccionClie");
        nombreClie.setText(savedNombre);
        direccionClie.setText(savedDireccion);
    }
    */
}
