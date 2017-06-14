package com.example.konan.localiza_app.Visitas;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

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

        ImageButton sigGestionesImageBoton = (ImageButton) findViewById(R.id.sigGestionesImageBoton);
        ImageButton histGestionesImageBoton = (ImageButton) findViewById(R.id.histGestionesImageBoton);
        ImageButton imgQueDecir = (ImageButton) findViewById(R.id.imgQueDecir);

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


        imgQueDecir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Get widgets reference from XML layout
                final TextView comentarioGestion = (TextView) findViewById(R.id.comentarioGestion);

                final AlertDialog.Builder comenatrioAlertDialog = new AlertDialog.Builder(IniciaGestionActivity.this);

                String textoDecir="Buenos Dias (Tardes), mi nombre es: ........., es usted: "+ nombreClie +"?, ";

                if(nombreGest.equals("Cobranza"))
                {
                    textoDecir="vengo por encargo de empresas ripley por una deuna de: $200.000.- ,que aún mantiene vigente";
                }
                if(nombreGest.equals("Comprobar Domicilio"))
                {
                    textoDecir=textoDecir + "¿éste es su domicilio Particular?, vengo por encargo de Tajetas JUMBO, ¿Me puede facilitar alguna cuenta de servicio que este a su nombre?";
                }
                if(nombreGest.equals("Entregar Informacion"))
                {
                    textoDecir= textoDecir + " Tengo una documentación del Banco Estado para Usted";
                }

                comenatrioAlertDialog.setTitle("Que Decir en: "+ nombreGest);
                comenatrioAlertDialog.setMessage(textoDecir);

                comenatrioAlertDialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {

                    }
                });
                comenatrioAlertDialog.show();
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

                intent.putExtra("idClie",idClie);
                intent.putExtra("nombreGest", nombreGest);
                intent.putExtra("nombreClie",nombreClie);
                intent.putExtra("direccionClie", direccionClie);

                startActivity(intent);

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
