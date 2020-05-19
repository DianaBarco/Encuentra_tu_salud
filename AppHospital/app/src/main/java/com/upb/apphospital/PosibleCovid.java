package com.upb.apphospital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class PosibleCovid extends AppCompatActivity implements View.OnClickListener{
    private ImageButton inicioPosibleCovid;
    private Button salirPosibleCovid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_posible_covid);

        inicioPosibleCovid=(ImageButton) findViewById(R.id.inicioPosibleCovid);
        inicioPosibleCovid.setOnClickListener(this);

        salirPosibleCovid=(Button) findViewById(R.id.continuarPosibleCovid);
        salirPosibleCovid.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Intent intencion= null;

        switch (View.generateViewId()){
            case R.id.inicioPosibleCovid:
                intencion= new Intent(this, ServiciosHospital.class);
                break;

            case  R.id.continuarPosibleCovid:
                intencion= new Intent(this, ServiciosHospital.class);
                break;
            default:

        }
        startActivity(intencion);
    }
}
