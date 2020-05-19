package com.upb.apphospital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class InformacionHospital extends AppCompatActivity implements View.OnClickListener{
    private ImageButton inicioInfo;
    private Button continuarInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion_hospital);

        inicioInfo=(ImageButton) findViewById(R.id.inicioInfoHospital);
        inicioInfo.setOnClickListener(this);

        continuarInfo=(Button) findViewById(R.id.continuarInfo);
        continuarInfo.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Intent intencion= null;

        switch (View.generateViewId()){
            case R.id.inicioInfoHospital:
                intencion= new Intent(this, ServiciosHospital.class);
                break;

            case  R.id.continuarInfo:
                intencion= new Intent(this, ServiciosHospital.class);
                break;
            default:

        }
        startActivity(intencion);
    }
}

