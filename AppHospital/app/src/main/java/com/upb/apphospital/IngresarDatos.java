package com.upb.apphospital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class IngresarDatos extends AppCompatActivity implements View.OnClickListener{
private Button registrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresar_datos);

        registrar=(Button)findViewById(R.id.registrar);
        registrar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intencion= new Intent(this, ServiciosHospital.class);

        startActivity(intencion);
    }

}
