package com.upb.apphospital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Switch;

public class SinPosibleCovid extends AppCompatActivity implements View.OnClickListener {
    private ImageButton inicioSinCovid;
    private Button continuarSinCovid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sin_posible_covid);

        inicioSinCovid=(ImageButton) findViewById(R.id.inicioSinCovid);
        inicioSinCovid.setOnClickListener(this);

        continuarSinCovid=(Button) findViewById(R.id.continuarSinCovid);
        continuarSinCovid.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent intencion=null;

        switch (View.generateViewId()){
            case R.id.inicioSinCovid:
                intencion= new Intent(this, ServiciosHospital.class);
                break;

            case  R.id.continuarSinCovid:
                intencion= new Intent(this, ServiciosHospital.class);
                break;
            default:

        }
        startActivity(intencion);
    }
}
