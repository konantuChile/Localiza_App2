package com.example.konan.localiza_app.Visitas;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.konan.localiza_app.MenuActivity;
import com.example.konan.localiza_app.R;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class IngresaGestionActivity extends AppCompatActivity {

    TextView nombreClieIngGestTV;
    TextView direccionClieIngGestTV;
    TextView nombreGestionIngGestTV;

    String idClie;
    String nombreClie;
    String direccionClie;
    String nombreGest;


    //FOTOS
    private ImageView imagen1;
    private EditText et1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresa_gestion);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        nombreClieIngGestTV = (TextView) findViewById(R.id.nombreClienteIngGestion);
        direccionClieIngGestTV = (TextView) findViewById(R.id.direccionClienteIngGestion);
        nombreGestionIngGestTV = (TextView) findViewById(R.id.nombreGestionIngGestion);

        Button selecContactoGestionBoton = (Button) findViewById(R.id.selecContactoGestionBoton);
        Button selecResultadoGestionBoton = (Button) findViewById(R.id.selecResultadoGestionBoton);
        Button tomarFotoGestionBoton = (Button) findViewById(R.id.tomarFotoGestionBoton);
        Button ingComentarioGestionBoton = (Button) findViewById(R.id.ingComentarioGestionBoton);
        Button salirIngGestionBoton = (Button) findViewById(R.id.salirIngGestionBoton);
        Button confirmarIngGestionBoton = (Button) findViewById(R.id.confirmarIngGestionBoton);

        //FOTOS
        imagen1=(ImageView)findViewById(R.id.imageView);
        //et1=(EditText)findViewById(R.id.editText);

        Bundle parametro = getIntent().getExtras();

        if (parametro != null) {
            idClie = parametro.getString("idClie");
            nombreClieIngGestTV.setText(parametro.getString("nombreClie"));
            nombreClie = parametro.getString("nombreClie");
            direccionClieIngGestTV.setText(parametro.getString("direccionClie"));
            direccionClie = parametro.getString("direccionClie");
            nombreGestionIngGestTV.setText(parametro.getString("nombreGest"));
            nombreGest = parametro.getString("nombreGest");
        }

        salirIngGestionBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IngresaGestionActivity.this, MenuActivity.class);

                startActivity(intent);

            }
        });

        selecContactoGestionBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Get widgets reference from XML layout
                final TextView contactoSeleccionado = (TextView) findViewById(R.id.contactoSeleccionado);

                //Initialize a new AlertDialog Builder
                AlertDialog.Builder adb = new AlertDialog.Builder(IngresaGestionActivity.this);

                //Set a title for alert dialog
                adb.setTitle("Seleccione Un Contacto");

                //Initialize a new String Array
                final String[] Contacto = new String[]{
                        "Cliente", "Familia", "Vecino", "Otro",
                };

                //Set a list of items to be displayed in the dialog as the content
                //It will render a single choice traditional list on alert dialog
                adb.setItems(Contacto, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        //This 'which' argument carry the list selected item's index position
                        String clickedItemValue = Arrays.asList(Contacto).get(which);
                        //Set the TextView text color corresponded to the user selected color
                        contactoSeleccionado.setText(clickedItemValue);
                    }
                });

                //Display the Alert Dialog on app interface
                adb.show();
            }
        });

        selecResultadoGestionBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Get widgets reference from XML layout
                final TextView resultadoSeleccionado = (TextView) findViewById(R.id.resultadoSeleccionado);

                //Initialize a new AlertDialog Builder
                AlertDialog.Builder resultadoAlertDialog = new AlertDialog.Builder(IngresaGestionActivity.this);

                //Set a title for alert dialog
                resultadoAlertDialog.setTitle("Seleccione Un Resultado");

                //Initialize a new String Array
                final String[] Resultado = new String[]{
                        "Entraga Documentación", "No Recibe Documentación", "No Vive Allí", "Otro",
                };

                //Set a list of items to be displayed in the dialog as the content
                //It will render a single choice traditional list on alert dialog
                resultadoAlertDialog.setItems(Resultado, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        //This 'which' argument carry the list selected item's index position
                        String clickedResultadoValue = Arrays.asList(Resultado).get(which);
                        //Set the TextView text color corresponded to the user selected color
                        resultadoSeleccionado.setText(clickedResultadoValue);
                    }
                });

                //Display the Alert Dialog on app interface
                resultadoAlertDialog.show();
            }
        });


        tomarFotoGestionBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView fotoCargada = (TextView) findViewById(R.id.fotoCargada);

                SimpleDateFormat timeStampFormat = new SimpleDateFormat("yyyyMMddHHmmssSS");
                Date myDate = new Date();
                String filename = timeStampFormat.format(myDate);

                Intent cameraIntent = new Intent(
                        android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                //Creamos una carpeta en la memeria del terminal
                File imagesFolder = new File(
                        Environment.getExternalStorageDirectory(), "Localiza");
                imagesFolder.mkdirs();
                //añadimos el nombre de la imagen
                File image = new File(imagesFolder, "foto"+ nombreClie+"_"+filename+".jpg");
                Uri uriSavedImage = Uri.fromFile(image);
                //Le decimos al Intent que queremos grabar la imagen
                cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, uriSavedImage);
                //Lanzamos la aplicacion de la camara con retorno (forResult)
                startActivityForResult(cameraIntent, 1);
                fotoCargada.setText("Foto guardada con éxito");

            }});

        ingComentarioGestionBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Get widgets reference from XML layout
                final TextView comentarioGestion = (TextView) findViewById(R.id.comentarioGestion);

                final AlertDialog.Builder comenatrioAlertDialog = new AlertDialog.Builder(IngresaGestionActivity.this);

                comenatrioAlertDialog.setTitle("Ingresar Comentario");
                comenatrioAlertDialog.setMessage("Ingrese información que usted considere Importante");

                // Set an EditText view to get user input
                final EditText comentarioInput = new EditText(IngresaGestionActivity.this);

                comenatrioAlertDialog.setView(comentarioInput);
                comentarioInput.setText(comentarioGestion.getText());

                comenatrioAlertDialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {

                        String comentarioOutput = comentarioInput.getText().toString();
                        comentarioGestion.setText(comentarioOutput);
                    }
                });

                comenatrioAlertDialog.setNegativeButton("Cancel",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int whichButton) {
                                // Canceled.
                            }
                        });
                comenatrioAlertDialog.show();
            }
        });

        confirmarIngGestionBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IngresaGestionActivity .this,FinGestionActivity.class);

                intent.putExtra("idClie",idClie);
                intent.putExtra("nombreGest", nombreGest);
                intent.putExtra("nombreClie",nombreClie);
                intent.putExtra("direccionClie", direccionClie);

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
