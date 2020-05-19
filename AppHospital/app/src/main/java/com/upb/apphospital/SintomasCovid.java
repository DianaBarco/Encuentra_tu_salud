package com.upb.apphospital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class SintomasCovid extends AppCompatActivity implements View.OnClickListener{
    private ImageButton inicioSintomas;
    private Button continuarSintomas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sintomas_covid);

        inicioSintomas=(ImageButton) findViewById(R.id.inicioSintomas);
        inicioSintomas.setOnClickListener(this);

        continuarSintomas=(Button) findViewById(R.id.continuarTiempo);
        continuarSintomas.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent intencion= null;

        switch (View.generateViewId()){
            case R.id.inicioSintomas:
                intencion= new Intent(this, ServiciosHospital.class);
                break;

            case  R.id.continuarTiempo:
                intencion= new Intent(this, ServiciosHospital.class);
                break;
            default:

        }
        startActivity(intencion);
    }
}
