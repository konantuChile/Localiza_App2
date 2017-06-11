package com.example.konan.localiza_app;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.konan.localiza_app.Visitas.ClientesActivity;


public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button visitasboton = (Button) findViewById(R.id.visitasBoton);

        visitasboton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, ClientesActivity.class);

                startActivity(intent);
            }
        });

        Button planificarboton = (Button) findViewById(R.id.planificarBoton);

        planificarboton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Intent intent = new Intent(MenuActivity.this, NodisponibleActivity.class);

                //startActivity(intent);
            }
        });

    }
}
