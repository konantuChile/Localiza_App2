package com.example.konan.localiza_app.Visitas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.konan.localiza_app.R;

public class HistorialActivity extends AppCompatActivity {

    TextView nombreClieHisttTV;

    String nombreClieHist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historial);

        nombreClieHisttTV = (TextView) findViewById(R.id.nombreClienteHistGestion);
        Button salirHistGestionBoton = (Button) findViewById(R.id.salirHistGestionBoton);

        Bundle parametro = getIntent().getExtras();

        if (parametro != null) {
            nombreClieHisttTV.setText(parametro.getString("nombreClieHist"));


        }

        salirHistGestionBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HistorialActivity.this,IniciaGestionActivity.class);



                startActivity(intent);

            }
        });
    }
}
