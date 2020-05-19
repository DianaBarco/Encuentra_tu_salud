package com.upb.apphospital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class TiempoSintomas extends AppCompatActivity implements View.OnClickListener {
    private ImageButton inicioTiempo;
    private Button continuarTiempo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiempo_sintomas);

        inicioTiempo=(ImageButton) findViewById(R.id.inicioTiempo);
        inicioTiempo.setOnClickListener(this);

        continuarTiempo=(Button) findViewById(R.id.continuarTiempo);
        continuarTiempo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent intencion= null;

        switch (View.generateViewId()){
            case R.id.inicioTiempo:
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
