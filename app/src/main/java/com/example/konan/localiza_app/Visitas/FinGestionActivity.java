package com.example.konan.localiza_app.Visitas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.konan.localiza_app.R;

public class FinGestionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fin_gestion);

        Button salirFinGestionBoton = (Button) findViewById(R.id.salirFinGestionBoton);



        salirFinGestionBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FinGestionActivity .this,GestionesActivity.class);
/*
                intent.putExtra("nombreGest", nombreGest);
                intent.putExtra("nombreClie",nombreClie);
                intent.putExtra("direccionClie", direccionClie);
*/
                startActivity(intent);

            }
        });

    }
}
