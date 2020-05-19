package com.upb.apphospital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Switch;

public class ServiciosHospital extends AppCompatActivity implements View.OnClickListener{
    private ImageButton inicioServicio;
    private Button covid;
    private Button servicioHospital;
    private Button infoHospital;
    private Button salir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicios_hospital);

        inicioServicio=(ImageButton) findViewById(R.id.inicioServiciosHospital);
        inicioServicio.setOnClickListener(this);

        covid=(Button) findViewById(R.id.covid19);
        covid.setOnClickListener(this);

        servicioHospital=(Button) findViewById(R.id.serviciosHospital);
        servicioHospital.setOnClickListener(this);

        infoHospital=(Button) findViewById(R.id.infoHospital);
        infoHospital.setOnClickListener(this);

        salir=(Button) findViewById(R.id.salir);
        salir.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent intencion=null;

        switch (View.generateViewId()){
            case R.id.inicioServiciosHospital:
                intencion= new Intent(this, ServiciosHospital.class);
                break;

            case  R.id.covid19:
                intencion= new Intent(this, SintomasCovid.class);
                break;

            case R.id.serviciosHospital:
                intencion= new Intent(this, ServiciosOfrecidosHosp.class);
                break;

            case  R.id.infoHospital:
                intencion= new Intent(this, InformacionHospital.class);
                break;

            case  R.id.salir:
                finish();
                break;

            default:

        }
        startActivity(intencion);
    }
}
