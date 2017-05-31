package com.example.konan.localiza_app.Planifica;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.konan.localiza_app.MenuActivity;
import com.example.konan.localiza_app.R;

public class NodisponibleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nodisponible);

        Button nodispsalirboton = (Button) findViewById(R.id.noDispSalirBoton);

        nodispsalirboton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NodisponibleActivity.this, MenuActivity.class);

                startActivity(intent);

            }
        });
    }
}
