package com.upb.apphospital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;



public class Creditos extends AppCompatActivity implements View.OnClickListener{
    private ImageButton inicioCreditos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creditos);

        inicioCreditos=(ImageButton) findViewById(R.id.inicioCreditos);
        inicioCreditos.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent intencion= new Intent(this, Login.class);

        startActivity(intencion);
    }

}
