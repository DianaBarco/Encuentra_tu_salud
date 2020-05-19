package com.upb.apphospital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ServiciosOfrecidosHosp extends AppCompatActivity implements View.OnClickListener {
    private ImageButton inicioServiciosOfrecidos;
    private Button continuarServiciosOfrecidos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicios_ofrecidos_hosp);

        inicioServiciosOfrecidos=(ImageButton) findViewById(R.id.inicioServiciosOfrecidos);
        inicioServiciosOfrecidos.setOnClickListener(this);

        continuarServiciosOfrecidos=(Button) findViewById(R.id.continuarServicios);
        continuarServiciosOfrecidos.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent intencion=null;

        switch (View.generateViewId()){
            case R.id.inicioServiciosOfrecidos:
                intencion= new Intent(this, ServiciosHospital.class);
                break;

            case  R.id.continuarServicios:
                intencion= new Intent(this, ServiciosHospital.class);
                break;
            default:

        }
        startActivity(intencion);
    }
}
